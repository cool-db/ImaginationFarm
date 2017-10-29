package imaginationfarm.spirit.breakfasts;

import imaginationfarm.abst.breakfast.BreakfastBuilder;

public class FriedBreadStick extends BreakfastBuilder {
    public FriedBreadStick() {System.out.println("Breakfast: Fried bread stick and soy milk are ready.");}
    @Override
    public void buildStapleFood() {
        breakfast.setStapleFood("Fried Bread Stick");
    }

    @Override
    public void buildSoup() {
        breakfast.setSoup("Soy milk");
    }
}
