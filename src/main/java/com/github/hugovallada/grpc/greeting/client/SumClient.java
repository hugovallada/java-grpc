package com.github.hugovallada.grpc.greeting.client;

import com.proto.sum.SumGrpc;
import com.proto.sum.SumGrpcRequest;
import io.grpc.ManagedChannelBuilder;

public class SumClient {
    public static void main(String[] args) {
        var channel = ManagedChannelBuilder.forAddress("localhost",50051)
                .usePlaintext().build();

        var stub = SumGrpc.newBlockingStub(channel);

        var response = stub.sum(SumGrpcRequest.newBuilder()
        .setNumberOne(10).setNumberTwo(3).build());

        System.out.println(response);
    }

}
