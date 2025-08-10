//package confg;
//
//import org.example.Pen;
//import org.example.Pencil;
//import org.example.Student;
//import org.example.Writer;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.context.annotation.Scope;
//
//@Configuration
//public class MyConfig {
//    @Bean(name = "std1")
//    @Scope("prototype")
//    public Student s1(@Qualifier("pencil") Writer writer) {
//        Student s = new Student();
//        s.setName("akash");
//        s.setWrite(writer);
//        return s;
//    }
//
//    //@Bean
//    public Student s2() {
//        return new Student();
//    }
//
//   // @Bean
//    @Primary
//    public Pen āpen() {
//        return new Pen();
//    }
//
//    @Bean
//    @Primary
//    public Pencil pencil() {
//        return new Pencil();
//    }
//}
