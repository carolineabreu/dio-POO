import com.dio.challenge.domain.Bootcamp;
import com.dio.challenge.domain.Course;
import com.dio.challenge.domain.Dev;
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

        /*System.out.println(course1);
        System.out.println(course2);
        System.out.println(mentorship1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Description Bootcamp Java Developer");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentorship1);

        Dev devCarol = new Dev();
        devCarol.setName("Carol");
        devCarol.registerBootcamp(bootcamp);
        System.out.println("Subscribed contents: " + devCarol.getSubscribedContent());
        devCarol.progress();
        devCarol.progress();
        System.out.println("--");
        System.out.println("Subscribed contents: " + devCarol.getSubscribedContent());
        System.out.println("Completed contents: " + devCarol.getCompletedContent());
        System.out.println("XP: " + devCarol.calculateTotalXp());

        System.out.println("-------");

        Dev devBruno = new Dev();
        devBruno.setName("Bruno");
        devBruno.registerBootcamp(bootcamp);
        System.out.println("Subscribed contents: " + devBruno.getSubscribedContent());
        devBruno.progress();
        devBruno.progress();
        devBruno.progress();
        System.out.println("--");
        System.out.println("Subscribed contents: " + devBruno.getSubscribedContent());
        System.out.println("Completed contents: " + devBruno.getCompletedContent());
        System.out.println("XP: " + devBruno.calculateTotalXp());
    }
}
