
package com.mycompany.examination;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Single-dimensional array
        try (Scanner input = new Scanner(System.in)) {
            
            String[] productNames = {"Cozy Nights Monarch","Restonic Barbados","Sealy Phuket"};
            
            // Two-dimensional array
            int[][] productSales = new int[3][3];
            
            // Capture product sales
            for (int i = 0; i < productNames.length; i++) {
                
                for (int j = 0; j < productSales[i].length; j++) {
                    
                    int sales;
                    
                    while (true) {
                        
                        System.out.print("Enter number of sales for month " + (j + 1) + " for " + productNames[i] + " mattress: ");
                        
                        if (input.hasNextInt()) {
                            
                            sales = input.nextInt();
                            
                            if (sales >= 0) {productSales[i][j] = sales;
                                break;
                            } else {
                                System.out.println("Sales cannot be negative. Try again.");
                            }
                            
                        } else {
                            System.out.println("Please enter a whole number.");
                            input.next();
                        }
                    }
                }
                
                System.out.println();
            }
            
            // Create Product object
            Product product = new Product(productNames, productSales);
            
            // Create report object
            PrintProduct report = new PrintProduct();
            
            // Display report
            report.PrintSales(product);
            report.PrintReport(product);
        }
    }
}
