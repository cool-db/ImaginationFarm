package imaginationfarm.story.BakeCake;

public class BakeCake {
	public void bakeCake() {
		System.out.println("=====================Baking Cake=====================");
		System.out.println("------------------Making Prototype-------------------");
		System.out.println("Current quantity of GrassCake: " + GrassCake._count);
		System.out.println("Current quantity of StrawberryCake: " + StrawberryCake._count);
		System.out.println("Current quantity of ChocolateCake: " + ChocolateCake._count);
		System.out.println("--------------------Cloning Cakes--------------------");
		int cakeNum = 6;
		CakeType[] cakeList = {CakeType.GRASS, CakeType.STRAWBERRY, CakeType.GRASS, CakeType.CHOCOLATE, CakeType.STRAWBERRY, CakeType.GRASS};
		
		Cake[] cakes = new Cake[6];
		for(int i = 0; i < cakeNum; i++){
			cakes[i] = Cake.findAndClone(cakeList[i]);
		}
		System.out.println("---------------------Baking Cakes--------------------");
		for(int i = 0; i < cakeNum; i++) {
			cakes[i].bake();
		}
	}
}
