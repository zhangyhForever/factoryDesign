package com.forever.abstractFactory;

public class JavaVideo implements IVideo {
    @Override
    public void openPlayer() {
        System.out.println("打开Java播放器");
    }
}
