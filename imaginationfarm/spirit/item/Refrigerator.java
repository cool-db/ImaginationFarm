package imaginationfarm.spirit.item;

import java.util.ArrayList;
import java.util.List;
// 备忘录模式

public class Refrigerator {
    private List<Crisper> crisperList = new ArrayList<>();

    public void addCrisper(Crisper crisper) {
        crisperList.add(crisper);
    }

    public Crisper getCrisper(int index) {
        System.out.println("A crisper is taken out from the refridgerator.");
        return crisperList.get(index);
    }

    public void clear() {
        crisperList.clear();
    }
}
