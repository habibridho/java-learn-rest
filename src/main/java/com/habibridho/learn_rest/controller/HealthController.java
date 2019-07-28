package com.habibridho.learn_rest.controller;

import com.habibridho.learn_rest.model.Health;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @RequestMapping(path = "/ping", method = RequestMethod.GET)
    public Health ping(@RequestParam(name = "msg", defaultValue = "") String message) {
        if (message.isEmpty()) {
            message = "pong";
        }

        return new Health(message);
    }

}
