package org.design.adaptor;

import java.util.Objects;

public class Adaptor extends AdvancedMediaPlayer implements Player{
    @Override
    public void play(String type) {
        if(Objects.equals(type,"mp3")){
            playMp3();
        } else if(Objects.equals(type,"mp4")){
            playMp4();
        } else {
            playVlc();
        }
    }
}
