package imaginationfarm.spirit.breakfasts;

import imaginationfarm.abst.breakfast.BreakfastBuilder;

public class BreadAndMilk extends BreakfastBuilder {
    public BreadAndMilk() {System.out.println("Breakfast: Bread and milk are ready.");}

    @Override
    public void buildSoup() {
        breakfast.setSoup("Milk");
    }

    @Override
    public void buildStapleFood() {
        breakfast.setStapleFood("Bread");
    }
}
