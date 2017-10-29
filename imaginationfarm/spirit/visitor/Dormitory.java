package imaginationfarm.spirit.visitor;

public class Dormitory implements FarmPart{
	@Override
	   public void accept(FarmPartVisitor farmPartVisitor) {
		farmPartVisitor.visit(this);
	   }
}
