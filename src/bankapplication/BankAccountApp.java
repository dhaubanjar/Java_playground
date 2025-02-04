package bankapplication;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args){
        String file = "/Users/rajdhaubanjar/Desktop/All Projects/JAVA/Playground/src/NewBankAccounts.csv";
//        Checking chkacc1 = new Checking("Stewie griffin", "123456789", 1500);
//        Savings savcc1 = new Savings("Bryan Griffin", "132465879", 5000);
//
//        chkacc1.showInfo();
//        System.out.print("\n******************\n");
//        savcc1.showInfo();
//
//        savcc1.deposit(5000);
//        savcc1.withdraw(1000);
//        savcc1.transfer("Meg Griffin", 4);
//        savcc1.compound();


        // Read a csv file then create new accounts based on that data
        List<Account> accounts = new LinkedList<Account>();
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolders) {
            String name = accountHolder[0];
            String SSN = accountHolder[1];
            String accountType = accountHolder[2];
            Double initDeposit = Double.parseDouble(accountHolder[3]);
            if (accountType.equals("Savings")) {
                accounts.add(new Savings(name, SSN, initDeposit));
            }
            else if (accountType.equals("Checking")) {
                accounts.add(new Checking(name, SSN, initDeposit));
            }
            else {
                System.out.println("Error reading account type.");
            }
        }
        for (Account acc : accounts) {
            acc.showInfo();
            System.out.println("------------------");
        }
    }
}
