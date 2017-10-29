package imaginationfarm.spirit.breed;

public abstract class Fowl {
    protected BreedAPI breedAPI;
    protected Fowl(BreedAPI breedAPI){
        this.breedAPI = breedAPI;
    }
    public abstract void breed();
}