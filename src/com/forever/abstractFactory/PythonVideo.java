package com.forever.abstractFactory;

public class PythonVideo implements IVideo {
    @Override
    public void openPlayer() {
        System.out.println("打开python播放器");
    }
}
