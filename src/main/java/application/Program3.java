package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

import javax.xml.namespace.QName;

public class Program3 {

        public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            Employee emp = new Employee();

            System.out.print("Name: ");
            emp.name = sc.nextLine();
            System.out.print("Gross salary: ");
            emp.grossSalary = sc.nextDouble();
            System.out.print("Tax: ");
            emp.tax = sc.nextDouble();

            System.out.println();
            System.out.println("Employee: " + emp);
            System.out.println();
            System.out.print("Which percentage to increase salary? ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);

            System.out.println();
            System.out.println("Update data: " + emp);

            sc.close();
        }
}
