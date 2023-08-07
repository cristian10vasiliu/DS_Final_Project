package bookingService;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.Properties;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

//import com.distributed_systems.BookingService.loginResponse;

import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import bookingService.bookingGrpc.bookingImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import paymentService.paymentServiceServer;

public class bookingServiceServer extends bookingImplBase {
	//logger to show server side logs in the console, the logger instance will be used to log different events at the server console
		private static final Logger logger = Logger.getLogger(bookingServiceServer.class.getName());

		//main method which contains the logic to start the server.
		public static void main(String [] args) {
			
			//instance of the paymentServiceServer class
			bookingServiceServer bookingServer = new bookingServiceServer();
			
			//get server properties from the bookingService properties file
			Properties properties = bookingServer.getProperties();
			
			//register the server
			bookingServer.registerService(properties);
			
			//port number where server will be listening for clients
			int port = Integer.valueOf( properties.getProperty("service_port") );
			System.out.println("\nPort number " + port);
			//create a server on the specific port and attach the service bookingServer to it, build the server and start it
			//the server is kept running so the clients can contact it until is externally terminated
			//as it is throwing checked exceptions we need to declare that the method is throwing the specific exceptions or use try catch statements
			
			try {
				
				Server server = ServerBuilder.forPort(port).addService(bookingServer).build().start();
				//log information on the server console that the server has started 
				logger.info("Server started and listening on port " + port );	
				server.awaitTermination();	
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("exception in io");
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("Intrerupted exception");
				e.printStackTrace();
			} 
			 
			

		}//main method
		
		// java implementation  of multi-cast domain name system
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
				
				Thread.sleep(1000);
				//to unregister the service
				jmdns.unregisterAllServices();
				
			} catch (IOException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}//register service
		
		//get properties
		private Properties getProperties() {
			Properties properties = null;
			try (InputStream input = new FileInputStream("src/main/resources/bookingService.properties")) {

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
	        	System.out.println("Can not acces the file!");
	            ex.printStackTrace();
	        }
	
		 return properties;
	}//get properties
		
		//login RPC method
		@Override
		public void login(loginRequest request, StreamObserver<loginResponse> responseObserver) {
			System.out.println(" Received Login Credentials");
			//i assumed the password and username for that record, stored in the database are this
			
			String dataBaseUserName ="xyz";
			String dataBasePassword = "abc";
			
			//get the username and password from the requested login
			String userName = request.getUserName();
			String password = request.getPassword();
			
			
			String loginMessage ;
			
			//first check if the username it is not in the database
			if(!userName.equals(dataBaseUserName)) {
				loginMessage = "No records found for " + userName;
			} else { //if the username it is in the database
				//check if the password is correct
				if(password.equals(dataBasePassword)) {
					loginMessage = "Login Successful!";
				} else {
					loginMessage = "Invalid Password!";
				}
			}//if statement
			
			//build the response
			loginResponse response = loginResponse.newBuilder().setResponseMessage(loginMessage).build();
			
			//sending the reply , for each request
			responseObserver.onNext(response);
			responseObserver.onCompleted();
			
		}//login
		
		
		
}//class
