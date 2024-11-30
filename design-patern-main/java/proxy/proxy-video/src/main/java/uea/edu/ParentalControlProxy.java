package uea.edu;

// Proxy para controle parental
public class ParentalControlProxy implements VideoService {
    private RealVideoService realVideoService = new RealVideoService();

    public void playVideo(String videoTitle) {
        if (isRestricted(videoTitle)) {
            System.out.println("Este vídeo está bloqueado pelo controle parental: " + videoTitle);
        } else {
            realVideoService.playVideo(videoTitle);
        }
    }

    // Método para simular restrições de conteúdo
    private boolean isRestricted(String videoTitle) {
        // Apenas um exemplo; em uma aplicação real, poderia haver uma lista de verificação de restrições
        return videoTitle.toLowerCase().contains("violência") || videoTitle.toLowerCase().contains("adulto");
    }

}
