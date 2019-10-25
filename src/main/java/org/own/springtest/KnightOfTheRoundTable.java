package org.own.springtest;

public class KnightOfTheRoundTable implements IKnight {

    private String name;
    private Quest<HolyGrail> quest;
    private Mininstrel mininstrel;

    public KnightOfTheRoundTable(String name) {
        this.name = name;
        //this.quest = new HolyGrailQuest();
    }

    public Object embarkOnQuest() throws GrailNotFoundException {
        mininstrel.compose(name, "embarked on quest");
        return quest.embark();
    }

    
    public void setQuest(Quest<HolyGrail> quest) {
        this.quest = quest;
    }

    public void setMininstrel(Mininstrel mininstrel) {
        this.mininstrel = mininstrel;
    }

    @Override
    public String getName() {
        return name;
    }
}