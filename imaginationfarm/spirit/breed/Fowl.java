import java.util.ArrayList;
import java.util.List;

public class Fowl extends Animal {
    private String name;
    private String position;
    private int age;
    private int fodder;
    private List<Fowl> subordinates;

    public Fowl(String name, String position, int age, int fodder, BreedAPI breedAPI) {
        super(breedAPI);
        this.name=name;
        this.position=position;
        this.age = age;
        this.fodder = fodder;
        subordinates = new ArrayList<Fowl>();
    }

    public void breed() {
        breedAPI.breedFowl(age, fodder);
    }

    public void add(Fowl e) {
        subordinates.add(e);
    }

    public void remove(Fowl e) {
        subordinates.remove(e);
    }

    public List<Fowl> getSubordinates(){
        return subordinates;
    }

    public String toString(){
        return ("Fowl :[ Name : "+ name
                +", position : "+ position + ", age :"
                + age+" ]");
    }
}