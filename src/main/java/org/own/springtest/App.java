package org.own.springtest;

import java.io.FileInputStream;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {

        final BeanFactory factory = new XmlBeanFactory(new FileInputStream("src\\main\\java\\org\\own\\springtest\\hello.xml"));
    }
}