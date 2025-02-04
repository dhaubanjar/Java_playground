package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "tesla.com";

    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        // Call a method asking for the department - return the department
        this.department = setDepartment();

        // Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);

        // Combine elements to generate the email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
    }

    // Ask for the department
    private String setDepartment(){
        System.out.println("For New Employee:" + "\nDEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) { return "sales";}
        else if (depChoice == 2) { return "development"; }
        else if (depChoice == 3) { return "account"; }
        else { return "general"; }

    }
    // Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i<length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);     // appends the rand into password char array
        }
        return new String(password); // returning char[] character Array as a string.
    }

    // Set the mailbox capacity
    // Setter method
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;        // encapsulation
    }

    // Set the alternate email
    // Setter method
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    // Change the password
    public void changePassword(String password){
        this.password = password;
    }

    // Access the private variables using getter method
    public int getMailboxCapacity() { return mailboxCapacity; }
    public String getAlternateEmail() { return alternateEmail;}
    public String getPassword() { return password; }

    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb" +
                "\nPASSWORD: " + password;
    }
}
