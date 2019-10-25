package org.own.springtest;

public class Student {
    private String id;
    private String name;
    private String lastname;
    private Integer Course;

    public Student(String id,String name, String lastname, Integer course) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        Course = course;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getCourse() {
        return Course;
    }

    public void setCourse(Integer course) {
        Course = course;
    }

    @Override
    public String toString() {
        return "Student [Id: "+ id + "Course=" + Course + ", lastname=" + lastname + ", name=" + name + "]";
    }

    
    
}