package MODUL1;

import java.util.Scanner;

public class User {

    // TODO Create Attribute of User; Name and Phone Number then Create Setter
    
    // TODO Create Method to Register User and Display User's Name and Phone Number and success message
    Scanner input = new Scanner(System.in);
    public String register(){
        System.out.println("Name: ");
        String nama = input.next();
        System.out.println("No. Handphone: ");
        String nomer = input.next();

        System.out.println("Register Success\n");
        System.out.println("Name: \n"+nama);
        System.out.println("Phone Number\n"+nomer);
        System.out.println("======================\n");
    }


}
