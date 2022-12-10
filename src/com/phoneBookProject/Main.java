package com.phoneBookProject;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    static HashMap < String, Integer > Contacts;
    static Scanner in;

    public static void main(String[] args) {
        Contacts = new HashMap < > ();

        Contacts.put("suman", 222222);



        in= new Scanner(System.in);

        displayMenu();

    }

    private static void displayMenu() {
        System.out.println("");
        System.out.println("--------------------------");
        System.out.println("What would you like to do?");
        System.out.println("1. Display All Contactst");
        System.out.println("2. Save Contact");
        System.out.println("3. Find Contact");
        System.out.println("4. Remove Contact");


        int choice = in.nextInt();
        in.nextLine();

        switch(choice){
            case 1:
                displayContacts();
                displayMenu();
                break;
            case 2:
                saveContact();
                displayMenu();
                break;
            case 3:
                findContact();
                displayMenu();
                break;
            case 4:
                removeContact();
                displayMenu();
                break;
            default:

                break;
        }


    }

    private static void removeContact() {
        System.out.println("Please Enter Name");

        String name = in.next();
        in.nextLine();


        System.out.println(Contacts.remove(name));
    }

    private static void findContact() {
        System.out.println("Please Enter Name");

        String name = in.next();
        in.nextLine();

        System.out.println(Contacts.get(name));

    }

    private static void saveContact() {
        System.out.println("Please Enter Name");
        String name = in.next();
        in.nextLine();
        System.out.println("Please Enter Number");
        int num = in.nextInt();
        in.nextLine();
        Contacts.put(name, num);
        System.out.println("Contact saved Successfully");
    }

    private static void displayContacts() {
        ArrayList < String > keys = Contacts.keySet();
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i) + " " + Contacts.get(keys.get(i)));
        }

    }
}
