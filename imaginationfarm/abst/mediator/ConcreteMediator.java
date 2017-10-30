package imaginationfarm.abst.mediator;

import imaginationfarm.spirit.charactor.Farmer;
import imaginationfarm.spirit.charactor.SuColleague;

/**
 * Created by xueyingchen on 2017/10/30.
 */
public class ConcreteMediator implements Mediator {
    private Farmer farmer;
    private SuColleague suColleague;

    public void init(Farmer f, SuColleague s) {
        farmer = f;
        suColleague = s;
    }

    @Override
    public void contact(String content, Colleague coll) {
        if (coll.equals(farmer)) {
            suColleague.getMessage(content);
        } else {
            farmer.getMessage(content);
        }
    }
}
