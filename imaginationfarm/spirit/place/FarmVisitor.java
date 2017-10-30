package imaginationfarm.spirit.place;

import imaginationfarm.abst.logger.Logger;

public class FarmVisitor implements FarmPartVisitor {

    private String subject;

    public void setSubject(String subject) {
        this.subject = subject;
    }

    private void visitLog(Object o) {
        Logger.i(subject + " visit " + o.getClass().getSimpleName() + ".");
    }

    @Override
    public void visit(Dormitory dormitory) {
        visitLog(dormitory);
    }

    @Override
    public void visit(Playground playground) {
        visitLog(playground);
    }

    @Override
    public void visit(Canteen canteen) {
        visitLog(canteen);
    }

    @Override
    public void visit(School school) {
        visitLog(school);
    }

    @Override
    public void visit(FarmForVisitor farmForVisitor) {
        visitLog(farmForVisitor);
    }
}
