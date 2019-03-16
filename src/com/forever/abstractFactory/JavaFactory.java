package com.forever.abstractFactory;

import com.forever.ICourse;
import com.forever.JavaCourse;

public class JavaFactory implements SchoolFactory{
    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }

    @Override
    public INote createNote() {
        return new JavaNote();
    }
}
