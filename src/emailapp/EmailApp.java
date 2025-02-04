package emailapp;

import emailapp.Email;

public class EmailApp{

    public static void main(String[] args){
        Email em1 = new Email("Ryan", "Gosling");
        System.out.println(em1.showInfo());

    }
}