package kap.newbie.functional_programming.test.task14collect.service;

import kap.newbie.functional_programming.test.task14collect.model.Department;
import kap.newbie.functional_programming.test.task14collect.model.Employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Alexandr Korovkin
 */
public class CreateListDepartment {
    public static final File EMPLOYEES_1 = new File("./resources/streams/test/task14collect/employees_1.txt");
    public static final File EMPLOYEES_2 = new File("./resources/streams/test/task14collect/employees_2.txt");
    public static final File EMPLOYEES_3 = new File("./resources/streams/test/task14collect/employees_3.txt");
    public static final File EMPLOYEES_4 = new File("./resources/streams/test/task14collect/employees_4.txt");

    public static final File DEPARTMENTS = new File("./resources/streams/test/task14collect/departments.txt");

    private static final Pattern EMPLOYEE_PATTERN = Pattern.compile("name=(\\w+?), " +
            "age=(\\d+?), isMale=(\\w+?), position=(\\w+?);");
    private static final Pattern DEPARTMENT_PATTERN = Pattern.compile("name=(\\w+?), " +
            "vacancy_amount=(\\d+?);");

    private static final List<File> files = List.of(EMPLOYEES_1, EMPLOYEES_2, EMPLOYEES_3, EMPLOYEES_4);

    private CreateListDepartment(){}

    public static List<Department> getDepartmentList(){
        List<Department> departments = new ArrayList<>();

        Matcher depMatcher = DEPARTMENT_PATTERN.matcher(readFile(DEPARTMENTS));
        while (depMatcher.find()){
            departments.add(new Department(depMatcher.group(1),
                    Integer.parseInt(depMatcher.group(2))));
        }

        for (int i = 0; i < departments.size(); ++i) {
            if (files.get(i) != null){
                List<Employee> employees = getEmployeeList(files.get(i));
                departments.get(i).setEmployees(employees);
                if (departments.get(i).getVacancyAmount() < employees.size()) {
                    departments.get(i).setVacancyAmount(employees.size());
                }
            }
        }

        return departments;
    }

    private static List<Employee> getEmployeeList(File file){
        List<Employee> employees = new ArrayList<>();

        Matcher empMatcher = EMPLOYEE_PATTERN.matcher(readFile(file));
        while (empMatcher.find()){
            employees.add(new Employee(empMatcher.group(1),
                    Integer.parseInt(empMatcher.group(2)),
                    Boolean.parseBoolean(empMatcher.group(3)),
                    empMatcher.group(4)));
        }
        return employees;
    }

    public static List<Employee> getAllEmployeesList(){
        List<Employee> employees = new ArrayList<>();
        for (File file : files){
            employees.addAll(getEmployeeList(file));
        }
        return employees;
    }

    private static String readFile(File file){
        StringBuilder inputData = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String in;
            while ((in = reader.readLine()) != null){
                inputData.append(in);
            }
        } catch (IOException exception){
            System.out.println(exception.getMessage());
        }

        return inputData.toString();
    }
}
