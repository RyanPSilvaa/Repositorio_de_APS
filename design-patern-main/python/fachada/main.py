from Amplifier import Amplifier
from DVDPlayer import DVDPlayer
from Projector import Projector
from HomeTheaterFacade import HomeTheaterFacade

# Main Script
if __name__ == "__main__":
    amplifier = Amplifier()
    dvd_player = DVDPlayer()
    projector = Projector()

    home_theater = HomeTheaterFacade(amplifier, dvd_player, projector)

    home_theater.watch_movie()
    home_theater.end_movie()