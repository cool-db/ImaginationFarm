package imaginationfarm.spirit.Cakes;
import imaginationfarm.abst.Cake.*;

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
		System.out.println("ChocolateCake: id = "+chocolateCake._id+": clone: I'm cloned.");
		return chocolateCake;
	}

	@Override
	protected CakeType returnType() {
		return CakeType.CHOCOLATE;
	}

	@Override
	public void bake() {
		System.out.println("ChocolateCake: id = "+_id+": bake: I'm baked.");
	}

}

