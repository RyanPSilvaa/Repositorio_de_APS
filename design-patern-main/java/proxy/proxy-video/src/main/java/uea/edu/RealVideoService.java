package uea.edu;

// Implementação real do serviço de vídeo
public class RealVideoService implements VideoService {
    public void playVideo(String videoTitle) {
        System.out.println("Reproduzindo vídeo: " + videoTitle);
    }
} 
