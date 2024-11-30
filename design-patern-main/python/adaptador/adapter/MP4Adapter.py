from .MediaPlayer import MediaPlayer
from .MP4Player import MP4Player 

# Adapter Class
class MP4Adapter(MediaPlayer):
    def __init__(self):
        self.mp4Player = MP4Player()

    def play(self, audio_type, file_name):
        if audio_type.lower() == "mp4":
            self.mp4Player.show(file_name)