package bankapplication;

// Child Class to Account class
public class Savings extends Account{
    // List properties specific to savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    // Constructor to initialize settings for the Savings properties
    public Savings(String name, String SSN, Double initDeposit){
        super(name, SSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();

    }

    // Using Abstract method from Account, this method is called in Account
    @Override
    public void setRate(){
        rate = getBaseRate() - 0.25;
    }

    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10,3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10,4));
    }

    // List any methods specific to savings account
    public void showInfo(){
        super.showInfo();
        System.out.println("YOUR SAVINGS ACCOUNT FEATURES" +
        "\n  Safety Deposit Box ID: " + safetyDepositBoxID +
        "\n  Safety Deposit Box Key: " + safetyDepositBoxKey
        );
    }
}
