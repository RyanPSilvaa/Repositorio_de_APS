from VideoService import VideoService

# Implementação real do serviço de vídeo
class RealVideoService(VideoService):
    def play_video(self, video_title):
        print(f"Reproduzindo vídeo: {video_title}")