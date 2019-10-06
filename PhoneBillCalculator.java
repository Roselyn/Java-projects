package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {

    static double chargeOver = 0.25;
    static double subtotalTax = 0.15;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

        double baseCost = getBaseCost();
        double overageMinutes = getOverageMinutes();
        scanner.close();

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: " + baseCost);

        double overageCalc = calculateOverageMinutes(overageMinutes, chargeOver);
        double taxCalc = calculateTax(overageCalc, baseCost, subtotalTax);
        double totalCalc = calculateBillTotal(baseCost, overageCalc, taxCalc);

    }
    public static double getBaseCost(){
        System.out.println("Enter base cost of the plan: ");
        double baseCost = scanner.nextDouble();
        return baseCost;
    }
    public static double getOverageMinutes(){
        System.out.println("Enter overage minutes: ");
        double overageMinutes = scanner.nextDouble();
        return overageMinutes;
    }

    public static double calculateOverageMinutes(double overageMinutes, double chargeOver) {
        double calculationMinutes = overageMinutes * chargeOver;
        System.out.println("Overage: $" + calculationMinutes);
        return calculationMinutes;
    }

    public static double calculateTax(double calculationMinutes, double baseCost, double subtotalTax){
        double calculateSubTotal = (calculationMinutes + baseCost) * subtotalTax;
        System.out.println("Tax: $" +calculateSubTotal);
        return calculateSubTotal;
    }

    public static double calculateBillTotal(double baseCost, double calculateSubtotal, double calculationMinutes){
        double billTotal = baseCost + calculateSubtotal + calculationMinutes;
        System.out.println("Total: $" +billTotal);
        return billTotal;
    }

}