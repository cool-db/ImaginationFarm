package imaginationfarm.spirit.visitor;

public class Canteen implements FarmPart {
	@Override
	   public void accept(FarmPartVisitor farmPartVisitor) {
		farmPartVisitor.visit(this);
	   }
}
