package imaginationfarm.spirit.item.breakfasts;

//单例模式厨房，即builder中的director
public class Kitchen {
    private Kitchen(){System.out.println("Kitchen is built.");};
    private static Kitchen kitchen = new Kitchen();

    protected BreakfastBuilder breakfastBuilder;

    public void setBreakfastBuilder(BreakfastBuilder breakfastBuilder) {
        this.breakfastBuilder = breakfastBuilder;
    }

    public Breakfast getBreakfast() {return breakfastBuilder.getBreakfast();}

    public void cook(){
        breakfastBuilder.makeBreakfast();
        breakfastBuilder.buildSoup();
        breakfastBuilder.buildStapleFood();
    }

    public static Kitchen getKitchen() {
        return kitchen;
    }
}
