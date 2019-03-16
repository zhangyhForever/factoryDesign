package com.forever.methodFactory;

import com.forever.ICourse;
import com.forever.JavaCourse;

public class JavaFactory implements MethodFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
