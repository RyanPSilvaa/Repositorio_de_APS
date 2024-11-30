from .MediaPlayer import MediaPlayer
from .VLCPlayer import VLCPlayer 

# Adapter Class
class VLCAdapter(MediaPlayer):
    def __init__(self):
        self.vlcPlayer = VLCPlayer()

    def play(self, audio_type, file_name):
        if audio_type.lower() == "vlc":
            self.vlcPlayer.playVLCFile(file_name)