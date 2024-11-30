from adapter.MediaPlayer import MediaPlayer
from adapter.MP3Adapter import MP3Adapter
from adapter.MP4Adapter import MP4Adapter
from adapter.VLCAdapter import VLCAdapter


class AudioPlayer():
    def __init__(self):
        # Registra os adaptadores em um dicionário
        self.adapter_registry = {
            "mp3": MP3Adapter(),
            "mp4": MP4Adapter(),
            "vlc": VLCAdapter()
        }

    def play(self, audio_type, file_name):
        # Recupera o adaptador apropriado pelo tipo de áudio
        adapter = self.adapter_registry.get(audio_type.lower())
        if adapter:
            adapter.play(audio_type, file_name)
        else:
            print(f"Invalid media type. {audio_type} format not supported.")

