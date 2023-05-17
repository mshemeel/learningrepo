package main.java.equalsAndHashCode;

import java.util.Objects;

public class Student {
    private int id;
    private String fname;
    private String lname;
    private String sex;
    private String age;
    private String dob;

    // equals and hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;

        if (id != student.id) return false;
        if (!fname.equals(student.fname)) return false;
        if (!lname.equals(student.lname)) return false;
        if (!sex.equals(student.sex)) return false;
        if (!age.equals(student.age)) return false;
        return dob.equals(student.dob);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + fname.hashCode();
        result = 31 * result + lname.hashCode();
        result = 31 * result + sex.hashCode();
        result = 31 * result + age.hashCode();
        result = 31 * result + dob.hashCode();
        return result;
    }




    public Student(int id, String fname, String lname, String sex, String age, String dob) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.sex = sex;
        this.age = age;
        this.dob = dob;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }
}
