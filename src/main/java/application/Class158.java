package application;

import entities.AccountClass156;
import entities.BusinessAccountClass156;
import entities.SavingsAccount;

//Sobreposicao, palavra super, anotacao @Override
public class Class158 {

    public static void main(String[] args) {

        AccountClass156 acc1 = new AccountClass156(1001, "Alex", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        AccountClass156 acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        AccountClass156 acc3 = new BusinessAccountClass156(1003, "Bob", 1000.0, 500.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());
    }
}
