package org.example;

//import config.MyConfig;
import config.MyConfig2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        //Setter Injection
//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//        Student s1 = (Student) context.getBean("s1");
//        s1.writeExam();
//
//        Student s2 = (Student) context.getBean("s2");
//        s2.writeExam();

        //Constructor Injection
//        ApplicationContext context = new ClassPathXmlApplicationContext("config2.xml");
//        Student s1 = (Student) context.getBean("s1");
//        s1.writeExam();
//
//        Student s2 = (Student) context.getBean("s2");
//        s2.writeExam();

        //java based configuration
        //without autowiring
//        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//        Student s1 = (Student) context.getBean("std1");
//        s1.writeExam();

        //with autowiring
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig2.class);
        Student s1 = context.getBean(Student.class);
        s1.writeExam();
    }
}