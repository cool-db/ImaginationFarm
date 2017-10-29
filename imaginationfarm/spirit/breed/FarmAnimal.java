package imaginationfarm.spirit.breed;

public abstract class FarmAnimal {
    protected BreedAPI breedAPI;
    protected FarmAnimal(BreedAPI breedAPI){
        this.breedAPI = breedAPI;
    }
    public abstract void breed();
}