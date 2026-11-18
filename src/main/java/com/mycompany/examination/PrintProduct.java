
package com.mycompany.examination;

public class PrintProduct {

    // Print individual product sales
    public void PrintSales(Product product) {

        String[] names = product.getProductNames();

        int[][] sales = product.getProductSales();

        System.out.println("\nPRODUCT SALES DETAILS");

        System.out.println("--------------------------------");

        for (int i = 0; i < names.length; i++) {

            System.out.println(names[i]);

            for (int j = 0; j < sales[i].length; j++) {

                System.out.println("Month " + (j + 1) + ": " + sales[i][j]);
            }

            System.out.println("Product total: " + product.getProductTotal(i));

            System.out.println();
        }
    }

    // Print total sales
    public void PrintTotalSales(Product product) {

        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductsSold());
    }

    // Print average sales
    public void PrintAverageSales(Product product) {

        System.out.printf("AVERAGE PRODUCT SALES: %.0f%n",product.GetAverageProductSold());
    }

    // Print most popular product
    public void PrintMostPopularProduct(Product product) {

        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
    }

    // Print complete report
    public void PrintReport(Product product) {

        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println();
        System.out.println("****************************************");

        PrintTotalSales(product);

        PrintAverageSales(product);

        PrintMostPopularProduct(product);
    }
}
