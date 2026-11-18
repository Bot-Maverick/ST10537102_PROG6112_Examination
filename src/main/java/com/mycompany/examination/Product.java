
package com.mycompany.examination;

public class Product implements IProduct {

    private final String[] productNames;

    private final int[][] productSales;

    // Constructor
    public Product(String[] productNames, int[][] productSales) {

        if (productNames == null || productSales == null) {
            throw new IllegalArgumentException("Arrays cannot be null.");
        }

        if (productNames.length != productSales.length) {
            throw new IllegalArgumentException("Each product must have a sales row.");
        }

        for (int i = 0; i < productSales.length; i++) {

            if (productSales[i] == null || productSales[i].length != 3) {

                throw new IllegalArgumentException("Each product must have three months.");
            }

            for (int j = 0; j < productSales[i].length; j++) {

                if (productSales[i][j] < 0) {
                    throw new IllegalArgumentException("Sales cannot be negative.");
                }
            }
        }

        this.productNames = productNames;
        this.productSales = productSales;
    }

    // Calculate total products sold
    @Override
    public int GetTotalProductsSold() {

        int total = 0;

        for (int i = 0; i < productSales.length; i++) {

            for (int j = 0; j < productSales[i].length; j++) {

                total += productSales[i][j];
            }
        }

        return total;
    }

    // Calculate average products sold
    @Override
    public double GetAverageProductSold() {

        int total = GetTotalProductsSold();

        int numberOfEntries = 0;

        for (int i = 0; i < productSales.length; i++) {

            numberOfEntries += productSales[i].length;
        }

        if (numberOfEntries == 0) {
            return 0;
        }

        return (double) total / numberOfEntries;
    }

    // Find most popular product
    @Override
    public String GetMostPopularProduct() {

        if (productNames.length == 0) {
            return "No products available";
        }

        int highestTotal = -1;

        int highestIndex = 0;

        for (int i = 0; i < productSales.length; i++) {

            int productTotal = 0;

            for (int j = 0; j < productSales[i].length; j++) {

                productTotal += productSales[i][j];
            }

            if (productTotal > highestTotal) {

                highestTotal = productTotal;

                highestIndex = i;
            }
        }

        return productNames[highestIndex] + " (" + highestTotal + ")";
    }

    // Return product names
    public String[] getProductNames() {

        return productNames;
    }

    // Return sales array
    public int[][] getProductSales() {

        return productSales;
    }

    // Calculate total for one product
    public int getProductTotal(int productIndex) {

        int total = 0;

        for (int j = 0; j < productSales[productIndex].length; j++) {

            total += productSales[productIndex][j];
        }

        return total;
    }
}

