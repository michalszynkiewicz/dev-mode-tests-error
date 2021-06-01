package com.example;

import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;

@GrpcService
public class FooService implements Foo{
    @Override
    public Uni<MyNew.Dto> ping(MyNew.Dto request) {
        return Uni.createFrom().item(MyNew.Dto.newBuilder().build());
    }
}
