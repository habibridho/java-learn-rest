package com.habibridho.learn_rest.controllers;

import com.habibridho.learn_rest.model.Health;
import com.habibridho.learn_rest.model.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @RequestMapping(path = "/ping", method = RequestMethod.GET)
    public Response<Health> ping(@RequestParam(name = "msg", defaultValue = "") String message) {
        if (message.isEmpty()) {
            message = "pong";
        }

        Health health = new Health(message);

        return new Response<>("OK", health);
    }

}
