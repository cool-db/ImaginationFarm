package imaginationfarm.spirit.breed;
import java.util.ArrayList;
import java.util.List;

public class Poultry extends Fowl {
    private String name;
    private String position;
    private int age;
    private int fodder;
    private List<Poultry> subordinates;

    public Poultry(String name, String position, int age, int fodder, BreedAPI breedAPI) {
        super(breedAPI);
        this.name = name;
        this.position = position;
        this.age = age;
        this.fodder = fodder;
        subordinates = new ArrayList<Poultry>();
    }

    public void breed() {
        breedAPI.breedPoultry(name, position, age, fodder);
    }

    public void add(Poultry e) {
        subordinates.add(e);
    }

    public void remove(Poultry e) {
        subordinates.remove(e);
    }

    public List<Poultry> getSubordinates(){
        return subordinates;
    }

    public String toString(){
        return ("Poultry :[ Name : "+ name
                +", position : "+ position + ", age :"
                + age+" ]");
    }
}