public class Fowl extends Shape {
    private int age, fodder;

    public Fowl(int age, int fodder, BreedAPI breedAPI) {
        super(breedAPI);
        this.age = age;
        this.fodder = fodder;
    }

    public void breed() {
        breedAPI.breedFowl(age, fodder);
    }
}