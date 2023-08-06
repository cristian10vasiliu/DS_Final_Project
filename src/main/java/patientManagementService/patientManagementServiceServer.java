package patientManagementService;

import java.io.IOException;
import java.util.logging.Logger;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import patientManagementService.patientManagementGrpc.patientManagementImplBase;
import paymentService.paymentServiceServer;

public class patientManagementServiceServer extends patientManagementImplBase {

	
		private static final Logger logger = Logger.getLogger(patientManagementServiceServer.class.getName());

		
		public static void main(String [] args) {
			
		
			patientManagementServiceServer patientManagementServer = new patientManagementServiceServer();
		
			int port = 50053;

			
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
		 
			
			
			
		}//main method
	
	
}//class
