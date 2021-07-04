package org.design.adaptor;


/**
 * 想让MediaPlayer具有播放Mp4和Vlc的功能。
 *
 * 这里结合模板方法模式
 */
public class MediaPlayer extends Adaptor implements Player{
    @Override
    public void playMp3() {
        System.out.println("play mp3");
    }
}
