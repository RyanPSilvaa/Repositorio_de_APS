from AudioPlayer import AudioPlayer

# Testando a implementação
if __name__ == "__main__":
    audio_player = AudioPlayer()

    # Testes
    audio_player.play("mp3", "song.mp3")  # Saída: Playing MP3 file: song.mp3
    audio_player.play("mp4", "movie.mp4")  # Saída: Playing MP4 file: movie.mp4
    audio_player.play("vlc", "video.vlc")  # Saída: Playing VLC file: video.vlc
    audio_player.play("avi", "example.avi")  # Saída: Invalid media type. avi format not supported.