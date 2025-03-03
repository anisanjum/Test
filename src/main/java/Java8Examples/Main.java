package Java8Examples;

import java.util.*;
import java.util.stream.Collectors;

// https://medium.com/@veenaraofr/java8-stream-api-commonly-asked-questions-about-employee-highest-salary-99c21cec4d98

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + '}';
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee("John", 28),
                new Employee("Sarah", 32),
                new Employee("Tom", 45),
                new Employee("Anna", 25),
                new Employee("Mike", 30)
        );

        // Partition employees by age
        Map<Boolean, List<Employee>> partitionEmployeesByAge =
                empList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 30));

//        for (Map.Entry<Boolean, List<Employee>> entry : partitionEmployeesByAge.entrySet()) {
//            System.out.println("entry.getKey() : " + entry.getKey());
//            System.out.println("entry.getValue() : " + entry.getValue());
//        }

        for (Map.Entry<Boolean, List<Employee>> entry : partitionEmployeesByAge.entrySet()) {
            if (Boolean.TRUE.equals(entry.getKey())) {
                System.out.println("Employees greater than 30 years :: " + entry.getValue());
            } else {
                System.out.println("Employees less than or equal to 30 years :: " + entry.getValue());
            }
        }

//        Set<Map.Entry<Boolean, List<Employee>>> empSet = partitionEmployeesByAge.entrySet();
//
//        for (Map.Entry<Boolean, List<Employee>> entry : empSet) {
//            if (Boolean.TRUE.equals(entry.getKey())) {
//                System.out.println("Employees greater than 30 years :: " + entry.getValue());
//            } else {
//                System.out.println("Employees less than or equal to 30 years :: " + entry.getValue());
//            }
//        }

        // Get the max age of the employee
        int maxAge = empList.stream().mapToInt(Employee::getAge).max().getAsInt();
        System.out.println("maxAge: " + maxAge);

        // Get the employee with max age
        Optional<Employee> maxAgeEmployee = empList.stream().max(Comparator.comparingInt(Employee::getAge));
        System.out.println("maxAgeEmployee: " + maxAgeEmployee);

        // Sort employees by age using List.sort() with a lambda expression
        empList.sort(Comparator.comparingInt(Employee::getAge));
        // OR
        // Collections.sort(empList, Comparator.comparingInt(Employee::getAge));
        // Print sorted employees
        System.out.println("----------------------------");
        empList.forEach(System.out::println);

        // Alternatively, you can use streams to sort the employees and collect them into a new list
        List<Employee> sortedEmployees = empList.stream()
                .sorted(Comparator.comparingInt(Employee::getAge))
                .collect(Collectors.toList());
        // Print sorted employees
        System.out.println("----------------------------");
        sortedEmployees.forEach(System.out::println);


    }
}
