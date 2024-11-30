package edu.uea.adapter;

// Adapter 1 - Adapts VLCPlayer to MediaPlayer
public class VLCAdapter implements MediaPlayer {
    private VLCPlayer vlcPlayer;

    public VLCAdapter() {
        this.vlcPlayer = new VLCPlayer();
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            vlcPlayer.playVLCFile(fileName);
        }
    }
}
