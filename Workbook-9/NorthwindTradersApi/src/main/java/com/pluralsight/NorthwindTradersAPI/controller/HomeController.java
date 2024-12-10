package com.pluralsight.NorthwindTradersAPI.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String index(@RequestParam(required = false, name = "country", defaultValue = "World") String country) {
        if (country == null || country.isEmpty()) {
            return "Hello World!";
        } else {
            return "Hello " + country ;
        }
    }
}