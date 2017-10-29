package imaginationfarm.spirit.item;

// 备忘录模式

public class Refridgerator {
    private List<Crisper> crisperList = new ArrayList<Crisper>();

    public void addCrisper(Crisper crisper){
        crisperList.add(crisper);
    }

    public Crisper getCrisper(int index){
        return crisperList.get(index);
    }

    public void clear() {
        crisperList.clear();
    }



}
