package Composite;

import Composite.model.Menu;
import Composite.model.MenuComponent;
import Composite.model.MenuItem;
import Composite.model.Waitress;

public class Simulator {
    public static void main(String args[]) {
        MenuComponent pancakeHouseMenu =
                new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu =
                new Menu("DINNER MENU", "Lunch");
        MenuComponent cafeMenu =
                new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu =
                new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("All MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem(
                "Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99
        ));

        dinerMenu.add(new MenuItem(
                "Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true,
                3.89
        ));

        cafeMenu.add(new MenuItem(
                "Soup of the day",
                "A cup of the soup of the day, with a side salad",
                false,
                3.69
        ));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem(
                "Apple Pie",
                "Apple pie with flakey crust, topped with vanilla ice cream",
                true,
                1.59
        ));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
