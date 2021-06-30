package com.github.hugovallada.grpc.greeting.server;

import com.proto.greet.GreetRequest;
import com.proto.greet.GreetResponse;
import com.proto.greet.GreetServiceGrpc.GreetServiceImplBase;
import io.grpc.stub.StreamObserver;

public class GreetServiceEndpoint extends GreetServiceImplBase {

    @Override
    public void greet(GreetRequest request, StreamObserver<GreetResponse> responseObserver) {

        var greeting = request.getGreeting();

         var result = "Olá " + greeting.getFirstName() + " " + greeting.getLastName();

        responseObserver.onNext(GreetResponse.newBuilder().setResult(result).build());
        responseObserver.onCompleted();
    }
}
