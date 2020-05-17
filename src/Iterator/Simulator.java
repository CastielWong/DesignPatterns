package Iterator;

import Iterator.definition.Menu;
import Iterator.menus.CafeMenu;
import Iterator.menus.DinerMenu;
import Iterator.menus.PancakeHouseMenu;
import Iterator.model.Waitress;

import java.util.ArrayList;

public class Simulator {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        ArrayList<Menu> menus = new ArrayList<Menu>();
        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);
        menus.add(cafeMenu);

        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}
