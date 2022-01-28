import com.dio.challenge.domain.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Creates two courses
        Course course1 = new Course();
        course1.setTitle("Java course");
        course1.setDescription("Description java course");
        course1.setWorkload(8);

        Course course2 = new Course();
        course2.setTitle("Js course");
        course2.setDescription("Description js course");
        course2.setWorkload(4);

        // Creates a mentorship
        Mentorship mentorship1 = new Mentorship();
        mentorship1.setTitle("Java mentorship");
        mentorship1.setDescription("Description java mentorship");
        mentorship1.setDate(LocalDate.now());


        /*System.out.println(course1);
        System.out.println(course2);
        System.out.println(mentorship1);*/

        // Creates a short course
        Subject subject1 = new Subject();
        subject1.setTitle("Java POO");
        subject1.setDescription("Description java POO");
        subject1.setDuration(1);

        ShortCourse shortCourse1 = new ShortCourse();
        shortCourse1.getContents().add(subject1);

        // Creates a bootcamp and add the contents
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Description Bootcamp Java Developer");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentorship1);

        // Creates a new dev
        Dev devCarol = new Dev();
        devCarol.setName("Carol");
        devCarol.registerBootcamp(bootcamp); // Register a dev in bootcamp
        // Shows the contents the dev is registered
        System.out.println("Subscribed contents: " + devCarol.getSubscribedContent());
        // Completes a content
        devCarol.progress();
        devCarol.progress();
        System.out.println("--");
        System.out.println("Subscribed contents: " + devCarol.getSubscribedContent());
        System.out.println("Completed contents: " + devCarol.getCompletedContent());
        System.out.println("XP: " + devCarol.calculateTotalXp()); // Shows total XP

        System.out.println("-------");

        // Creates a new dev
        Dev devBruno = new Dev();
        devBruno.setName("Bruno");
        devBruno.registerBootcamp(bootcamp); // Register a dev in bootcamp
        // Shows the contents the dev is registered
        System.out.println("Subscribed contents: " + devBruno.getSubscribedContent());
        // Completes a content
        devBruno.progress();
        devBruno.progress();
        devBruno.progress();
        System.out.println("--");
        System.out.println("Subscribed contents: " + devBruno.getSubscribedContent());
        System.out.println("Completed contents: " + devBruno.getCompletedContent());
        System.out.println("XP: " + devBruno.calculateTotalXp()); // Shows total XP

        System.out.println("-------");

        // Creates a new dev
        Dev devBecky = new Dev();
        devBecky.setName("Becky");
        // Register a dev in a short course
        devBecky.registerShortCourse(shortCourse1);
        System.out.println("Subscribed short courses: " + devBecky.getSubscribedShortCourse());
    }
}
