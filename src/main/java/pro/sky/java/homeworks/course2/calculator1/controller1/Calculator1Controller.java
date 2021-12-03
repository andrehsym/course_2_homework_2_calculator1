package pro.sky.java.homeworks.course2.calculator1.controller1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator1Controller {

    @GetMapping
    public String hello() {
        return "Hello";
    }
}
