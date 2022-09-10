package application;

import entities.EmployeeClass100;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramClass100 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<EmployeeClass100> list = new ArrayList<>();

        System.out.print("How many employees will be registraded? ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            System.out.println();
            System.out.println("Employee #" + (i + 1)+ ": ");
            System.out.print("Id: ");
            Integer id  = sc.nextInt();
            while (position(list, id)){
                System.out.println("Id already taken! Try again:");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            EmployeeClass100 emp = new EmployeeClass100(id, name, salary);

            list.add(emp);

        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int idsalaray = sc.nextInt();

        EmployeeClass100 emp = list.stream().filter(x -> x.getId() == idsalaray).findFirst().orElse(null);

        //Integer pos = position(list, idsalaray);
        if (emp == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (EmployeeClass100 e: list) {
            System.out.println(e);
        }

        sc.close();
    }

    public static Boolean position(List<EmployeeClass100> list, int id) {
        EmployeeClass100 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}

