package com.proto.sum;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: sum/sum.proto")
public final class SumGrpc {

  private SumGrpc() {}

  public static final String SERVICE_NAME = "sum.Sum";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.sum.SumGrpcRequest,
      com.proto.sum.SumGrpcResponse> getSumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Sum",
      requestType = com.proto.sum.SumGrpcRequest.class,
      responseType = com.proto.sum.SumGrpcResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.sum.SumGrpcRequest,
      com.proto.sum.SumGrpcResponse> getSumMethod() {
    io.grpc.MethodDescriptor<com.proto.sum.SumGrpcRequest, com.proto.sum.SumGrpcResponse> getSumMethod;
    if ((getSumMethod = SumGrpc.getSumMethod) == null) {
      synchronized (SumGrpc.class) {
        if ((getSumMethod = SumGrpc.getSumMethod) == null) {
          SumGrpc.getSumMethod = getSumMethod =
              io.grpc.MethodDescriptor.<com.proto.sum.SumGrpcRequest, com.proto.sum.SumGrpcResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Sum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.sum.SumGrpcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.sum.SumGrpcResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SumMethodDescriptorSupplier("Sum"))
              .build();
        }
      }
    }
    return getSumMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SumStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SumStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SumStub>() {
        @java.lang.Override
        public SumStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SumStub(channel, callOptions);
        }
      };
    return SumStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SumBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SumBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SumBlockingStub>() {
        @java.lang.Override
        public SumBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SumBlockingStub(channel, callOptions);
        }
      };
    return SumBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SumFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SumFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SumFutureStub>() {
        @java.lang.Override
        public SumFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SumFutureStub(channel, callOptions);
        }
      };
    return SumFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SumImplBase implements io.grpc.BindableService {

    /**
     */
    public void sum(com.proto.sum.SumGrpcRequest request,
        io.grpc.stub.StreamObserver<com.proto.sum.SumGrpcResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSumMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSumMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.sum.SumGrpcRequest,
                com.proto.sum.SumGrpcResponse>(
                  this, METHODID_SUM)))
          .build();
    }
  }

  /**
   */
  public static final class SumStub extends io.grpc.stub.AbstractAsyncStub<SumStub> {
    private SumStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SumStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SumStub(channel, callOptions);
    }

    /**
     */
    public void sum(com.proto.sum.SumGrpcRequest request,
        io.grpc.stub.StreamObserver<com.proto.sum.SumGrpcResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSumMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SumBlockingStub extends io.grpc.stub.AbstractBlockingStub<SumBlockingStub> {
    private SumBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SumBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SumBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.sum.SumGrpcResponse sum(com.proto.sum.SumGrpcRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSumMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SumFutureStub extends io.grpc.stub.AbstractFutureStub<SumFutureStub> {
    private SumFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SumFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SumFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.sum.SumGrpcResponse> sum(
        com.proto.sum.SumGrpcRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSumMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUM = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SumImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SumImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUM:
          serviceImpl.sum((com.proto.sum.SumGrpcRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.sum.SumGrpcResponse>) responseObserver);
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

  private static abstract class SumBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SumBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.sum.SumOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Sum");
    }
  }

  private static final class SumFileDescriptorSupplier
      extends SumBaseDescriptorSupplier {
    SumFileDescriptorSupplier() {}
  }

  private static final class SumMethodDescriptorSupplier
      extends SumBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SumMethodDescriptorSupplier(String methodName) {
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
      synchronized (SumGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SumFileDescriptorSupplier())
              .addMethod(getSumMethod())
              .build();
        }
      }
    }
    return result;
  }
}
