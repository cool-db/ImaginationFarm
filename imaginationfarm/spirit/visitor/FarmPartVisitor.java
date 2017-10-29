package imaginationfarm.spirit.visitor;

public interface FarmPartVisitor {
	public void visit(Dormitory dormitory);
    public void visit(Playground playground);
    public void visit(Canteen canteen);
    public void visit(School school);
    public void visit(FarmForVisitor farmForVisitor);
}
