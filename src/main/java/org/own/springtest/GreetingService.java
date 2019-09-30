package org.own.springtest;

public class GreetingService implements IGreeting {

    private String greeting;

    public void setGreeting(String greeting) {
        this.greeting = greeting;
        
    }

    @Override
    public void sayGreeting() {
        System.out.println(greeting);
    }

    
}