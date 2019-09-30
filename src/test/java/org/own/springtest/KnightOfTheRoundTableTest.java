package org.own.springtest;

import org.junit.Test;

import junit.framework.TestCase;

public class KnightOfTheRoundTableTest extends TestCase {

    @Test
    public void testEmbarkOnQuest() {
        final KnightOfTheRoundTable knight = new KnightOfTheRoundTable("Eramir");
    
        try {
            final HolyGrailQuest quest = (HolyGrailQuest) knight.embarkOnQuest();
            final HolyGrail grail = (HolyGrail) quest.embark(); 

            assertNotNull(quest);
            assertTrue(grail.isHoly());

        } catch (GrailNotFoundException e) { 
            e.printStackTrace(); 
        }
    }
}