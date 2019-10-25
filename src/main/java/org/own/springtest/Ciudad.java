package org.own.springtest;

public class Ciudad {

    private String name;

    public void init() 
    {
        System.out.println("==================> Init <================" + Ciudad.class.getName());
    }
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ciudad [name=" + name + "]";
    }    
}
