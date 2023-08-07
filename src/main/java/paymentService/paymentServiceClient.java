package paymentService;

import java.util.logging.Logger;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import patientManagementService.patientManagementGrpc;
import patientManagementService.patientManagementServiceClient;

public class paymentServiceClient {
	
	private static  Logger logger = Logger.getLogger(patientManagementServiceClient.class.getName());
	private static paymentGrpc.paymentBlockingStub blockingStub;
	private static paymentGrpc.paymentStub asyncStub;
	
	
	public static void main(String [] args) {
		
		
		
		//changend the port number to 50051- for payment service
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
		
		logger.info("client connection established " + channel.toString() );
		
		
		blockingStub = paymentGrpc.newBlockingStub(channel);
		asyncStub = paymentGrpc.newStub(channel);

	}//main method
	
	
}//class
