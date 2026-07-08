package com.example.pipeline_adh;

import org.springframework.web.bind.annotation.GetMapping;

public class hotelbooking {
    @GetMapping("/hotelbooking")
    public String getName() {
        return "Book your hotel as soon as possible";
    }
}
