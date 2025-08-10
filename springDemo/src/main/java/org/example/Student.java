package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private String name;
    @Autowired
    @Qualifier("pencil")
    private Writer write;

//    public Student() {
//    System.out.println("Student created!");}

//    @Autowired
//    public Student(@Qualifier("pencil") Writer write) {
//        this.write = write;
//    }

    public Student(@Qualifier("pencil") Writer write) {
        this.write = write;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Writer getWrite() {
        return write;
    }

//    @Autowired
//    @Qualifier("pencil")
    public void setWrite(Writer write) {
        this.write = write;
    }

    public void writeExam() {
        write.write();
    }
}
