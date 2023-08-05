package paymentService;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 *first service with three remote procedure calls
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: paymentService.proto")
public final class paymentGrpc {

  private paymentGrpc() {}

  public static final String SERVICE_NAME = "payment";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<paymentService.paymentRequest,
      paymentService.paymentResponse> getMakePaymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "makePayment",
      requestType = paymentService.paymentRequest.class,
      responseType = paymentService.paymentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<paymentService.paymentRequest,
      paymentService.paymentResponse> getMakePaymentMethod() {
    io.grpc.MethodDescriptor<paymentService.paymentRequest, paymentService.paymentResponse> getMakePaymentMethod;
    if ((getMakePaymentMethod = paymentGrpc.getMakePaymentMethod) == null) {
      synchronized (paymentGrpc.class) {
        if ((getMakePaymentMethod = paymentGrpc.getMakePaymentMethod) == null) {
          paymentGrpc.getMakePaymentMethod = getMakePaymentMethod = 
              io.grpc.MethodDescriptor.<paymentService.paymentRequest, paymentService.paymentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "payment", "makePayment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  paymentService.paymentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  paymentService.paymentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new paymentMethodDescriptorSupplier("makePayment"))
                  .build();
          }
        }
     }
     return getMakePaymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<paymentService.paymentHistoryRequest,
      paymentService.paymentHistoryResponse> getPaymentHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "paymentHistory",
      requestType = paymentService.paymentHistoryRequest.class,
      responseType = paymentService.paymentHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<paymentService.paymentHistoryRequest,
      paymentService.paymentHistoryResponse> getPaymentHistoryMethod() {
    io.grpc.MethodDescriptor<paymentService.paymentHistoryRequest, paymentService.paymentHistoryResponse> getPaymentHistoryMethod;
    if ((getPaymentHistoryMethod = paymentGrpc.getPaymentHistoryMethod) == null) {
      synchronized (paymentGrpc.class) {
        if ((getPaymentHistoryMethod = paymentGrpc.getPaymentHistoryMethod) == null) {
          paymentGrpc.getPaymentHistoryMethod = getPaymentHistoryMethod = 
              io.grpc.MethodDescriptor.<paymentService.paymentHistoryRequest, paymentService.paymentHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "payment", "paymentHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  paymentService.paymentHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  paymentService.paymentHistoryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new paymentMethodDescriptorSupplier("paymentHistory"))
                  .build();
          }
        }
     }
     return getPaymentHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<paymentService.generateInvoiceRequest,
      paymentService.generateInvoiceRequestResponse> getGenerateInvoiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "generateInvoice",
      requestType = paymentService.generateInvoiceRequest.class,
      responseType = paymentService.generateInvoiceRequestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<paymentService.generateInvoiceRequest,
      paymentService.generateInvoiceRequestResponse> getGenerateInvoiceMethod() {
    io.grpc.MethodDescriptor<paymentService.generateInvoiceRequest, paymentService.generateInvoiceRequestResponse> getGenerateInvoiceMethod;
    if ((getGenerateInvoiceMethod = paymentGrpc.getGenerateInvoiceMethod) == null) {
      synchronized (paymentGrpc.class) {
        if ((getGenerateInvoiceMethod = paymentGrpc.getGenerateInvoiceMethod) == null) {
          paymentGrpc.getGenerateInvoiceMethod = getGenerateInvoiceMethod = 
              io.grpc.MethodDescriptor.<paymentService.generateInvoiceRequest, paymentService.generateInvoiceRequestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "payment", "generateInvoice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  paymentService.generateInvoiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  paymentService.generateInvoiceRequestResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new paymentMethodDescriptorSupplier("generateInvoice"))
                  .build();
          }
        }
     }
     return getGenerateInvoiceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static paymentStub newStub(io.grpc.Channel channel) {
    return new paymentStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static paymentBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new paymentBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static paymentFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new paymentFutureStub(channel);
  }

  /**
   * <pre>
   *first service with three remote procedure calls
   * </pre>
   */
  public static abstract class paymentImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *first RPC user to make a payment
     * </pre>
     */
    public void makePayment(paymentService.paymentRequest request,
        io.grpc.stub.StreamObserver<paymentService.paymentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMakePaymentMethod(), responseObserver);
    }

    /**
     * <pre>
     *second RPC view the payment history
     * </pre>
     */
    public void paymentHistory(paymentService.paymentHistoryRequest request,
        io.grpc.stub.StreamObserver<paymentService.paymentHistoryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPaymentHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     *generate invoice for the payment RPC
     * </pre>
     */
    public void generateInvoice(paymentService.generateInvoiceRequest request,
        io.grpc.stub.StreamObserver<paymentService.generateInvoiceRequestResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGenerateInvoiceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMakePaymentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                paymentService.paymentRequest,
                paymentService.paymentResponse>(
                  this, METHODID_MAKE_PAYMENT)))
          .addMethod(
            getPaymentHistoryMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                paymentService.paymentHistoryRequest,
                paymentService.paymentHistoryResponse>(
                  this, METHODID_PAYMENT_HISTORY)))
          .addMethod(
            getGenerateInvoiceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                paymentService.generateInvoiceRequest,
                paymentService.generateInvoiceRequestResponse>(
                  this, METHODID_GENERATE_INVOICE)))
          .build();
    }
  }

  /**
   * <pre>
   *first service with three remote procedure calls
   * </pre>
   */
  public static final class paymentStub extends io.grpc.stub.AbstractStub<paymentStub> {
    private paymentStub(io.grpc.Channel channel) {
      super(channel);
    }

    private paymentStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected paymentStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new paymentStub(channel, callOptions);
    }

    /**
     * <pre>
     *first RPC user to make a payment
     * </pre>
     */
    public void makePayment(paymentService.paymentRequest request,
        io.grpc.stub.StreamObserver<paymentService.paymentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMakePaymentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *second RPC view the payment history
     * </pre>
     */
    public void paymentHistory(paymentService.paymentHistoryRequest request,
        io.grpc.stub.StreamObserver<paymentService.paymentHistoryResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getPaymentHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *generate invoice for the payment RPC
     * </pre>
     */
    public void generateInvoice(paymentService.generateInvoiceRequest request,
        io.grpc.stub.StreamObserver<paymentService.generateInvoiceRequestResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGenerateInvoiceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *first service with three remote procedure calls
   * </pre>
   */
  public static final class paymentBlockingStub extends io.grpc.stub.AbstractStub<paymentBlockingStub> {
    private paymentBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private paymentBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected paymentBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new paymentBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *first RPC user to make a payment
     * </pre>
     */
    public paymentService.paymentResponse makePayment(paymentService.paymentRequest request) {
      return blockingUnaryCall(
          getChannel(), getMakePaymentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *second RPC view the payment history
     * </pre>
     */
    public java.util.Iterator<paymentService.paymentHistoryResponse> paymentHistory(
        paymentService.paymentHistoryRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getPaymentHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *generate invoice for the payment RPC
     * </pre>
     */
    public paymentService.generateInvoiceRequestResponse generateInvoice(paymentService.generateInvoiceRequest request) {
      return blockingUnaryCall(
          getChannel(), getGenerateInvoiceMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *first service with three remote procedure calls
   * </pre>
   */
  public static final class paymentFutureStub extends io.grpc.stub.AbstractStub<paymentFutureStub> {
    private paymentFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private paymentFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected paymentFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new paymentFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *first RPC user to make a payment
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<paymentService.paymentResponse> makePayment(
        paymentService.paymentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMakePaymentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *generate invoice for the payment RPC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<paymentService.generateInvoiceRequestResponse> generateInvoice(
        paymentService.generateInvoiceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGenerateInvoiceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MAKE_PAYMENT = 0;
  private static final int METHODID_PAYMENT_HISTORY = 1;
  private static final int METHODID_GENERATE_INVOICE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final paymentImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(paymentImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MAKE_PAYMENT:
          serviceImpl.makePayment((paymentService.paymentRequest) request,
              (io.grpc.stub.StreamObserver<paymentService.paymentResponse>) responseObserver);
          break;
        case METHODID_PAYMENT_HISTORY:
          serviceImpl.paymentHistory((paymentService.paymentHistoryRequest) request,
              (io.grpc.stub.StreamObserver<paymentService.paymentHistoryResponse>) responseObserver);
          break;
        case METHODID_GENERATE_INVOICE:
          serviceImpl.generateInvoice((paymentService.generateInvoiceRequest) request,
              (io.grpc.stub.StreamObserver<paymentService.generateInvoiceRequestResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class paymentBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    paymentBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return paymentService.paymentServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("payment");
    }
  }

  private static final class paymentFileDescriptorSupplier
      extends paymentBaseDescriptorSupplier {
    paymentFileDescriptorSupplier() {}
  }

  private static final class paymentMethodDescriptorSupplier
      extends paymentBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    paymentMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (paymentGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new paymentFileDescriptorSupplier())
              .addMethod(getMakePaymentMethod())
              .addMethod(getPaymentHistoryMethod())
              .addMethod(getGenerateInvoiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
