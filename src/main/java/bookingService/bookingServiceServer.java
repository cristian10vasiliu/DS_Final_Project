package bookingService;

import java.io.IOException;
import java.util.logging.Logger;

import bookingService.bookingGrpc.bookingImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import paymentService.paymentServiceServer;

public class bookingServiceServer extends bookingImplBase {
	//logger to show server side logs in the console, the logger instance will be used to log different events at the server console
		private static final Logger logger = Logger.getLogger(bookingServiceServer.class.getName());

		//main method which contains the logic to start the server.
		public static void main(String [] args) {
			
			//instance of the paymentServiceServer class
			bookingServiceServer bookingServer = new bookingServiceServer();
			
			//port number where server will be listening for clients
			int port = 50052;
			
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
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			 
			

		}//main method
}//class
