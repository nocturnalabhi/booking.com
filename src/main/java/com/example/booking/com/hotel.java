package com.example.booking.com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class hotel {
    @GetMapping("/hotel")
    public String getData()
    {
        return  " hotel rates are  at 20 % discount";
    }
}
