package org.own.springtest;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

public class App 
{
    public static void main( String[] args ) throws Exception
    {

        final BeanFactory beanFactory = new XmlBeanFactory(new App().getClass().getResourceAsStream("knight.xml"));
        final KnightOfTheRoundTable knight = (KnightOfTheRoundTable) beanFactory.getBean("knight");
        knight.embarkOnQuest();
    }
}