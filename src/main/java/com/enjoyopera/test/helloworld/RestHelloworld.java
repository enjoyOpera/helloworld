package com.enjoyopera.test.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHelloworld {

    @GetMapping("/")
    public String welcome() {
        return "welcome to testHelloworld";
    }

    @GetMapping("/{name}")
    public String welcomeName(@PathVariable String name) {
        return "welcome to helloworld, " + name + "!";
    }

}
