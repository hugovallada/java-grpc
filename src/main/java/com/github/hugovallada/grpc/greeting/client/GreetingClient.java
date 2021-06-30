package com.github.hugovallada.grpc.greeting.client;

import com.proto.dummy.DummyServiceGrpc;
import com.proto.greet.GreetRequest;
import com.proto.greet.GreetServiceGrpc;
import com.proto.greet.Greeting;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GreetingClient {

    public static void main(String[] args) {
        System.out.println("Hello I'm a gRPC client");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();

        System.out.println("Ceating stub");

        var greetClient = GreetServiceGrpc.newBlockingStub(channel);


        var response = greetClient.greet(GreetRequest.newBuilder().setGreeting(Greeting.newBuilder().setFirstName("Hugo").setLastName("Lopes").build()).build());
        System.out.println(response.getResult());

        System.out.println("Shutting down channel");
        channel.shutdown();
    }

}
