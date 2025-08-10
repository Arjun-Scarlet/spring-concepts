package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Pen implements Writer{
    public Pen() {
        System.out.println("Pen created!");
    }
    @Override
    public void
    write() {
        System.out.println("Written by Pen");
    }
}
