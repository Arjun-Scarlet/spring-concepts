package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Pencil implements Writer{
    public Pencil() {
        System.out.println("Pencil created!");
    }
    @Override
    public void write() {
        System.out.println("Written by Pencil");
    }
}
