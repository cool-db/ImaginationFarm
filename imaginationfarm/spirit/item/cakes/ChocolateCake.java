package imaginationfarm.spirit.item.cakes;

import imaginationfarm.abst.logger.Logger;

public class ChocolateCake extends Cake {

	int _id;
	public static int _count=0;
	static ChocolateCake _chocolatePrototype;
	
	static {
        _chocolatePrototype = new ChocolateCake();
    }
	
	public ChocolateCake(int i) {
		_id=++_count;
	}
	
	private ChocolateCake() {
		addPrototype(this);
	}

	@Override
	protected Cake clone() {
		ChocolateCake chocolateCake=new ChocolateCake(1);
		return chocolateCake;
	}

	@Override
	protected CakeType returnType() {
		return CakeType.CHOCOLATE;
	}

	@Override
	public void bake() {
		Logger.i("ChocolateCake is baked.");
	}

}

