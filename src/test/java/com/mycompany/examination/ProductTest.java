
package com.mycompany.examination;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductTest {

    private Product product;

    @BeforeEach
    public void setUp() {

        String[] names = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        int[][] sales = {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
        };

        product = new Product(names, sales);
    }

    // Test total products sold
    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {

        assertEquals(
            153,
            product.GetTotalProductsSold()
        );
    }

    // Test average products sold
    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {

        assertEquals(
            17.0,
            product.GetAverageProductSold(),
            0.001
        );
    }

    // Test most popular product
    @Test
    public void GetMostPopularProduct_WithValidData_ReturnsCorrectValue() {

        assertEquals(
            "Cozy Nights Monarch (63)",
            product.GetMostPopularProduct()
        );
    }

    private void assertEquals(int i, int GetTotalProductsSold) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
