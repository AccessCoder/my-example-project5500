package org.example.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dupliclass {

    @GetMapping
    public void getDuplicates() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");



        int i =1;


        if ((i=4) == 5){
            System.out.println("Hello World");
        }
    }
}
