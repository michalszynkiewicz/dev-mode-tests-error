package com.example;

import io.quarkus.grpc.GrpcClient;
import io.quarkus.test.junit.QuarkusTest;
import io.smallrye.mutiny.Uni;
import org.junit.jupiter.api.Test;

import java.time.Duration;

@QuarkusTest
public class FooTest {
    @GrpcClient
    Foo foo;


    @Test
    void shouldFoo() {
        Uni<MyNew.Dto> ping = foo.ping(MyNew.Dto.newBuilder().build());
        ping.await().atMost(Duration.ofSeconds(5));
    }
//    @Test
//    void shouldFoo2() {
//        Uni<MyNew.Dto> ping = foo.ping(MyNew.Dto.newBuilder().build());
//        ping.await().atMost(Duration.ofSeconds(5));
//        assert 1 == 0;
//    }
}
