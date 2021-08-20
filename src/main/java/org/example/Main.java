package org.example;

import org.example.entities.TeacherEntity;

import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, world");

        String role = "TeacherEntity";

        try {
            Class cls = Class.forName("org.example.entities." + role);
            TeacherEntity roleEntity = (TeacherEntity) cls.getDeclaredConstructor().newInstance();
            System.out.println(roleEntity);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            Class cls = Class.forName("org.example.entities." + role);
            Method someMethod = cls.getDeclaredMethod("someMethod");
            someMethod.setAccessible(true);
            someMethod.invoke(cls.getDeclaredConstructor().newInstance());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
