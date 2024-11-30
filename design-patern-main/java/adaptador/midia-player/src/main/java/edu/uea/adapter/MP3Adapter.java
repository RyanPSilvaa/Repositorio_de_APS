package edu.uea.adapter;

public class MP3Adapter implements MediaPlayer {
    private MP3Player mp3Player;

    public MP3Adapter() {
        this.mp3Player = new MP3Player();
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            mp3Player.fileMP3(fileName);
        }
    }

}
