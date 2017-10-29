package Breakfast;

public class Noodles extends BreakfastBuilder {
    Noodles() {System.out.println("Noodle and chicken soup are ready.");}
    @Override
    public void buildStapleFood() {
        breakfast.setStapleFood("Noodles");
    }

    @Override
    public void buildSoup() {
        breakfast.setSoup("Chicken soup");
    }
}
