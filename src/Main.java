import com.dio.challenge.domain.Course;
import com.dio.challenge.domain.Mentorship;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setTitle("Java course");
        course1.setDescription("Description java course");
        course1.setWorkload(8);

        Course course2 = new Course();
        course2.setTitle("Js course");
        course2.setDescription("Description js course");
        course2.setWorkload(4);

        Mentorship mentorship1 = new Mentorship();
        mentorship1.setTitle("Java mentorship");
        mentorship1.setDescription("Description java mentorship");
        mentorship1.setDate(LocalDate.now());

        System.out.println(course1);
        System.out.println(course2);
        System.out.println(mentorship1);

        
    }
}
