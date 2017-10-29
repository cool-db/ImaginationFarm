package imaginationfarm.spirit.visitor;

public interface FarmPart {
	public void accept(FarmPartVisitor farmPartVisitor);
}
