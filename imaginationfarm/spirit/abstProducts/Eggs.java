package imaginationfarm.spirit.abstProducts;
import imaginationfarm.abst.abstFactory.AnimalProducts;
import imaginationfarm.abst.abstNullPattern.AllEggs;
import imaginationfarm.spirit.nullPatternSpirit.FertilizedEggs;
import imaginationfarm.spirit.nullPatternSpirit.OtherEggs;

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
