package Validate;

import java.util.Scanner;

public class Validate {
    Scanner scanner = new Scanner(System.in);
    public String Validate(String string){
        String REGEX ="^[A-Za-z_]+";
        System.out.println("Input "+string+":");

        while (true){
            String name = scanner.nextLine();
            if (name.matches(REGEX)){
                return name;
            }
            else {
                System.out.println("nhap lai");
            }
        }
    }
    public String ValidateID(String string){
        String REGEX ="^[0-9]{4,6}+";
        System.out.println("Input 4 -6 numbers");
        System.out.println("Input "+string+":");
        while (true){
            String name = scanner.nextLine();
            if (name.matches(REGEX)){
                return name;
            }
            else {
                System.out.println("nhap lai");
            }
        }
    }
    public String ValidateNumber(String string){
        String REGEX ="^[0-9]\\.000+";
        System.out.println("Input "+string+":");

        while (true){
            String name = scanner.nextLine();
            if (name.matches(REGEX)){
                return name;
            }
            else {
                System.out.println("nhap lai");
            }
        }
    }
    public String ValidateAmount(String string){
        String REGEX ="^[0-9]{1,64}+";
        System.out.println("Please just buy 1-64");
        System.out.println("Input "+string+":");
        while (true){
            String name = scanner.nextLine();
            if (name.matches(REGEX)){
                return name;
            }
            else {
                System.out.println("nhap lai");
            }
        }
    }
}
