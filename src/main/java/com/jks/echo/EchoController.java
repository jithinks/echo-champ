package com.jks.echo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/echo")
@Slf4j
public class EchoController {

    @GetMapping("/v1/{name}")
    public String echoV1(@PathVariable String name){
        log.info("echo request received:{}", name);
        return "Hello "+name;
    }

    @GetMapping("/v2/{name}")
    public String echoV2(@PathVariable String name){
        log.info("echo request received:{}", name);
        return "Hello "+name+". Awesome work!!";
    }
}
