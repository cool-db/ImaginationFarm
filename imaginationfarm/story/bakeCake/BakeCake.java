package imaginationfarm.story.bakeCake;
import imaginationfarm.spirit.cakes.*;
import imaginationfarm.abst.cake.*;

public class BakeCake {
	private CakeType[] cakeList = {CakeType.GRASS, CakeType.STRAWBERRY, CakeType.GRASS, CakeType.CHOCOLATE, CakeType.STRAWBERRY, CakeType.GRASS};;
	private Cake[] cakes = new Cake[6];
	public void bakeCake() {
		int temp = GrassCake._count + StrawberryCake._count + ChocolateCake._count;
		int cakeNum = 6;
		cakes = new Cake[6];
		for(int i = 0; i < cakeNum; i++){
			cakes[i] = Cake.findAndClone(cakeList[i]);
		}
		for(int i = 0; i < cakeNum; i++) {
			cakes[i].bake();
		}
	}

	public Cake[] getCakes() {
		return cakes;
	}
}
