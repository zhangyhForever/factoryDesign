import com.forever.ICourse;
import com.forever.JavaCourse;
import com.forever.simpleFactory.SimpleFactory;

public class SimpleFactoryTest {
    public static void main(String[] args) throws Exception {
        SimpleFactory factory = new SimpleFactory();
        ICourse java = factory.create(JavaCourse.class);
        java.record();
    }
}
