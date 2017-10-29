package imaginationfarm.abst.breakfast;

abstract public class BreakfastBuilder {
    protected Breakfast breakfast;

    abstract public void buildSoup();
    abstract public void buildStapleFood();

    public Breakfast getBreakfast() {
        return breakfast;
    }

    public void makeBreakfast() {
        breakfast = new Breakfast();
    }
}
