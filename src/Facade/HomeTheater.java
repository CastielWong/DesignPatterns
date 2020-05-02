package Facade;

import Facade.model.PopcornPopper;
import Facade.model.Projector;
import Facade.model.Screen;

public class HomeTheater {
    private Projector projector;
    private Screen screen;
    private PopcornPopper popper;

    public HomeTheater(Projector projector,
                       Screen screen,
                       PopcornPopper popper) {
        this.projector = projector;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");

        popper.on();
        popper.pop();
        screen.down();
        projector.on();
        projector.wideScreenMode();
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");

        popper.off();
        screen.up();
        projector.off();
    }

}
