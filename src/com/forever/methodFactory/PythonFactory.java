package com.forever.methodFactory;

import com.forever.ICourse;
import com.forever.PythonCourse;

public class PythonFactory implements MethodFactory{
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
