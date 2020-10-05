package com.whitepaper;

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
    value = "by gRPC proto compiler (version 1.32.1)",
    comments = "Source: word_counter.proto")
public final class WordCounterServiceGrpc {

  private WordCounterServiceGrpc() {}

  public static final String SERVICE_NAME = "wordcounter.WordCounterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.whitepaper.CountRequest,
      com.whitepaper.CountResponse> getCountWordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "countWords",
      requestType = com.whitepaper.CountRequest.class,
      responseType = com.whitepaper.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.whitepaper.CountRequest,
      com.whitepaper.CountResponse> getCountWordsMethod() {
    io.grpc.MethodDescriptor<com.whitepaper.CountRequest, com.whitepaper.CountResponse> getCountWordsMethod;
    if ((getCountWordsMethod = WordCounterServiceGrpc.getCountWordsMethod) == null) {
      synchronized (WordCounterServiceGrpc.class) {
        if ((getCountWordsMethod = WordCounterServiceGrpc.getCountWordsMethod) == null) {
          WordCounterServiceGrpc.getCountWordsMethod = getCountWordsMethod =
              io.grpc.MethodDescriptor.<com.whitepaper.CountRequest, com.whitepaper.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "countWords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.whitepaper.CountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.whitepaper.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WordCounterServiceMethodDescriptorSupplier("countWords"))
              .build();
        }
      }
    }
    return getCountWordsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WordCounterServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WordCounterServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WordCounterServiceStub>() {
        @java.lang.Override
        public WordCounterServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WordCounterServiceStub(channel, callOptions);
        }
      };
    return WordCounterServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WordCounterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WordCounterServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WordCounterServiceBlockingStub>() {
        @java.lang.Override
        public WordCounterServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WordCounterServiceBlockingStub(channel, callOptions);
        }
      };
    return WordCounterServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WordCounterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WordCounterServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WordCounterServiceFutureStub>() {
        @java.lang.Override
        public WordCounterServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WordCounterServiceFutureStub(channel, callOptions);
        }
      };
    return WordCounterServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class WordCounterServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void countWords(com.whitepaper.CountRequest request,
        io.grpc.stub.StreamObserver<com.whitepaper.CountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCountWordsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCountWordsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.whitepaper.CountRequest,
                com.whitepaper.CountResponse>(
                  this, METHODID_COUNT_WORDS)))
          .build();
    }
  }

  /**
   */
  public static final class WordCounterServiceStub extends io.grpc.stub.AbstractAsyncStub<WordCounterServiceStub> {
    private WordCounterServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WordCounterServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WordCounterServiceStub(channel, callOptions);
    }

    /**
     */
    public void countWords(com.whitepaper.CountRequest request,
        io.grpc.stub.StreamObserver<com.whitepaper.CountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCountWordsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WordCounterServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<WordCounterServiceBlockingStub> {
    private WordCounterServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WordCounterServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WordCounterServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.whitepaper.CountResponse countWords(com.whitepaper.CountRequest request) {
      return blockingUnaryCall(
          getChannel(), getCountWordsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WordCounterServiceFutureStub extends io.grpc.stub.AbstractFutureStub<WordCounterServiceFutureStub> {
    private WordCounterServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WordCounterServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WordCounterServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.whitepaper.CountResponse> countWords(
        com.whitepaper.CountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCountWordsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_COUNT_WORDS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WordCounterServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WordCounterServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COUNT_WORDS:
          serviceImpl.countWords((com.whitepaper.CountRequest) request,
              (io.grpc.stub.StreamObserver<com.whitepaper.CountResponse>) responseObserver);
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

  private static abstract class WordCounterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WordCounterServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.whitepaper.WordCounter.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WordCounterService");
    }
  }

  private static final class WordCounterServiceFileDescriptorSupplier
      extends WordCounterServiceBaseDescriptorSupplier {
    WordCounterServiceFileDescriptorSupplier() {}
  }

  private static final class WordCounterServiceMethodDescriptorSupplier
      extends WordCounterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WordCounterServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (WordCounterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WordCounterServiceFileDescriptorSupplier())
              .addMethod(getCountWordsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
