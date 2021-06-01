package com.example;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class FooTest {

    @Test
    void shouldFoo2() throws InterruptedException {
        int i = 0;
        int j = i+1;
        for (int k = 0; k < 2; k++) {
            j++;
        }
        assert j == i;
    }
}
