package org.own.springtest;

import java.util.Set;

public interface CourseService {
    
    public Course course(final Integer id);
    public void create(final Course course);
    public Set<Course> findAll();
    public void enroll(final Course course, final Student student) throws Exception;

}