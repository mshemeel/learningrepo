package main.java.lambda;

import main.java.lambda.pojo.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeStreamOperations {
    public static void main(String [] args){
        List<Employee> employees = constructEmp();

        //TreeMap test
        TreeMap<Employee,String> treeMap = new TreeMap<>(Comparator.comparing(Employee::getDepartment));
        treeMap.put(new Employee("1","Technical-3",true,50000.00,"Male",25),"one");
        treeMap.put(new Employee("3","Technical-2",true,50000.00,"Female",25),"one");
        treeMap.put(new Employee("2","Technical-1",true,50000.00,"Female",25),"one");

        treeMap.entrySet().forEach( entry -> {
            System.out.println(entry.getKey());
        });

        System.out.println("employees working in each department");
        Map<String, List<Employee>> empMap = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.toList()));
        empMap.entrySet().forEach(entry-> {
            System.out.println(entry.getKey() + "---" + entry.getValue());
        });


        System.out.println("count of employees in each dept");
        Map<String,Long> empCountMap =  employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        empCountMap.entrySet().forEach(entry-> System.out.println(entry.getKey() + "---" + entry.getValue()));

        System.out.println("active employees in given collection");
        List<Employee> activeEmpList = employees.stream().filter(Employee::isActive).collect(Collectors.toList());
        activeEmpList.forEach(System.out::println);


        System.out.println("Max salary from employee");
        Employee empMaxSal = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary,Comparator.reverseOrder()))
                .findFirst()
                .get();
        //or
        Employee empMinSal =employees.stream()
                .min(Comparator.comparing(Employee::getSalary))
                .get();

        Double aDouble = employees.stream()
                .min(Comparator.comparing(Employee::getSalary))
                .map(Employee::getSalary)
                .get();


        //or
        System.out.println(employees.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))).get());
        System.out.println("Max-sal"+empMaxSal);
        System.out.println("Min-sal"+empMinSal);

        System.out.println("Max salary in dept");
        Map<String,Optional<Employee>> empMaxSalMap =  employees.stream()
                .collect(Collectors
                        .groupingBy(Employee::getDepartment, Collectors
                                .maxBy(Comparator.comparing(Employee::getSalary))));
        empMaxSalMap.entrySet().forEach(entry-> System.out.println(entry.getKey() + "---" + entry.getValue().get()));

        Map<String, Optional<Employee>> maxSalInDept = employees.stream()
                .collect(Collectors
                        .groupingBy(Employee::getDepartment, Collectors
                                .maxBy(Comparator
                                        .comparing(Employee::getSalary))));

        System.out.println("Average Age of male and female");
        Map<String, Double> empAgeMap = employees.stream()
                .collect(Collectors.groupingBy(Employee::getSex,Collectors.averagingInt(Employee::getAge)));
        System.out.println(empAgeMap);

        System.out.println("Average Salary in each dept");
        Map<String,Double> avgSalMap = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSalMap);

        System.out.println("Youngest employee in Technical");
        Employee youngestEmpInTech = employees.stream()
                .filter(employee -> "Technical".equals(employee.getDepartment()))
                .min(Comparator.comparing(Employee::getAge)).get();
        System.out.println(youngestEmpInTech);

        System.out.println("Youngest male employee in each dep");
        Map<String, Optional<Employee>> youngestEmpInEachDep =
                employees.stream()
                        .filter(employee -> "Male".equals(employee.getSex()))
                        .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.minBy(Comparator.comparing(Employee::getAge))));

        System.out.println(youngestEmpInEachDep);

        System.out.println("Split by emp age greater than 25");
        Map<Boolean, Long> agePartitionEmpMap = employees.stream().collect(Collectors.partitioningBy(employee -> employee.getAge() > 25,Collectors.counting()));
        System.out.println(agePartitionEmpMap);

        System.out.println("Frequency");
        System.out.println(Collections.frequency(employees,new Employee("7","Technical",true,50000.00,"Male",21)));

    }


    //initialize
    private static List<Employee> constructEmp() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("1","Technical",true,50000.00,"Male",24));
        employees.add(new Employee("2","Technical",false,50000.00,"Female",25));
        employees.add(new Employee("3","Management",true,200000.00,"Male",27));
        employees.add(new Employee("4","Management",false,200000.00,"Female",28));
        employees.add(new Employee("5","Support",true,30000.00,"Male",30));
        employees.add(new Employee("6","Support",false,30000.00,"Female",35));
        employees.add(new Employee("7","Technical",true,50000.00,"Male",21));
        employees.add(new Employee("7","Technical",true,50000.00,"Male",23));
        return  employees;
    }

    private void myMethod(List< ? extends Employee> employees){

        //List of employee
    }

    protected <T extends Employee> void save( T employee) {

        //single employee
    }
}
