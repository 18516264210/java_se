package org.design.adaptor;

public interface Player {

    public void play(String type);

    default void playMp3() {
        throw new RuntimeException("未实现");
    }

}
