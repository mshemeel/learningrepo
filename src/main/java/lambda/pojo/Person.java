package main.java.lambda.pojo;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String dob;
    private double salary;
    private String salCreditDate;
    private String department;

    //Default Constructor
    public Person() {
    }

    //Parameterized constructor
    public Person(String name, int age, String dob, double salary, String salCreditDate,String department) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.salary = salary;
        this.salCreditDate = salCreditDate;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSalCreditDate() {
        return salCreditDate;
    }

    public void setSalCreditDate(String salCreditDate) {
        this.salCreditDate = salCreditDate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;

        if (age != person.age) return false;
        if (Double.compare(person.salary, salary) != 0) return false;
        if (!Objects.equals(name, person.name)) return false;
        if (!Objects.equals(dob, person.dob)) return false;
        if (!Objects.equals(salCreditDate, person.salCreditDate))
            return false;
        return Objects.equals(department, person.department);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (dob != null ? dob.hashCode() : 0);
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (salCreditDate != null ? salCreditDate.hashCode() : 0);
        result = 31 * result + (department != null ? department.hashCode() : 0);
        return result;
    }
}
