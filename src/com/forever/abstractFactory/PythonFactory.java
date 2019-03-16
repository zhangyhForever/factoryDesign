package com.forever.abstractFactory;

import com.forever.ICourse;

public class PythonFactory implements SchoolFactory {
    @Override
    public ICourse createCourse() {
        return new PythonCourse();
    }

    @Override
    public IVideo createVideo() {
        return new PythonVideo();
    }

    @Override
    public INote createNote() {
        return new PythonNote();
    }
}
