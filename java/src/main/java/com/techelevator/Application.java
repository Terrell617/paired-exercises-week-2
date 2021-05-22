package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private List<Department> departments = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();

    /**
     * The main entry point in the application
     * @param args
     */
    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }

    private void run() {
        // create some departments
        createDepartments();

        // print each department by name
        printDepartments();

        // create employees
        createEmployees();

        // give Angie a 10% raise, she is doing a great job!

        // print all employees
        printEmployees();

        // create the TEams project
        createTeamsProject();
        // create the Marketing Landing Page Project
        createLandingPageProject();

        // print each project name and the total number of employees on the project
        printProjectsReport();
    }

    /**
     * Create departments and add them to the collection of departments
     */
    private void createDepartments() {

        Department marketing = new Department(1, "Marketing");
        Department sales = new Department(2, "Sales");
        Department engineering = new Department(3, "Engineering" );

        departments.add(marketing);
        departments.add(sales);
        departments.add(engineering);


    }

    /**
     * Print out each department in the collection.
     */
    private void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");
        for (int i=0; i<departments.size(); i++){
            System.out.println(departments.get(i).getName());
        }

    }

    /**
     * Create employees and add them to the collection of employees
     */
    private void createEmployees() {
        Employee deanJohnson = new Employee();
        deanJohnson.setEmployeeId(1);
        deanJohnson.setFirstName("Dean");
        deanJohnson.setLastName("Johnson");
        deanJohnson.setEmail("djohnson@teams.com");
        deanJohnson.setDepartment(departments.get(2));
        deanJohnson.setHireDate("08/21/2020");

        Employee angieSmith = new Employee(2, "Angie", "Smith", "asmith@teams.com", departments.get(2),"08/21/2020");

        Employee margaretThompson = new Employee( 3,"Margaret", "Thompson", "mthompson@teams.com", departments.get(0),"08/21/2020");

        angieSmith.raiseSalary(10);

        employees.add(deanJohnson);
        employees.add(angieSmith);
        employees.add(margaretThompson);


    }

    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");

        for (int i=0; i<employees.size(); i++){
            System.out.println(employees.get(i).getFullName()+" (" + employees.get(i).getSalary()+ ") "+ employees.get(i).getDepartment().getName());
        }

    }

    /**
     * Create the 'TEams' project.
     */
    private void createTeamsProject() {

    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createLandingPageProject() {

    }

    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");

    }

}
