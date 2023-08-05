package bookingService;

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
    comments = "Source: bookingService.proto")
public final class bookingGrpc {

  private bookingGrpc() {}

  public static final String SERVICE_NAME = "booking";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bookingService.loginRequest,
      bookingService.loginResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = bookingService.loginRequest.class,
      responseType = bookingService.loginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bookingService.loginRequest,
      bookingService.loginResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<bookingService.loginRequest, bookingService.loginResponse> getLoginMethod;
    if ((getLoginMethod = bookingGrpc.getLoginMethod) == null) {
      synchronized (bookingGrpc.class) {
        if ((getLoginMethod = bookingGrpc.getLoginMethod) == null) {
          bookingGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<bookingService.loginRequest, bookingService.loginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "booking", "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bookingService.loginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bookingService.loginResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new bookingMethodDescriptorSupplier("login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bookingService.appointmentRequest,
      bookingService.appointmentResponse> getBookAppointmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bookAppointment",
      requestType = bookingService.appointmentRequest.class,
      responseType = bookingService.appointmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bookingService.appointmentRequest,
      bookingService.appointmentResponse> getBookAppointmentMethod() {
    io.grpc.MethodDescriptor<bookingService.appointmentRequest, bookingService.appointmentResponse> getBookAppointmentMethod;
    if ((getBookAppointmentMethod = bookingGrpc.getBookAppointmentMethod) == null) {
      synchronized (bookingGrpc.class) {
        if ((getBookAppointmentMethod = bookingGrpc.getBookAppointmentMethod) == null) {
          bookingGrpc.getBookAppointmentMethod = getBookAppointmentMethod = 
              io.grpc.MethodDescriptor.<bookingService.appointmentRequest, bookingService.appointmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "booking", "bookAppointment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bookingService.appointmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bookingService.appointmentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new bookingMethodDescriptorSupplier("bookAppointment"))
                  .build();
          }
        }
     }
     return getBookAppointmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bookingService.cancelAppointmentRequest,
      bookingService.cancelAppointmentResponse> getCancelAppointmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cancelAppointment",
      requestType = bookingService.cancelAppointmentRequest.class,
      responseType = bookingService.cancelAppointmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bookingService.cancelAppointmentRequest,
      bookingService.cancelAppointmentResponse> getCancelAppointmentMethod() {
    io.grpc.MethodDescriptor<bookingService.cancelAppointmentRequest, bookingService.cancelAppointmentResponse> getCancelAppointmentMethod;
    if ((getCancelAppointmentMethod = bookingGrpc.getCancelAppointmentMethod) == null) {
      synchronized (bookingGrpc.class) {
        if ((getCancelAppointmentMethod = bookingGrpc.getCancelAppointmentMethod) == null) {
          bookingGrpc.getCancelAppointmentMethod = getCancelAppointmentMethod = 
              io.grpc.MethodDescriptor.<bookingService.cancelAppointmentRequest, bookingService.cancelAppointmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "booking", "cancelAppointment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bookingService.cancelAppointmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bookingService.cancelAppointmentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new bookingMethodDescriptorSupplier("cancelAppointment"))
                  .build();
          }
        }
     }
     return getCancelAppointmentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static bookingStub newStub(io.grpc.Channel channel) {
    return new bookingStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static bookingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new bookingBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static bookingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new bookingFutureStub(channel);
  }

  /**
   * <pre>
   *first service with three remote procedure calls
   * </pre>
   */
  public static abstract class bookingImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *first RPC user login
     * </pre>
     */
    public void login(bookingService.loginRequest request,
        io.grpc.stub.StreamObserver<bookingService.loginResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     * <pre>
     *second RPC book an appointment
     * </pre>
     */
    public void bookAppointment(bookingService.appointmentRequest request,
        io.grpc.stub.StreamObserver<bookingService.appointmentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBookAppointmentMethod(), responseObserver);
    }

    /**
     * <pre>
     *cancel an appointment RPC
     * </pre>
     */
    public void cancelAppointment(bookingService.cancelAppointmentRequest request,
        io.grpc.stub.StreamObserver<bookingService.cancelAppointmentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCancelAppointmentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                bookingService.loginRequest,
                bookingService.loginResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getBookAppointmentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                bookingService.appointmentRequest,
                bookingService.appointmentResponse>(
                  this, METHODID_BOOK_APPOINTMENT)))
          .addMethod(
            getCancelAppointmentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                bookingService.cancelAppointmentRequest,
                bookingService.cancelAppointmentResponse>(
                  this, METHODID_CANCEL_APPOINTMENT)))
          .build();
    }
  }

  /**
   * <pre>
   *first service with three remote procedure calls
   * </pre>
   */
  public static final class bookingStub extends io.grpc.stub.AbstractStub<bookingStub> {
    private bookingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private bookingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected bookingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new bookingStub(channel, callOptions);
    }

    /**
     * <pre>
     *first RPC user login
     * </pre>
     */
    public void login(bookingService.loginRequest request,
        io.grpc.stub.StreamObserver<bookingService.loginResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *second RPC book an appointment
     * </pre>
     */
    public void bookAppointment(bookingService.appointmentRequest request,
        io.grpc.stub.StreamObserver<bookingService.appointmentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBookAppointmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *cancel an appointment RPC
     * </pre>
     */
    public void cancelAppointment(bookingService.cancelAppointmentRequest request,
        io.grpc.stub.StreamObserver<bookingService.cancelAppointmentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCancelAppointmentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *first service with three remote procedure calls
   * </pre>
   */
  public static final class bookingBlockingStub extends io.grpc.stub.AbstractStub<bookingBlockingStub> {
    private bookingBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private bookingBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected bookingBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new bookingBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *first RPC user login
     * </pre>
     */
    public bookingService.loginResponse login(bookingService.loginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *second RPC book an appointment
     * </pre>
     */
    public bookingService.appointmentResponse bookAppointment(bookingService.appointmentRequest request) {
      return blockingUnaryCall(
          getChannel(), getBookAppointmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *cancel an appointment RPC
     * </pre>
     */
    public bookingService.cancelAppointmentResponse cancelAppointment(bookingService.cancelAppointmentRequest request) {
      return blockingUnaryCall(
          getChannel(), getCancelAppointmentMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *first service with three remote procedure calls
   * </pre>
   */
  public static final class bookingFutureStub extends io.grpc.stub.AbstractStub<bookingFutureStub> {
    private bookingFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private bookingFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected bookingFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new bookingFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *first RPC user login
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bookingService.loginResponse> login(
        bookingService.loginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *second RPC book an appointment
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bookingService.appointmentResponse> bookAppointment(
        bookingService.appointmentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBookAppointmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *cancel an appointment RPC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bookingService.cancelAppointmentResponse> cancelAppointment(
        bookingService.cancelAppointmentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCancelAppointmentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_BOOK_APPOINTMENT = 1;
  private static final int METHODID_CANCEL_APPOINTMENT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final bookingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(bookingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((bookingService.loginRequest) request,
              (io.grpc.stub.StreamObserver<bookingService.loginResponse>) responseObserver);
          break;
        case METHODID_BOOK_APPOINTMENT:
          serviceImpl.bookAppointment((bookingService.appointmentRequest) request,
              (io.grpc.stub.StreamObserver<bookingService.appointmentResponse>) responseObserver);
          break;
        case METHODID_CANCEL_APPOINTMENT:
          serviceImpl.cancelAppointment((bookingService.cancelAppointmentRequest) request,
              (io.grpc.stub.StreamObserver<bookingService.cancelAppointmentResponse>) responseObserver);
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

  private static abstract class bookingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    bookingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bookingService.bookingServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("booking");
    }
  }

  private static final class bookingFileDescriptorSupplier
      extends bookingBaseDescriptorSupplier {
    bookingFileDescriptorSupplier() {}
  }

  private static final class bookingMethodDescriptorSupplier
      extends bookingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    bookingMethodDescriptorSupplier(String methodName) {
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
      synchronized (bookingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new bookingFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .addMethod(getBookAppointmentMethod())
              .addMethod(getCancelAppointmentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
