# Facade Class
class HomeTheaterFacade:
    def __init__(self, amplifier, dvd_player, projector):
        self.amplifier = amplifier
        self.dvd_player = dvd_player
        self.projector = projector

    def watch_movie(self):
        print("Setting up the home theater...")
        self.amplifier.on()
        self.projector.on()
        self.dvd_player.play()
        print("Movie is ready to watch!")

    def end_movie(self):
        print("Shutting down the home theater...")
        self.dvd_player.stop()
        self.projector.off()
        self.amplifier.off()
        print("Home theater is off.")