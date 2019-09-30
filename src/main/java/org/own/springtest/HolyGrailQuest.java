package org.own.springtest;

public class HolyGrailQuest implements Quest<HolyGrail>{

    public HolyGrailQuest() {
    }
    
    public HolyGrail embark() throws GrailNotFoundException {
        return new HolyGrail();
    }
}