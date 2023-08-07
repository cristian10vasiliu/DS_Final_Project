package patientManagementService;

import java.util.logging.Logger;

import bookingService.bookingGrpc;
import bookingService.bookingServiceClient;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

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
			//changend the port number to 50053- for patient management service
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
			
			logger.info("client connection established " + channel.toString() );
			
			//the stubs will be generated from the proto files
			blockingStub = patientManagementGrpc.newBlockingStub(channel);
			asyncStub = patientManagementGrpc.newStub(channel);
			
			addRecords();
			
			//closing the channel after the message was passed
			channel.shutdown();
			

		}//main method
		
		//client add records method
		public static void addRecords() {
			StreamObserver<addResponse> responseObserver = new StreamObserver<addResponse>() {

				@Override
				public void onNext(addResponse request) {
					System.out.println(request.getIsSuccessful());
				}

				@Override
				public void onError(Throwable t) {
					System.out.println(t.getMessage());
					
				}

				@Override
				public void onCompleted() {
					System.out.println("Stream is compleated");
					
				}
				
			};
			//calling the remote add records method
			StreamObserver<addRequest> requestObserver = asyncStub.addRecords(responseObserver);
			
				
				try {
					requestObserver.onNext(addRequest.newBuilder().setPatientName("Don Doodle").setAge(25).setAddress("Caine Street").build());
					Thread.sleep(500);
					
					requestObserver.onNext(addRequest.newBuilder().setPatientName("Marie Curie").setAge(22).setAddress("Chemist Lane").build());
					Thread.sleep(500);
					
					requestObserver.onNext(addRequest.newBuilder().setPatientName("Tommy Furry").setAge(28).setAddress("Peace Boulevard").build());
					Thread.sleep(500);
					
					// Mark the end of requests
					requestObserver.onCompleted();
					Thread.sleep(500);
					
					
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				
				
				
			
		}
		
		
}//class
