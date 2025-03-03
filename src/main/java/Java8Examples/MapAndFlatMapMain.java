package Java8Examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee1 {
    private String name;
    private List<Project> projects;

    public Employee1(String name, List<Project> projects) {
        this.name = name;
        this.projects = projects;
    }

    public String getName() {
        return name;
    }

    public List<Project> getProjects() {
        return projects;
    }
}

class Project {
    private String projectName;

    public Project(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }
}

public class MapAndFlatMapMain {
    public static void main(String[] args) {

        // Given a class Employee and employee class has a list of Projects.
        // An employee can have multiple projects. Print the employees having projects using java8.

        List<Employee1> employees = Arrays.asList(
                new Employee1("Alice", Arrays.asList(new Project("Project A"))),
                new Employee1("Bob", Arrays.asList()),
                new Employee1("Charlie", Arrays.asList(new Project("Project B"), new Project("Project C"))),
                new Employee1("Diana", Arrays.asList())
        );

        // Find employees who have projects
        List<Employee1> employeesWithProjects = employees.stream()
                .filter(employee -> !employee.getProjects().isEmpty())
                .collect(Collectors.toList());

        // Output results
        employeesWithProjects.forEach(employee ->
                System.out.println("Employee: " + employee.getName())
        );

        // Find the projects of the employees using java8

        // Get all projects for employees who have projects
        List<Project> allProjects = employees.stream()
                .filter(employee -> !employee.getProjects().isEmpty())  // Filter employees with projects
                .flatMap(employee -> employee.getProjects().stream())   // Flatten the projects into a single stream
                .collect(Collectors.toList());                          // Collect projects into a list

        // Output results
        allProjects.forEach(project ->
                System.out.println("Project: " + project.getProjectName())
        );
    }
}
