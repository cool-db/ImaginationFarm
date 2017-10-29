package imaginationfarm.spirit.NullPatternSpirit;


import imaginationfarm.abst.AbstNullPattern.AllEggs;

public class FertilizedEggs extends AllEggs {

    public FertilizedEggs(){
        System.out.println("FertilizedEggs: create: I'm created.");
    }

    public boolean isFertilized() {
        System.out.println("FertilizedEggs: isFertilized: I'm FertilizedEggs and will become chick.");
        return true;
    }
}
