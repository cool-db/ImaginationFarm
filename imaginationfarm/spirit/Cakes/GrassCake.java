package imaginationfarm.spirit.Cakes;

public class GrassCake extends Cake {

	int _id;
	static int _count=0;
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
		System.out.println("GrassCake: id = "+grassCake._id+": clone: I'm cloned.");
		return grassCake;
	}

	@Override
	protected CakeType returnType() {
		return CakeType.GRASS;
	}

	@Override
	public void bake() {
		System.out.println("GrassCake: id = "+_id+": bake: I'm baked.");
	}

}

