package ca.binaryforce.todoappapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    /**
     * Lint requires this Java comment.
     *
     * @return some sample test
     */
    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello Binary World!";
    }
}
