import com.forever.ICourse;
import com.forever.abstractFactory.*;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        SchoolFactory javaFactory = new JavaFactory();
        ICourse javaCourse = javaFactory.createCourse();
        javaCourse.record();

        IVideo javaVideo = javaFactory.createVideo();
        javaVideo.openPlayer();

        SchoolFactory pythonFactory = new PythonFactory();
        INote pythonNote = pythonFactory.createNote();
        pythonNote.write();
    }
}
