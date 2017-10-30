package imaginationfarm.spirit.charactor;

import imaginationfarm.abst.observe.Observable;
import imaginationfarm.spirit.creature.animal.chineseZodiac.ChineseZodiac;

// 代理模式

public class SuperVisor extends Observable {
    private ChineseZodiac realAnimal;
    public String name = "";

    public SuperVisor(String name) {
        this.name = name;
    }

    public void addSuperVisor(ChineseZodiac animal) {
        if (this.realAnimal == null) {
            realAnimal = animal;
        }
    }

    public void switchSuperVisor(ChineseZodiac animal) {
        if (this.realAnimal != null) {
            realAnimal = animal;
        }
    }

    public void removeSuperVisor(ChineseZodiac animal) {
        if (this.realAnimal != null) {
            realAnimal = null;
        }
    }

    public ChineseZodiac getSuperVisor() {
        return realAnimal;
    }

    public void announce(Object notice) {
        notify(notice);
    }
}