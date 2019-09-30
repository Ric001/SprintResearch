package org.own.springtest;

public class KnightOfTheRoundTable implements IKnight {

    private String name;
    private Quest<HolyGrail> quest;

    public KnightOfTheRoundTable(String name) {
        this.name = name;
        //this.quest = new HolyGrailQuest();
    }

    public Object embarkOnQuest() throws GrailNotFoundException {
        System.out.println("Embarked on The Quest!!!");
        return quest.embark();
    }

    public void setQuest(Quest<HolyGrail> quest) {
        this.quest = quest;
    }

}