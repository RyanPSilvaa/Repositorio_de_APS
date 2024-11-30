from VideoService import VideoService
from RealVideoService import RealVideoService

# Proxy para controle parental
class ParentalControlProxy(VideoService):
    def __init__(self):
        self._real_video_service = RealVideoService()

    def play_video(self, video_title):
        if self.is_restricted(video_title):
            print(f"Este vídeo está bloqueado pelo controle parental: {video_title}")
        else:
            self._real_video_service.play_video(video_title)

    # Método para simular restrições de conteúdo
    def is_restricted(self, video_title):
        # Verificação de restrição simples; pode ser expandida
        restricted_keywords = ["violência", "adulto"]
        return any(keyword in video_title.lower() for keyword in restricted_keywords)