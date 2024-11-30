from ParentalControlProxy import ParentalControlProxy

# Testando o padrão Proxy
if __name__ == "__main__":
    video_service = ParentalControlProxy()
    
    # Tentar reproduzir vídeos com e sem restrição
    video_service.play_video("Filme de Ação")
    video_service.play_video("Desenho Animado")
    video_service.play_video("Filme de Violência")