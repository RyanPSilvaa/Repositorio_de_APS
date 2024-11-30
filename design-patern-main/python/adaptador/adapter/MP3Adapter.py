from .MediaPlayer import MediaPlayer
from .MP3Player import MP3Player 

# Adapter Class
class MP3Adapter(MediaPlayer):
    def __init__(self):
        self.mp3Player = MP3Player()

    def play(self, audio_type, file_name):
        if audio_type.lower() == "mp3":
            self.mp3Player.fileMP3(file_name)