package demo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by eMko on 3.3.2015.
 */
@RestController
public class GreetingsController {

    @RequestMapping("/hello")
    public String hello() {
        return hello("World");
    }

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
}
