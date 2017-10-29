package imaginationfarm.story.discoverHairStolen;
import imaginationfarm.spirit.charactor.Hair;
import imaginationfarm.spirit.creature.animal.chineseZodiac.*;

public class DiscoverHairStolen {
    public void discoverHairStolen() {
        Hair hair = Hair.getInstance();
        Pig pig = new Pig();
        hair.attachObserver(pig);
        hair.attachObserver(new Pig());
        hair.updateState();
        hair.stolenNotify();
    }
}