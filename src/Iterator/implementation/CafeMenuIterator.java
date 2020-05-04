package Iterator.implementation;

import Iterator.definition.Iterator;

import java.util.Hashtable;

public class CafeMenuIterator implements Iterator {
    private java.util.Iterator items;

    public CafeMenuIterator(Hashtable items) {
        this.items = items.values().iterator();
    }

    @Override
    public Object next() {
        return items.next();
    }

    @Override
    public boolean hasNext() {
        return items.hasNext();
    }
}
