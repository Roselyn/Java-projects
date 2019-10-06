package chapter3;

import java.util.Scanner;

public class ChangeForADollarGame {

    public static void main(String args[]){

        double penny = 1;
        double nickel = 5;
        double dime = 10;
        double quarter = 25;
        double winnerValue = 100;

        System.out.println("Enter how many pennies you want: ");
        Scanner scanner = new Scanner(System.in);
        double pennyQuantity = scanner.nextDouble();

        System.out.println("Enter how many nickels you want: ");
        double nickelQuantity = scanner.nextDouble();

        System.out.println("Enter how many dimes you want: ");
        double dimeQuantity = scanner.nextDouble();

        System.out.println("Enter how many quarters you want: ");
        double quarterQuantity = scanner.nextDouble();

        scanner.close();

        double Penny = pennyQuantity * penny;
        double Nickel = nickelQuantity * nickel;
        double Dime = dimeQuantity * dime;
        double Quarter = quarterQuantity * quarter;

        double valorTotal = (Penny + Nickel + Dime + Quarter);

        if(valorTotal == winnerValue){
            System.out.println("It's exactly $1, you won!!!");
        }
        else if (valorTotal < winnerValue){
            double loserValue = winnerValue - valorTotal;
            System.out.println("You've lost by " + loserValue);
        }
        else if (valorTotal > winnerValue){
            double overValue = valorTotal - winnerValue;
            System.out.println("You've lost by " + overValue);
        }
    }
}
