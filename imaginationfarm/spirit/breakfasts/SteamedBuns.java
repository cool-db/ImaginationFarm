package imaginationfarm.spirit.breakfasts;

import imaginationfarm.abst.breakfast.BreakfastBuilder;

public class SteamedBuns extends BreakfastBuilder {
    public SteamedBuns() {System.out.println("Steamed buns and porridge are ready.");}
    @Override
    public void buildSoup() {
        breakfast.setSoup("Porridge");
    }

    @Override
    public void buildStapleFood() {
        breakfast.setStapleFood("Steamed buns");
    }
}
