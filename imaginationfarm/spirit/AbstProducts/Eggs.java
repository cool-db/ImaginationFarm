package imaginationfarm.spirit.AbstProducts;
import imaginationfarm.abst.AbstFactory.AnimalProducts;
import imaginationfarm.abst.AbstNullPattern.AllEggs;
import imaginationfarm.spirit.NullPatternSpirit.FertilizedEggs;
import imaginationfarm.spirit.NullPatternSpirit.OtherEggs;

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
