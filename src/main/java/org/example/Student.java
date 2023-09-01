package org.example;

public class Student {
    private String hno;
    private String name;

    public Student(String hno, String name) {
        this.hno = hno;
        this.name = name;
    }

    public String getHno() {
        return hno;
    }

    public void setHno(String hno) {
        this.hno = hno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student: "  + hno + " - " + name;
    }
}
