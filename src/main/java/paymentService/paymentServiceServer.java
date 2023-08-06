package paymentService;

import java.util.Properties;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import paymentService.paymentGrpc.paymentImplBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;

//it has to extend the service name from the proto file ImplBase
public class paymentServiceServer extends paymentImplBase{
	
//logger to show server side logs in the console, the logger instance will be used to log different events at the server console
	private static final Logger logger = Logger.getLogger(paymentServiceServer.class.getName());

		//main method which contains the logic to start the server.
		public static void main(String [] args) {
			
		//instance of the paymentServiceServer class
		paymentServiceServer paymentServer = new paymentServiceServer();
		
		//get server properties from the bookingService properties file
		Properties properties = paymentServer.getProperties();
		
		//register the server
		paymentServer.registerService(properties);
		
		
		//port number where server will be listening for clients
		int port = Integer.valueOf( properties.getProperty("service_port") );
		System.out.println("\nPort number " + port);
		
		//create a server on the specific port and attach the service paymentServer to it, build the server and start it
		//the server is kept running so the clients can contact it until is externally terminated
		
		try {
			Server server = ServerBuilder.forPort(port).addService(paymentServer).build().start();
			//log information on the server console that the server has started 
			logger.info("Server started and listening on port " + port );
				
			try {
				server.awaitTermination();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		 
		
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
		
		//get properties
		private Properties getProperties() {
			Properties properties = null;
			try (InputStream input = new FileInputStream("src/main/resources/paymentService.properties")) {

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

	

}//class
