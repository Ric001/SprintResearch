package org.own.springtest;

import java.util.Set;

public interface StudentService 
{
    public Student student(final String id);
    public void create(final Student student);
    public Set<Course> completedCourses(final Student student); 
}