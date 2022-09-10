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
            System.out.println("\nEmployee #" + (i + 1)+ ": ");
            System.out.print("Id: ");
            Integer id  = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            EmployeeClass100 emp = new EmployeeClass100(id, name, salary);

            list.add(emp);

        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idsalaray = sc.nextInt();
        Integer pos = position(list, idsalaray);
        if (pos == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }

        sc.close();
    }

    public static Integer position(List<EmployeeClass100> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}

