package com.forever.abstractFactory;

import com.forever.ICourse;

public interface SchoolFactory {

    public ICourse createCourse();

    public IVideo createVideo();

    public INote createNote();
}
