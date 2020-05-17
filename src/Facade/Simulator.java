package Facade;

import Facade.model.PopcornPopper;
import Facade.model.Projector;
import Facade.model.Screen;

public class Simulator {

    public static void main(String[] args) {
        Projector projector = new Projector("Fancy Projector");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        HomeTheater homeTheater = new HomeTheater(projector, screen, popper);

        homeTheater.watchMovie("Raider of the Lost Ark");
        System.out.println("------------------------------------------------------");
        homeTheater.endMovie();
    }
}
