package imaginationfarm.spirit.visitor;

public class School implements FarmPart{
	@Override
	   public void accept(FarmPartVisitor farmPartVisitor) {
		farmPartVisitor.visit(this);
	   }
}
