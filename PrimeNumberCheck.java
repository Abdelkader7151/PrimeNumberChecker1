package primePackage;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PrimeNumberProgram primeProgram = new PrimeNumberProgram();

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        primeProgram.setNumber(number);

        primeProgram.displayResult();

        scanner.close();
    }
}
