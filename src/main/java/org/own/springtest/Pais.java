package org.own.springtest;

public class Pais {
    private Ciudad city;

    private void init() {
        System.out.println("======================== Before Bean Creation: " + Pais.class.getName());
    }
    
    private void destroy() 
    {
        System.out.println("========================== Destroying Bean: " + Pais.class.getName());
    }

    public Ciudad getCity() {
        return city;
    }

    public void setCity(Ciudad city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Pais [city=" + city + "]";
    }

    
}