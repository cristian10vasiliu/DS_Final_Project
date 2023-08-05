package patientManagementService;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: managementService.proto")
public final class patientManagementGrpc {

  private patientManagementGrpc() {}

  public static final String SERVICE_NAME = "patientManagement";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<patientManagementService.addRequest,
      patientManagementService.addResponse> getAddRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addRecords",
      requestType = patientManagementService.addRequest.class,
      responseType = patientManagementService.addResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<patientManagementService.addRequest,
      patientManagementService.addResponse> getAddRecordsMethod() {
    io.grpc.MethodDescriptor<patientManagementService.addRequest, patientManagementService.addResponse> getAddRecordsMethod;
    if ((getAddRecordsMethod = patientManagementGrpc.getAddRecordsMethod) == null) {
      synchronized (patientManagementGrpc.class) {
        if ((getAddRecordsMethod = patientManagementGrpc.getAddRecordsMethod) == null) {
          patientManagementGrpc.getAddRecordsMethod = getAddRecordsMethod = 
              io.grpc.MethodDescriptor.<patientManagementService.addRequest, patientManagementService.addResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "patientManagement", "addRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  patientManagementService.addRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  patientManagementService.addResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new patientManagementMethodDescriptorSupplier("addRecords"))
                  .build();
          }
        }
     }
     return getAddRecordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<patientManagementService.updateRequest,
      patientManagementService.updateResponse> getUpdateRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateRecord",
      requestType = patientManagementService.updateRequest.class,
      responseType = patientManagementService.updateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<patientManagementService.updateRequest,
      patientManagementService.updateResponse> getUpdateRecordMethod() {
    io.grpc.MethodDescriptor<patientManagementService.updateRequest, patientManagementService.updateResponse> getUpdateRecordMethod;
    if ((getUpdateRecordMethod = patientManagementGrpc.getUpdateRecordMethod) == null) {
      synchronized (patientManagementGrpc.class) {
        if ((getUpdateRecordMethod = patientManagementGrpc.getUpdateRecordMethod) == null) {
          patientManagementGrpc.getUpdateRecordMethod = getUpdateRecordMethod = 
              io.grpc.MethodDescriptor.<patientManagementService.updateRequest, patientManagementService.updateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "patientManagement", "updateRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  patientManagementService.updateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  patientManagementService.updateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new patientManagementMethodDescriptorSupplier("updateRecord"))
                  .build();
          }
        }
     }
     return getUpdateRecordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<patientManagementService.deleteRecordRequest,
      patientManagementService.deleteRecordResponse> getDeleteRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteRecord",
      requestType = patientManagementService.deleteRecordRequest.class,
      responseType = patientManagementService.deleteRecordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<patientManagementService.deleteRecordRequest,
      patientManagementService.deleteRecordResponse> getDeleteRecordMethod() {
    io.grpc.MethodDescriptor<patientManagementService.deleteRecordRequest, patientManagementService.deleteRecordResponse> getDeleteRecordMethod;
    if ((getDeleteRecordMethod = patientManagementGrpc.getDeleteRecordMethod) == null) {
      synchronized (patientManagementGrpc.class) {
        if ((getDeleteRecordMethod = patientManagementGrpc.getDeleteRecordMethod) == null) {
          patientManagementGrpc.getDeleteRecordMethod = getDeleteRecordMethod = 
              io.grpc.MethodDescriptor.<patientManagementService.deleteRecordRequest, patientManagementService.deleteRecordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "patientManagement", "deleteRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  patientManagementService.deleteRecordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  patientManagementService.deleteRecordResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new patientManagementMethodDescriptorSupplier("deleteRecord"))
                  .build();
          }
        }
     }
     return getDeleteRecordMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static patientManagementStub newStub(io.grpc.Channel channel) {
    return new patientManagementStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static patientManagementBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new patientManagementBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static patientManagementFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new patientManagementFutureStub(channel);
  }

  /**
   */
  public static abstract class patientManagementImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *first RPC add a patient record
     * </pre>
     */
    public io.grpc.stub.StreamObserver<patientManagementService.addRequest> addRecords(
        io.grpc.stub.StreamObserver<patientManagementService.addResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getAddRecordsMethod(), responseObserver);
    }

    /**
     * <pre>
     *second RPC update a record
     * </pre>
     */
    public io.grpc.stub.StreamObserver<patientManagementService.updateRequest> updateRecord(
        io.grpc.stub.StreamObserver<patientManagementService.updateResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getUpdateRecordMethod(), responseObserver);
    }

    /**
     * <pre>
     *delete a record RPC
     * </pre>
     */
    public void deleteRecord(patientManagementService.deleteRecordRequest request,
        io.grpc.stub.StreamObserver<patientManagementService.deleteRecordResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteRecordMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddRecordsMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                patientManagementService.addRequest,
                patientManagementService.addResponse>(
                  this, METHODID_ADD_RECORDS)))
          .addMethod(
            getUpdateRecordMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                patientManagementService.updateRequest,
                patientManagementService.updateResponse>(
                  this, METHODID_UPDATE_RECORD)))
          .addMethod(
            getDeleteRecordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                patientManagementService.deleteRecordRequest,
                patientManagementService.deleteRecordResponse>(
                  this, METHODID_DELETE_RECORD)))
          .build();
    }
  }

  /**
   */
  public static final class patientManagementStub extends io.grpc.stub.AbstractStub<patientManagementStub> {
    private patientManagementStub(io.grpc.Channel channel) {
      super(channel);
    }

    private patientManagementStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected patientManagementStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new patientManagementStub(channel, callOptions);
    }

    /**
     * <pre>
     *first RPC add a patient record
     * </pre>
     */
    public io.grpc.stub.StreamObserver<patientManagementService.addRequest> addRecords(
        io.grpc.stub.StreamObserver<patientManagementService.addResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getAddRecordsMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *second RPC update a record
     * </pre>
     */
    public io.grpc.stub.StreamObserver<patientManagementService.updateRequest> updateRecord(
        io.grpc.stub.StreamObserver<patientManagementService.updateResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getUpdateRecordMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *delete a record RPC
     * </pre>
     */
    public void deleteRecord(patientManagementService.deleteRecordRequest request,
        io.grpc.stub.StreamObserver<patientManagementService.deleteRecordResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteRecordMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class patientManagementBlockingStub extends io.grpc.stub.AbstractStub<patientManagementBlockingStub> {
    private patientManagementBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private patientManagementBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected patientManagementBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new patientManagementBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *delete a record RPC
     * </pre>
     */
    public patientManagementService.deleteRecordResponse deleteRecord(patientManagementService.deleteRecordRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteRecordMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class patientManagementFutureStub extends io.grpc.stub.AbstractStub<patientManagementFutureStub> {
    private patientManagementFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private patientManagementFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected patientManagementFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new patientManagementFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *delete a record RPC
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<patientManagementService.deleteRecordResponse> deleteRecord(
        patientManagementService.deleteRecordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteRecordMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DELETE_RECORD = 0;
  private static final int METHODID_ADD_RECORDS = 1;
  private static final int METHODID_UPDATE_RECORD = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final patientManagementImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(patientManagementImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DELETE_RECORD:
          serviceImpl.deleteRecord((patientManagementService.deleteRecordRequest) request,
              (io.grpc.stub.StreamObserver<patientManagementService.deleteRecordResponse>) responseObserver);
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
        case METHODID_ADD_RECORDS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.addRecords(
              (io.grpc.stub.StreamObserver<patientManagementService.addResponse>) responseObserver);
        case METHODID_UPDATE_RECORD:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.updateRecord(
              (io.grpc.stub.StreamObserver<patientManagementService.updateResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class patientManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    patientManagementBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return patientManagementService.patientManagementServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("patientManagement");
    }
  }

  private static final class patientManagementFileDescriptorSupplier
      extends patientManagementBaseDescriptorSupplier {
    patientManagementFileDescriptorSupplier() {}
  }

  private static final class patientManagementMethodDescriptorSupplier
      extends patientManagementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    patientManagementMethodDescriptorSupplier(String methodName) {
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
      synchronized (patientManagementGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new patientManagementFileDescriptorSupplier())
              .addMethod(getAddRecordsMethod())
              .addMethod(getUpdateRecordMethod())
              .addMethod(getDeleteRecordMethod())
              .build();
        }
      }
    }
    return result;
  }
}
