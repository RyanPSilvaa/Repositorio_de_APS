package edu.uea;

// Facade Class
class HomeTheaterFacade {
    private Amplifier amplifier;
    private DVDPlayer dvdPlayer;
    private Projector projector;

    public HomeTheaterFacade(Amplifier amplifier, DVDPlayer dvdPlayer, Projector projector) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
    }

    public void watchMovie() {
        System.out.println("Setting up the home theater...");
        amplifier.on();
        projector.on();
        dvdPlayer.play();
        System.out.println("Movie is ready to watch!");
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        dvdPlayer.stop();
        projector.off();
        amplifier.off();
        System.out.println("Home theater is off.");
    }
}