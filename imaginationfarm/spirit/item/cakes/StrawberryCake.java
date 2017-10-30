package imaginationfarm.spirit.item.cakes;

import imaginationfarm.abst.logger.Logger;

public class StrawberryCake extends Cake {

	int _id;
	public static int _count=0;
	static StrawberryCake _strawberryPrototype;
	
	static {
        _strawberryPrototype = new StrawberryCake();
    }
	
	public StrawberryCake(int i) {
		_id=++_count;
	}
	
	private StrawberryCake() {
		addPrototype(this);
	}

	@Override
	protected Cake clone() {
		StrawberryCake strawberryCake = new StrawberryCake(1);
		return strawberryCake;
	}

	@Override
	protected CakeType returnType() {
		return CakeType.STRAWBERRY;
	}

	@Override
	public void bake() {
		Logger.i("StrawberryCake is baked.");
	}

}

