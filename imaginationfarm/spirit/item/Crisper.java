package imaginationfarm.spirit.item;

import imaginationfarm.spirit.item.breakfirst.Item;
import java.util.ArrayList;
import java.util.List;

// 备忘录模式

public class Crisper {
    private List<Item> items = new ArrayList<Item>();

    public Crisper(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item){
        items.add(item);
    }

    public getItems() {
        return items;
    }
}
