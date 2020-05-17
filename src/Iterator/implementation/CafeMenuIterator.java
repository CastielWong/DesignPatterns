package Iterator.implementation;

import Iterator.definition.Iterator;
import Iterator.model.MenuItem;

import java.util.Hashtable;

public class CafeMenuIterator implements Iterator {
    private java.util.Iterator items;

    public CafeMenuIterator(Hashtable<String, MenuItem> items) {
        this.items = items.values().iterator();
    }

    @Override
    public boolean hasNext() {
        return items.hasNext();
    }

    @Override
    public Object next() {
        return items.next();
    }
}
