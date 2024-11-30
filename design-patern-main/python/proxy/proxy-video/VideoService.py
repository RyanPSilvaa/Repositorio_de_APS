from abc import ABC, abstractmethod

# Interface do serviço de vídeo
class VideoService(ABC):
    @abstractmethod
    def play_video(self, video_title):
        pass