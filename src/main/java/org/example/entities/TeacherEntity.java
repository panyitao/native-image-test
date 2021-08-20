package org.example.entities;

public class TeacherEntity extends RoleEntity {

    public TeacherEntity() {}

    private void someMethod() {
        System.out.println("some method");
    }

    @Override
    public String toString() {
        return "TeacherEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
