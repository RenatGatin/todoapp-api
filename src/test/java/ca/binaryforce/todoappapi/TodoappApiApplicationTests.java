package ca.binaryforce.todoappapi;

import org.junit.jupiter.api.Test;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ActiveProfiles("test")
class TodoappApiApplicationTests {

    @Test
    void contextLoads() {
        assertTrue(true);
    }

}
