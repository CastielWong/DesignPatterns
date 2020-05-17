package Iterator.implementation;

import Iterator.definition.Iterator;

public class NullIterator implements Iterator {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
