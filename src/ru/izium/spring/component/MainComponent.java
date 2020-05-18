package ru.izium.spring.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.izium.spring.di.Course;
import ru.izium.spring.di.School;
import ru.izium.spring.di.Teacher;
@ComponentScan
public class MainComponent {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/spring-config-component.xml");
        CourseService service = context.getBean(CourseService.class);
        System.out.println(service.getActiveTeacher());

        SchoolService schoolService = context.getBean(SchoolService.class);
        System.out.println(schoolService.getJavaCourse());
        System.out.println(schoolService.getPythonCourse());

//        Course course1 = context.getBean("java", Course.class);
////        Course course2 = context.getBean("python", Course.class);
////        System.out.println(course1 + "" + course2);

        TeacherService teacherService= (TeacherService) context.getBean("teacher");
        System.out.println(teacherService.getTeachers());
    }
}
