import week04.university.Course;
import week04.university.CourseType;
import week04.university.Program;
import week04.university.ProgramType;

public class Main {
    public static void main(String[] args) {

        Course course1 = new Course("Java", 6, CourseType.REQUIRED);
        Course course2 = new Course("C++", 6, CourseType.EELECTIVE);
        Course course3 = new Course("Python", 3, CourseType.REQUIRED);
        Course course4 = new Course("JavaScript", 3, CourseType.EELECTIVE);

        System.out.println(course1);
        System.out.println(course2);
        System.out.println(course3);
        System.out.println(course4);

        Program program = new Program("Computer Science", ProgramType.MAJOR);
        System.out.println(program);

        program.addCourse(course1);
        program.addCourse(course1);
        program.addCourse(course2);
        System.out.println("=======================");
        System.out.println(program);
        program.printCourseList();

        System.out.println(program.getCourseListSize());

//        System.out.println("=======================");
//        program.printCourseListByCourseType(CourseType.REQUIRED);
//
//        System.out.println(" ");
//        System.out.println("=======================");
//        System.out.println(program.removeCourse(1));
//        program.printCourseListByCourseType(CourseType.REQUIRED);
//
//        ProgramType.MAJOR.setProgramTypeCredits(260);
//        System.out.println("Credits needed: " + program.getProgramType().getProgramTypeCredits());
    }
}