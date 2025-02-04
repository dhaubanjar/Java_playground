package bankapplication;
// Child Class to Account class
public class Checking extends Account{
    // List properties specific to checking account
    private int debitCardNumber;
    private int debitCardPin;

    // Constructor to initialize checking account properties
    public Checking(String name, String SSN, double initDeposit){
        super(name, SSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }

    // Using Abstract method from Account, this method is called in Account
    @Override
    public void setRate(){
        rate = getBaseRate() * 0.15;
    }

    // List any methods specific to the checking account

    public void setDebitCard(){
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPin = (int) (Math.random() * Math.pow(10, 4));
    }
    public void showInfo(){
        super.showInfo();
        System.out.println("YOUR CHECKING ACCOUNT FEATURES" +
                "\n  Debit Card Number: " + debitCardNumber +
                "\n  Debit Card PIN: " + debitCardPin
                );

    }
}
