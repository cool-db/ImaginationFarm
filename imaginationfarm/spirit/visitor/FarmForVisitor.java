package imaginationfarm.spirit.visitor;

public class FarmForVisitor implements FarmPart {
    Dormitory dormitory = new Dormitory();
	School school = new School();
	Canteen canteen = new Canteen();
	Playground playground = new Playground();

    public FarmForVisitor() {
    }

    public Canteen getCanteen() {
        return canteen;
    }

    public Dormitory getDormitory() {
        return dormitory;
    }

    public Playground getPlayground() {
        return playground;
    }

    public School getSchool() {
        return school;
    }

    @Override
    public void accept(FarmPartVisitor farmPartVisitor) {
    }
}
