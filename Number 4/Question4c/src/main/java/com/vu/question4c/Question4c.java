/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vu.question4c;

/**
 *
 * @author HP
 */
public class Question4c {

   
    public static void main(String[] args) {
      
        double firstAirtime = 10000.0; // in UGX
        
        double chargePercentage = 10.0; // 10% charge on loaded airtime
        double costPerSecond = 200.0; // UGX per second

        int callTimeMinutes = 5; // in minutes
        int callTimeSeconds = callTimeMinutes * 60; // converting minutes to seconds

        double chargedAirtime = firstAirtime - (firstAirtime * chargePercentage / 100);

        double callCost = callTimeSeconds * costPerSecond;

        double remainingBalance = chargedAirtime - callCost;

       
        System.out.println("The remaining balance after the call is: UGX " + remainingBalance);


    }}
