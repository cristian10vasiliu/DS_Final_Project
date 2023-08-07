//import the package 
package bookingService;


import java.util.logging.Logger;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class bookingServiceClient {
	
	//create a logger
	private static  Logger logger = Logger.getLogger(bookingServiceClient.class.getName());
	
	// to be able to connect with our server we need to create stubs on the client side
	//a blocking stub ,synchronous, (will block the current running thread) until the rpc call returns a response or gets an exception 	
	private static bookingGrpc.bookingBlockingStub blockingStub;
	//the response is returned asynchronous 
	private static bookingGrpc.bookingStub asyncStub;

	public static void main(String [] args) {
		
		
		//create a channel that connects with the grpc server
		//to establish connection we need to provide the server name and port
		//usePlaintext denotes it is a unsecured channel
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50055).usePlaintext().build();
		
		logger.info("client connection established " + channel.toString() );	
		//the stubs will be generated from the proto files
		blockingStub = bookingGrpc.newBlockingStub(channel);
		asyncStub = bookingGrpc.newStub(channel);
		
		//unary rpc call
		login();
		
		//closing the channel after the message was passed
		channel.shutdown();
		
	}//main method
	
	public static void login() {
		//first we need to create a request message
		loginRequest request = loginRequest.newBuilder().setUserName("xyz").setPassword("abc").build();
		
		//calling the remote rpc using blocking stub, passing the login request
		//and get the response message/login response from it
		loginResponse response = blockingStub.login(request);
		
		System.out.println(response.getResponseMessage());
	}//login
	
	
}//class
