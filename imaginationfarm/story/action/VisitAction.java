package imaginationfarm.story.action;

import imaginationfarm.spirit.creature.animal.chineseZodiac.ChineseZodiac;
import imaginationfarm.spirit.visitor.FarmPart;
import imaginationfarm.spirit.visitor.FarmVisitor;

public class VisitAction implements Action {
    private FarmPart place;
    public VisitAction(FarmPart place) {
        this.place = place;
    }

    @Override
    public void excute(ChineseZodiac src) {
        FarmVisitor fv = new FarmVisitor();
        fv.setSubject(src.getClass().getSimpleName());
        place.accept(fv);
    }
}