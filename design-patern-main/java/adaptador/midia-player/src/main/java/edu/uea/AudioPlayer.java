package edu.uea;

import java.util.HashMap;
import java.util.Map;

import edu.uea.adapter.MP3Adapter;
import edu.uea.adapter.MP4Adapter;
import edu.uea.adapter.MediaPlayer;
import edu.uea.adapter.VLCAdapter;

// Client Class
public class AudioPlayer {
    private final Map<String, MediaPlayer> adapterRegistry = new HashMap<>();

    // Registra os adaptadores para os tipos de mídia suportados
    public AudioPlayer() {
        adapterRegistry.put("mp3", new MP3Adapter());
        adapterRegistry.put("mp4", new MP4Adapter());
        adapterRegistry.put("vlc", new VLCAdapter());
    }

    // Toca o arquivo de mídia usando o adaptador apropriado
    public void play(String audioType, String fileName) {
        MediaPlayer adapter = adapterRegistry.get(audioType.toLowerCase());
        if (adapter != null) {
            adapter.play(audioType,fileName);
        } else {
            System.out.println("Invalid media type. " + audioType + " format not supported.");
        }
    }
}