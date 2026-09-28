/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.electronicfranchiseyearlysales;

/**
 *
 * @author Lesedi
 */
public class ElectronicFranchiseYearlySales {

    public static void main(String[] args) {
        
        //Single array
        
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
         
       //2D- Array for each console sales
        
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };
        
        //Array for storing the total sales for each city
        
        int[] cityTotals = new int[3];
        
        //Declare and intialize variables
        int highestSales = 0;
        String cityWithMostSales = "";
        
         // Display heading
        System.out.println("==============================================");
        System.out.println("        NUMBER 1 ELECTRONIC SALES REPORT");
        System.out.println("==============================================");

        // Display the column headings
        System.out.printf("%-20s %-10s %-10s %-10s %-10s%n",
                "CITY", "PS5", "XBOX", "SWITCH", "TOTAL");

        System.out.println("--------------------------------------------------------------");

        // Loop through the rows
        for (int i = 0; i < sales.length; i++) {

            // Calculate total sales for each city
            int total = 0;

            for (int j = 0; j < sales[i].length; j++) {
                total = total + sales[i][j];
            }
        
        // Store the total in the single array
            cityTotals[i] = total;

            // Display the sales report
            System.out.printf("%-20s %-10d %-10d %-10d %-10d%n",
                    cities[i],
                    sales[i][0],
                    sales[i][1],
                    sales[i][2],
                    cityTotals[i]);

            // Check which city has the highest sales
            if (cityTotals[i] > highestSales) {
                highestSales = cityTotals[i];
                cityWithMostSales = cities[i];
            }
        }

        System.out.println("--------------------------------------------------------------");

        // Display the city with the most sales
        System.out.println("City with the most gaming console sales: "
                + cityWithMostSales);
        System.out.println("Total sales: " + highestSales);

        System.out.println("==============================================");
    }
        
      }

