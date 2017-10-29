package NullObjectPattern.NullPatternSpirit;

import NullObjectPattern.AbstNullPattern.AllEggs;

public class OtherEggs extends AllEggs {

    public OtherEggs(){
        System.out.println("OtherEggs: create: I'm created.");
    }

    @Override
    public boolean isFertilized() {
        System.out.println("OtherEggs: isFertilized: I'm not Fertilized and will not become chick.");
        return false;
    }
}
