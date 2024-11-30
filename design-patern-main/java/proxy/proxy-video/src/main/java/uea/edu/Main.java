package uea.edu;

// Classe para testar o padrão Proxy
public class Main {
    public static void main(String[] args) {
        VideoService videoService = new ParentalControlProxy();
        
        // Tentar reproduzir vídeos com e sem restrição
        videoService.playVideo("Filme de Ação");
        videoService.playVideo("Desenho Animado");
        videoService.playVideo("Filme de Violência");
        videoService.playVideo("Filme de Conteúdo Adulto");
    }
}