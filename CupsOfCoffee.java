package chapter2;

import java.util.Scanner;

public class CupsOfCoffee {

    public static void main(String arg[]){
        System.out.println("Write the name of a season:");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();

        System.out.println("Write a whole number:");
        String wholeNumber = scanner.nextLine();

        System.out.println("Write an adjective:");
        String prettyWord = scanner.nextLine();
        scanner.close();

        System.out.println("On a " + prettyWord + " " + season + " day, I drink a minimum of " + wholeNumber + " cups of coffee");
    }
}
