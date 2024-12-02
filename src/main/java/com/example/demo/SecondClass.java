package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class SecondClass {



   public SecondClass()
    {
        System.out.println("Second Class Constructor");
    }

    public  void  secondMethod()
    {
        System.out.println("SecondClass and first class  method");
    }
}
