import com.forever.ICourse;
import com.forever.methodFactory.JavaFactory;
import com.forever.methodFactory.MethodFactory;
import com.forever.methodFactory.PythonFactory;

public class MethodFactoryTest {
    public static void main(String[] args) {
        MethodFactory java = new JavaFactory();
        MethodFactory python = new PythonFactory();
        ICourse javaCourse = java.create();
        ICourse pythonCourse = python.create();

        javaCourse.record();
        pythonCourse.record();
    }
}
