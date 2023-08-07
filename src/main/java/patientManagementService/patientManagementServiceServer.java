package patientManagementService;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import patientManagementService.patientManagementGrpc.patientManagementImplBase;
import paymentService.paymentServiceServer;

public class patientManagementServiceServer extends patientManagementImplBase {

	
		private static final Logger logger = Logger.getLogger(patientManagementServiceServer.class.getName());
		//array to represent the existing list of records 
		ArrayList<Record> databaseRecords = new ArrayList<Record>();
		
		public static void main(String [] args) {
			
		
			patientManagementServiceServer patientManagementServer = new patientManagementServiceServer();
		
			//get server properties from the bookingService properties file
			Properties properties = patientManagementServer.getProperties();
			
			//register the server
			patientManagementServer.registerService(properties);
			
			//port number where server will be listening for clients
			int port = Integer.valueOf( properties.getProperty("service_port") );
			System.out.println("\nPort number " + port);

			
			try {
				Server server = ServerBuilder.forPort(port).addService(patientManagementServer).build().start();
				logger.info("Server started and is listening on port " + port );
				
				server.awaitTermination();	
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			//list with records from the data base, mock data
			ArrayList<Record> databaseRecords = new ArrayList<>();
			databaseRecords.add(new Record("Jon Jinx",32,"Sunset Boulevard"));
			databaseRecords.add(new Record("Ada Lone",22,"Stripe Street"));
			databaseRecords.add(new Record("Michael Fox",55,"KillTown Avenue"));
			
			
		}//main method
		 
			private void registerService(Properties properties) {
				
				try {
					//instance of JmDNS using create -throws IOexception -checked exception
					//bind it to the local host interface
					JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
					//get the service type from the properties file
					String serviceType = properties.getProperty("service_type") ;
					//get the service name from the properties file
					String serviceName = properties.getProperty("service_name") ;
					//get the service description
					String serviceDescription = properties.getProperty("service_description");
					//get the service port
					int servicePort =  Integer.valueOf( properties.getProperty("service_port") );
					
					//create a service description for registering with JmDNS
					ServiceInfo service = ServiceInfo.create(serviceType, serviceName, servicePort, serviceDescription);
					
					//register the service
					jmdns.registerService(service);
					
					System.out.printf("Registering service with this info: \nName of service: %s \nType of service: %s \nService description: %s",serviceName,serviceType,serviceDescription);
					
					//to unregister the service
					//jdmns.unregisterAllAervices();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}//register service
			
			private Properties getProperties() {
				Properties properties = null;
				try (InputStream input = new FileInputStream("src/main/resources/managementService.properties")) {

					properties = new Properties();

		            // load a properties file
					properties.load(input);

		            // get the property values and print them out
		            System.out.println("Booking Service properties:");
		            System.out.println("\t service_type: " + properties.getProperty("service_type"));
		            System.out.println("\t service_name: " +properties.getProperty("service_name"));
		            System.out.println("\t service_description: " +properties.getProperty("service_description"));
			        System.out.println("\t service_port: " +properties.getProperty("service_port"));

		        } catch (IOException ex) {
		            ex.printStackTrace();
		        }
		
			 return properties;
		}//get properties

			//server implementation for add records RPC
			@Override
			public StreamObserver<addRequest> addRecords(StreamObserver<addResponse> responseObserver) {
				// TODO Auto-generated method stub
				
				
				return new StreamObserver<addRequest>() {
					ArrayList<Record> recordsToAdd = new ArrayList<>();
					
				
					@Override
					public void onNext(addRequest request) {
						//print request message
						System.out.println("Add Records RPC. Receiving request: " + request);
						
						//every time when we get a request , the request values
						//are passed to a constructor  to initialize a new record
						//and the new created record is added to the list of records to be added
						String patientName = request.getPatientName();
						int age = request.getAge();
						String address = request.getAddress();
						
						//we create a new record and add it to the list
						recordsToAdd.add(new Record(patientName,age,address));
					}

					@Override
					public void onError(Throwable t) {
						//print error message
						System.out.println(t.getMessage());	
					}

					@Override
					public void onCompleted() {
						System.out.println("We received " + recordsToAdd.size() + " records to add to the database" );
						//print the name of the patients/records to add
						for(int i = 0; i < recordsToAdd.size(); i++) {
							System.out.println("Record number " + i + " is " + recordsToAdd.get(i).getPatientName());
						}
						
						//add the records to the list 
						databaseRecords.addAll(recordsToAdd);
						
						//construct the response
						addResponse response = addResponse.newBuilder().setIsSuccessful(true).build();
						responseObserver.onNext(response);
						responseObserver.onCompleted();
						
					}
				};
			}

			//server implementation for delete a record RPC	
			@Override
			public void deleteRecord(deleteRecordRequest request,
					StreamObserver<deleteRecordResponse> responseObserver) {
				//print the name of the patient name from the record to be deleted
				System.out.println("delete the record of patient with name " + request.getPatientName());
				
				// we start with the assumption assume that the database does not have any duplicate names/records
				//boolean flag true if the patient name has a record in database, false if it is not found
				//index of the record , if the record is found then we save his index so we can remove the record
				int index = -1;
				boolean recordFound = false;
				for (int i = 0; i < databaseRecords.size();i++) {
					if( databaseRecords.get(i).getPatientName().equalsIgnoreCase(request.getPatientName())) {
						recordFound = true;
						index = i;
					}
					
				}//for loop
				
				//constructing the apply for the client
				//if the record is found, then remove the record and set the value of the response to true
				deleteRecordResponse response;
				if(recordFound){
					databaseRecords.remove(index);
					response = deleteRecordResponse.newBuilder().setDeleteSuccessful(true).build();
				} else {
					response = deleteRecordResponse.newBuilder().setDeleteSuccessful(false).build();
				}
				
				//sending the reply for each request
				responseObserver.onNext(response);
				
				responseObserver.onCompleted();
				
			}//delete record
					
			
			
				
	
	
}//class

class Record{
	//instance variables
	private String patientName;
	private int age;
	private String address;
	
	//Constructor
	
	
	//getters and setters 
	public String getPatientName() {
		return patientName;
	}
	
	public Record(String patientName, int age, String address) {
		this.patientName = patientName;
		this.age = age;
		this.address = address;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}//record class
