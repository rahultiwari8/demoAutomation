package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RunningClass {

    @Autowired
    private FirstClass firstClass;
    @Autowired
    private SecondClass secondClass;

//   public RunningClass(FirstClass firstClass)
//
//    {
//        this.firstClass = firstClass;
//    }
//
//    @Autowired
//    public RunningClass(FirstClass firstClass, SecondClass secondClass)
//
//    {
//        this.firstClass = firstClass;
//        this.secondClass  = secondClass;
//    }

    public void getSecondMehtod()
    {
        firstClass.firstMethod();
        secondClass.secondMethod();
    }
}
