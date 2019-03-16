package com.forever.simpleFactory;

import com.forever.ICourse;

public class SimpleFactory {
/*
    public com.forever.ICourse create(String className) throws Exception {
        if(className!=null || className != "") {
            return (com.forever.ICourse)Class.forName(className).newInstance();
        }
        return null;
    }*/

    public ICourse create(Class clazz) throws Exception{
        if(clazz!=null) {
            return (ICourse) clazz.newInstance();
        }
        return null;
    }
}
