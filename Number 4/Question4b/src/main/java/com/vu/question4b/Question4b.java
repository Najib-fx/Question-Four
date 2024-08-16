/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vu.question4b;

/**
 *
 * @author HP
 */
public class Question4b {


       public static void main(String[] args) {
 
        double totalPorridge = 2.0; // in liters
        double totalMilk = 2.0; // in liters

       
        double halfCup = 0.5; // half cup is 0.5 liters
        double porridgeTime = 45; // in minutes
        double milkTime = 30; // in minutes
        
        double totalTime = 0;

        while (totalPorridge > 0 || totalMilk > 0) {
            if (totalPorridge > 0) {
                totalPorridge -= halfCup;
                totalTime += porridgeTime;
            }

            if (totalMilk > 0) {
                totalMilk -= halfCup;
                totalTime += milkTime;
            }
        }

        System.out.println("Total time taken for porridge and milk: " + totalTime + " minutes");
       }}
