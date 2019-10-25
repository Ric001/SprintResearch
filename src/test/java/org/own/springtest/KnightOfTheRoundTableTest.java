package org.own.springtest;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

import junit.framework.TestCase;

public class KnightOfTheRoundTableTest extends TestCase {

    @Test
    public void testEmbarkOnQuest() {
        final BeanFactory factory = new XmlBeanFactory(getClass().getResourceAsStream("knight.xml"));
        final KnightOfTheRoundTable knight = (KnightOfTheRoundTable) factory.getBean("knight");
    
        try {
            final HolyGrail grail = (HolyGrail) knight.embarkOnQuest(); 
            assertNotNull(knight);
            assertNotNull(grail);
            assertTrue(grail.isHoly());
            assertNotNull(knight.getName());
            assertEquals(knight.getName(), "Artemis");

        } catch (GrailNotFoundException e) { 
            e.printStackTrace(); 
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}