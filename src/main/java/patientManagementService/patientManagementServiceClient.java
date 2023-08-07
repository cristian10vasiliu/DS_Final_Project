package patientManagementService;

import java.util.logging.Logger;

import bookingService.bookingGrpc;
import bookingService.bookingServiceClient;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class patientManagementServiceClient {
	//create a logger
		private static  Logger logger = Logger.getLogger(patientManagementServiceClient.class.getName());
		
		// to be able to connect with our server we need to create stubs on the client side
		//a blocking stub ,synchronous, (will block the current running thread) until the rpc call returns a response or gets an exception 	
		private static patientManagementGrpc.patientManagementBlockingStub blockingStub;
		//the response is returned asynchronous 
		private static patientManagementGrpc.patientManagementStub asyncStub;

		public static void main(String [] args) {
			
			
			//create a channel that connects with the grpc server
			//to establish connection we need to provide the server name and port
			//usePlaintext denotes it is a unsecured channel
			
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
			
			logger.info("client connection established " + channel.toString() );
			
			//the stubs will be generated from the proto files
			blockingStub = patientManagementGrpc.newBlockingStub(channel);
			asyncStub = patientManagementGrpc.newStub(channel);

		}//main method
		
}//class
