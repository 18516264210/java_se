package org.design.adaptor;

public class AdvancedMediaPlayer implements AdvancedPlayer{
    @Override
    public void playMp4() {
        System.out.println("play mp4");
    }

    @Override
    public void playVlc() {
        System.out.println("play vlc");
    }
}
