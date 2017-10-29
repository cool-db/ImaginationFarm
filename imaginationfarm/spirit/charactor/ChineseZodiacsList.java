package imaginationfarm.spirit.charactor;

import imaginationfarm.abst.container.Container;
import imaginationfarm.abst.container.Iterator;

public enum ChineseZodiacsList implements Container {
    INSTANCE;
    public String names[] = {"rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "goat", "monkey", "rooster", "dog", "pig"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}