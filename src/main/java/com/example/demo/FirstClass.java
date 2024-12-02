package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class FirstClass {



   public FirstClass()
    {

        System.out.println("First Class Constructor");
    }

    public  void  firstMethod()
    {
        System.out.println("FirstClass first method");
    }
}
