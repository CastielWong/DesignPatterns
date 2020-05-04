package Iterator.implementation;

import Iterator.definition.Iterator;
import Iterator.definition.Menu;
import Iterator.model.MenuItem;

public class DinerMenu implements Menu {
    private static final int MAX_ITEMS = 6;
    private int numberofItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat",
                2.99,
                true);

        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat",
                2.99,
                false);

        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad",
                3.29,
                false);

        addItem("Hotdog",
                "A hot dof, with saurkraut, relish, onions, topped with cheese",
                3.05,
                false);
    }

    public void addItem(String name,
                        String description,
                        double price,
                        boolean vegetarian) {
        MenuItem menuItem = new MenuItem(name, description, price, vegetarian);

        if (numberofItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! Can't add item to menu");
        } else {
            menuItems[numberofItems] = menuItem;
            numberofItems = numberofItems + 1;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }

}
