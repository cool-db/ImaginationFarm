package imaginationfarm.spirit.visitor;

public class Playground implements FarmPart{
	@Override
	   public void accept(FarmPartVisitor farmPartVisitor) {
		farmPartVisitor.visit(this);
	   }
}
