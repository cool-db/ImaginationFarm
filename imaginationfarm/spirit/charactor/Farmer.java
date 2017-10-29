package imaginationfarm.spirit.charactor;

import imaginationfarm.spirit.cloths.Wardrobe;

public class Farmer {
    private Wardrobe wardrobe;

    public Farmer(Wardrobe wd) {
        wardrobe = wd;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public void wear() {
        System.out.println(this.getClass().getSimpleName() + wardrobe.wear());
    }

    
}