package paymentService;

import java.util.logging.Logger;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import paymentService.paymentGrpc.paymentImplBase;
import java.io.IOException;

//it has to extend the service name from the proto file ImplBase
public class paymentServiceServer extends paymentImplBase{
	
//logger to show server side logs in the console, the logger instance will be used to log different events at the server console
	private static final Logger logger = Logger.getLogger(paymentServiceServer.class.getName());

		//main method which contains the logic to start the server.
		public static void main(String [] args) {
			
		//instance of the paymentServiceServer class
		paymentServiceServer paymentServer = new paymentServiceServer();
		
		//port number where server will be listening for clients
		int port = 50051;
		
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


	

}//class
