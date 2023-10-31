package com.cfgs.dam.io.ejemplos;

import java.util.Scanner;
public class Test13ScannerTokenizingText {
    public static void main(String[] args) {
        String text = "4231, Java Programming, 1000,00";
        // String text = "4231, Java Programming, 1000.00";
        Scanner scanner = new Scanner(text).useDelimiter(",\\s*");
        int checkNumber = scanner.nextInt();
        String description = scanner.next();
        //String samount   = scanner.next();
        //double amount = Double.parseDouble(samount);
        float amount = scanner.nextFloat();
        System.out.printf("/***** Tokenizing Text *****/\n\n");
        System.out.printf("String to tokenize: %s\n", text);
        System.out.printf("checkNumber: %d\n", checkNumber);
        System.out.printf("description: %s\n", description);
        System.out.printf("amount: %f", amount);
    }
}
