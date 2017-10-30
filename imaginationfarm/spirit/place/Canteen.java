package imaginationfarm.spirit.place;

public class Canteen implements FarmPart {
	@Override
	   public void accept(FarmPartVisitor farmPartVisitor) {
		farmPartVisitor.visit(this);
	   }
}
