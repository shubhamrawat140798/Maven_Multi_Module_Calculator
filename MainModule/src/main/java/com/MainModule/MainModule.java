package com.MainModule;

import com.OperationModule.OperationModule;

import java.util.Scanner;
public class MainModule {
    public static void main(final String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("\nEnter first number: ");
            int a = scanner.nextInt();
            System.out.print("\nEnter second number: ");
            int b = scanner.nextInt();
            System.out.println("Operations ");
            System.out.println("1. ADD");
            System.out.println("2. SUBTRACT");
            System.out.println("3. MULTIPLY ");
            System.out.println("4. Divide");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            OperationModule calculate = new OperationModule();
            switch (choice) {
                case 1:
                    calculate.add(a, b);
                    break;
                case 2:
                    calculate.sub(a, b);
                    break;
                case 3:
                    calculate.mul(a, b);
                    break;
                case 4:
                    calculate.div(a, b);
                    break;
                default:
                    System.out.println("Wrong Input");
            }
        }
    }
}
