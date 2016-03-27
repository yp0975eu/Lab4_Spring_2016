package com.branden;

import java.util.Scanner;

/**
 You are a recycling truck driver.
 You’ll like to collect some statistics on how much each of the houses on a certain street is recycling.

 Each house has to use crates for their recycling.
 This street is a little unusual since it only has 8 houses, and the city planner must have been a computer programmer, since the house numbers are 0, 1, 2, 3, 4, 5, 6, 7.

 (Hint – the house numbers are the same as array element indexes.)

 Write a program that asks for the number of recycling crates set out by each house.
 You should store this data in an array.

 •	How many recycling crates, in total, from all the houses on the street?
 •	What is the largest number of crates set out by any house?
 •	What is the smallest number of crates set out by any house?
 •	Which house had the most recycling? Display that house number.
 */
public class Problem2 {
    static void run(){
        int[] houses = new int[8];

        Scanner scanner = new Scanner( System.in );
        for (int i = 0; i < houses.length; i++) {
            System.out.println("How many creates where set out by house #" + i);
            houses[i] = scanner.nextInt();
        }
        int[] results;
        results = stats(houses);
        System.out.println( "Total number of crates: " + results[3] );
        System.out.println( "Highest number of crates: " + results[0] );
        System.out.println( "Smallest number of crates: " + results[1] );
        System.out.println( "House number: " + results[2]  + " had the highest crates.");

    }
    public static int getTotalCrates( int[] houses ){
        int totalCrates = 0;

        for (int i = 0; i < houses.length; i++) {
            totalCrates += houses[i];
        }
        return totalCrates;
    }

    public static int[] stats( int[] houses ){
        int highest = houses[0];
        int lowest = houses[0]; // initilize with first house
        int houseNumber = 0;
        int[] stats = new int[4];
        int totalCrates = 0;

        // stats[0] = highest;
        // stats[1] = lowest;
        // stats[2] = houseNumber;
        // stats[3] = totalCrates;

        for (int i = 0; i < houses.length; i++) {
            totalCrates += houses[i];

            if (  houses[i] >= highest ){
                highest = houses[i];
                houseNumber = i;

            }
            if (  houses[i] <= lowest ){
                lowest = houses[i];
            }
        }
        stats[0] = highest;
        stats[1] = lowest;
        stats[2] = houseNumber;
        stats[3] = totalCrates;

        return stats;

    }

}
