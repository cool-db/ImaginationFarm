public class Duck implements BreedAPI {
    @Override
    public void breedFowl(String name, String position, int age, int fodder){
        System.out.println("Breeding Duck "+position+" "+name+" at "+age+" with "+fodder+"g fodder);
    }
}