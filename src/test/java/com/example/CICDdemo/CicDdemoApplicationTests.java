package com.example.CICDdemo;

import com.example.HelloController;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HelloControllerTest {

    @Test
    void helloReturnsGreeting() {
        String result = new HelloController().hello();
        assertTrue(result.startsWith("Hello, GitHub Actions!"));
    }
}
