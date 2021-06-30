package com.github.hugovallada.grpc.greeting.server;

import com.proto.sum.SumGrpc;
import com.proto.sum.SumGrpcRequest;
import com.proto.sum.SumGrpcResponse;
import io.grpc.stub.StreamObserver;

public class SumServiceEndpoint extends SumGrpc.SumImplBase {

    @Override
    public void sum(SumGrpcRequest request, StreamObserver<SumGrpcResponse> responseObserver) {
        var resultado = request.getNumberOne() + request.getNumberTwo();
        responseObserver.onNext(SumGrpcResponse.newBuilder().setResult(resultado).build());
        responseObserver.onCompleted();
    }
}
