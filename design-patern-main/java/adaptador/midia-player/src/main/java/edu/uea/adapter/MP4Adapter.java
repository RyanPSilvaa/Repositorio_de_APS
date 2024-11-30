package edu.uea.adapter;

public class MP4Adapter implements MediaPlayer {
    private MP4Player mp4Player;

    public MP4Adapter() {
        this.mp4Player = new MP4Player();
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            mp4Player.show(fileName);
        }
    }

}
