package de.opitzconsulting.boot.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by mbu on 22.03.17.
 */
@Controller
@EnableAutoConfiguration
@SpringBootApplication
public class EchoController {

    @Value("${crypto.value}")
    private String value;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String echo() {
        return value;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(EchoController.class, args);
    }
}
