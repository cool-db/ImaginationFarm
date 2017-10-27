package imaginationfarm.spirit.cakes;
import imaginationfarm.abst.cake.*;

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
		System.out.println("StrawberryCake: id = "+strawberryCake._id+": clone: I'm cloned.");
		return strawberryCake;
	}

	@Override
	protected CakeType returnType() {
		return CakeType.STRAWBERRY;
	}

	@Override
	public void bake() {
		System.out.println("StrawberryCake: id = "+_id+": bake: I'm baked.");
	}

}

