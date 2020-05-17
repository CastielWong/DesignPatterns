package Iterator.menus;

import Iterator.definition.Iterator;
import Iterator.definition.Menu;
import Iterator.implementation.PancakeHouseMenuIterator;
import Iterator.model.MenuItem;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {
    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();

        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                2.99,
                true);

        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                2.99,
                false);

        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                3.49,
                true);

        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                3.59,
                true);
    }

    public void addItem(String name,
                        String description,
                        double price,
                        boolean vegetarian) {
        MenuItem menuItem = new MenuItem(name, description, price, vegetarian);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }

}
