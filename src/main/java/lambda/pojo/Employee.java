package main.java.lambda.pojo;

import java.util.Objects;

public class Employee {
    private String empId;
    private String department;
    private boolean isActive;
    private double salary;
    private String sex;
    private int age;

    public Employee(String empId, String department, boolean isActive, double salary, String sex, int age) {
        this.empId = empId;
        this.department = department;
        this.isActive = isActive;
        this.salary = salary;
        this.sex = sex;
        this.age = age;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", department='" + department + '\'' +
                ", isActive=" + isActive +
                ", salary=" + salary +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return isActive() == employee.isActive() && Double.compare(employee.getSalary(), getSalary()) == 0 && getAge() == employee.getAge() && getEmpId().equals(employee.getEmpId()) && getDepartment().equals(employee.getDepartment()) && getSex().equals(employee.getSex());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmpId(), getDepartment(), isActive(), getSalary(), getSex(), getAge());
    }
}
