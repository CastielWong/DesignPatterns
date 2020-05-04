package Iterator.implementation;

import Iterator.definition.Iterator;
import Iterator.definition.Menu;
import Iterator.model.MenuItem;

import java.util.Hashtable;

public class CafeMenu implements Menu {
    private Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        addItem("Veggie Burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                3.99,
                true);
        addItem("Soup of the day",
                "A cup of the soup of the day, with a side salad",
                3.69,
                false);
        addItem("Burrito",
                "A large burrito, with whol pinto beans, salsa, guacamole",
                4.29,
                true);
    }

    public void addItem(String name,
                        String description,
                        double price,
                        boolean vegetarian) {
        MenuItem menuItem = new MenuItem(name, description, price, vegetarian);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Hashtable getItems() {
        return menuItems;
    }

    @Override
    public Iterator createIterator() {
        return new CafeMenuIterator(this.menuItems);
    }
}
