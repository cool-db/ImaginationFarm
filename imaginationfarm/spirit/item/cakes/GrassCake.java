package imaginationfarm.spirit.item.cakes;

import imaginationfarm.abst.logger.Logger;

public class GrassCake extends Cake {

	int _id;
	public static int _count=0;
	static GrassCake _grassPrototype;
	
	static {
        _grassPrototype = new GrassCake();
    }
	
	public GrassCake(int i) {
		_id=++_count;
	}
	
	@SuppressWarnings("unused")
	public GrassCake() {
		addPrototype(this);
	}

	@Override
	protected Cake clone() {
		GrassCake grassCake = new GrassCake(1);
		return grassCake;
	}

	@Override
	protected CakeType returnType() {
		return CakeType.GRASS;
	}

	@Override
	public void bake() {
		Logger.i("GrassCake is baked.");
	}

}

