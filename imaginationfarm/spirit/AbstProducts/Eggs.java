package AbstractFactory.AbstProducts;
import AbstractFactory.AbstFactory.AnimalProducts;
import NullObjectPattern.AbstNullPattern.AllEggs;
import NullObjectPattern.NullPatternSpirit.FertilizedEggs;
import NullObjectPattern.NullPatternSpirit.OtherEggs;

public class Eggs extends AnimalProducts {
    private boolean s = false;

    public Eggs(){}
    public Eggs(String str){}
    public Eggs(boolean st){
        s = st;
    }

    public AllEggs getEggs(){
        if (!s){
            return new OtherEggs();
        }
        return new FertilizedEggs();
    }
}
