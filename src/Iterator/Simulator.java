package Iterator;

import Iterator.implementation.CafeMenu;
import Iterator.implementation.DinerMenu;
import Iterator.implementation.PancakeHouseMenu;
import Iterator.model.Waitress;

import java.util.ArrayList;

public class Simulator {
    public static void main(String args[]) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        CafeMenu cafeMenu = new CafeMenu();
        DinerMenu dinerMenu = new DinerMenu();

        ArrayList menus = new ArrayList();
        menus.add(pancakeHouseMenu);
        menus.add(cafeMenu);
        menus.add(dinerMenu);

        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}
