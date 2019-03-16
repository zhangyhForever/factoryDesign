package com.forever.abstractFactory;

public class JavaNote implements INote {

    @Override
    public void write() {
        System.out.println("创建java笔记");
    }
}
