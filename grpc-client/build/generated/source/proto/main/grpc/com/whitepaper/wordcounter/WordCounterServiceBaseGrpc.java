package com.whitepaper.wordcounter;

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
public final class WordCounterServiceBaseGrpc {

  private WordCounterServiceBaseGrpc() {}

  public static final String SERVICE_NAME = "wordcounter.WordCounterServiceBase";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.whitepaper.wordcounter.CountRequest,
      com.whitepaper.wordcounter.CountResponse> getCountWordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "countWords",
      requestType = com.whitepaper.wordcounter.CountRequest.class,
      responseType = com.whitepaper.wordcounter.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.whitepaper.wordcounter.CountRequest,
      com.whitepaper.wordcounter.CountResponse> getCountWordsMethod() {
    io.grpc.MethodDescriptor<com.whitepaper.wordcounter.CountRequest, com.whitepaper.wordcounter.CountResponse> getCountWordsMethod;
    if ((getCountWordsMethod = WordCounterServiceBaseGrpc.getCountWordsMethod) == null) {
      synchronized (WordCounterServiceBaseGrpc.class) {
        if ((getCountWordsMethod = WordCounterServiceBaseGrpc.getCountWordsMethod) == null) {
          WordCounterServiceBaseGrpc.getCountWordsMethod = getCountWordsMethod =
              io.grpc.MethodDescriptor.<com.whitepaper.wordcounter.CountRequest, com.whitepaper.wordcounter.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "countWords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.whitepaper.wordcounter.CountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.whitepaper.wordcounter.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WordCounterServiceBaseMethodDescriptorSupplier("countWords"))
              .build();
        }
      }
    }
    return getCountWordsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WordCounterServiceBaseStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WordCounterServiceBaseStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WordCounterServiceBaseStub>() {
        @java.lang.Override
        public WordCounterServiceBaseStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WordCounterServiceBaseStub(channel, callOptions);
        }
      };
    return WordCounterServiceBaseStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WordCounterServiceBaseBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WordCounterServiceBaseBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WordCounterServiceBaseBlockingStub>() {
        @java.lang.Override
        public WordCounterServiceBaseBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WordCounterServiceBaseBlockingStub(channel, callOptions);
        }
      };
    return WordCounterServiceBaseBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WordCounterServiceBaseFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WordCounterServiceBaseFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WordCounterServiceBaseFutureStub>() {
        @java.lang.Override
        public WordCounterServiceBaseFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WordCounterServiceBaseFutureStub(channel, callOptions);
        }
      };
    return WordCounterServiceBaseFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class WordCounterServiceBaseImplBase implements io.grpc.BindableService {

    /**
     */
    public void countWords(com.whitepaper.wordcounter.CountRequest request,
        io.grpc.stub.StreamObserver<com.whitepaper.wordcounter.CountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCountWordsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCountWordsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.whitepaper.wordcounter.CountRequest,
                com.whitepaper.wordcounter.CountResponse>(
                  this, METHODID_COUNT_WORDS)))
          .build();
    }
  }

  /**
   */
  public static final class WordCounterServiceBaseStub extends io.grpc.stub.AbstractAsyncStub<WordCounterServiceBaseStub> {
    private WordCounterServiceBaseStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WordCounterServiceBaseStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WordCounterServiceBaseStub(channel, callOptions);
    }

    /**
     */
    public void countWords(com.whitepaper.wordcounter.CountRequest request,
        io.grpc.stub.StreamObserver<com.whitepaper.wordcounter.CountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCountWordsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WordCounterServiceBaseBlockingStub extends io.grpc.stub.AbstractBlockingStub<WordCounterServiceBaseBlockingStub> {
    private WordCounterServiceBaseBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WordCounterServiceBaseBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WordCounterServiceBaseBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.whitepaper.wordcounter.CountResponse countWords(com.whitepaper.wordcounter.CountRequest request) {
      return blockingUnaryCall(
          getChannel(), getCountWordsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WordCounterServiceBaseFutureStub extends io.grpc.stub.AbstractFutureStub<WordCounterServiceBaseFutureStub> {
    private WordCounterServiceBaseFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WordCounterServiceBaseFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WordCounterServiceBaseFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.whitepaper.wordcounter.CountResponse> countWords(
        com.whitepaper.wordcounter.CountRequest request) {
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
    private final WordCounterServiceBaseImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WordCounterServiceBaseImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COUNT_WORDS:
          serviceImpl.countWords((com.whitepaper.wordcounter.CountRequest) request,
              (io.grpc.stub.StreamObserver<com.whitepaper.wordcounter.CountResponse>) responseObserver);
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

  private static abstract class WordCounterServiceBaseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WordCounterServiceBaseBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.whitepaper.wordcounter.WordCounter.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WordCounterServiceBase");
    }
  }

  private static final class WordCounterServiceBaseFileDescriptorSupplier
      extends WordCounterServiceBaseBaseDescriptorSupplier {
    WordCounterServiceBaseFileDescriptorSupplier() {}
  }

  private static final class WordCounterServiceBaseMethodDescriptorSupplier
      extends WordCounterServiceBaseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WordCounterServiceBaseMethodDescriptorSupplier(String methodName) {
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
      synchronized (WordCounterServiceBaseGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WordCounterServiceBaseFileDescriptorSupplier())
              .addMethod(getCountWordsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
