package org.own.springtest;

public interface Quest<T> {
    T embark() throws GrailNotFoundException;
}