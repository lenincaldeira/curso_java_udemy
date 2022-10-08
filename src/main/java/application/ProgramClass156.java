package application;

import entities.AccountClass156;
import entities.BusinessAccountClass156;
import entities.SavingsAccount;

public class ProgramClass156 {

    public static void main(String[] args) {

        AccountClass156 acc = new AccountClass156(1001, "Alex", 0.0);
        BusinessAccountClass156 bacc = new BusinessAccountClass156(1002, "Maira", 0.0, 500.0);

        // UPCASTING

        AccountClass156 acc1 = bacc;
        AccountClass156 acc2 = new BusinessAccountClass156(1003, "Bob", 0.0, 200.0);
        AccountClass156 acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING

        BusinessAccountClass156 acc4 = (BusinessAccountClass156)acc2;
        acc4.loan(100.0);

        // BusinessAccountClass156 acc5 = (BusinessAccountClass156)acc3;
        if (acc3 instanceof BusinessAccountClass156) {
            BusinessAccountClass156 acc5 = (BusinessAccountClass156)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }
//
        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            System.out.println("Update!");
        }

    }
}
