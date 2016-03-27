package com.branden;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 Start with your code from the problem above.

 What if most houses had 1 or 2 crates, but both house number 6 and house number 7 set out 4 crates each?

 Which one would you choose as the house with the most recycling? A better solution would be to display all of the houses with the joint highest number of crates.

 Use an ArrayList or LinkedList to help you display a report with the house or houses with the equal most recycling.
 */
public class Problem3 {
    static void run() {
        int[] houses = new int[7];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < houses.length; i++) {
            System.out.println("How many creates where set out by house #" + i);
            houses[i] = scanner.nextInt();
        }
        HashMap results;
        results = stats(houses);
        ArrayList<Integer> highestHouses;

        highestHouses = getHighestHouses(houses);

        System.out.println("Total number of crates: " + results.get("totalCrates"));
        System.out.println("Highest number of crates: " + results.get("highest"));
        System.out.println("Smallest number of crates: " + results.get("lowest"));
        System.out.println("House number: " + highestHouses + " had the highest crates with " + results.get("highest"));
    }

    public static ArrayList<Integer> getHighestHouses(int[] houses) {
        int highest = houses[0];
        ArrayList<Integer> highHouses = new ArrayList<>();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] >= highest) {
                highest = houses[i];
            }
        }

        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == highest) {
                highHouses.add(i);
            }
        }
        return highHouses;
    }

    public static HashMap stats(int[] houses) {
        int highest = houses[0];
        int lowest = houses[0]; // initilize with first house
        HashMap<String, Integer> stats = new HashMap<String, Integer>();
        int totalCrates = 0;
        ArrayList<Integer> highHouses = new ArrayList<Integer>();

        // stats[0] = highest;
        // stats[1] = lowest;
        // stats[2] = houseNumber;
        // stats[3] = totalCrates;

        for (int i = 0; i < houses.length; i++) {
            totalCrates += houses[i];

            if (houses[i] >= highest) {
                highest = houses[i];
            }
            if (houses[i] <= lowest) {
                lowest = houses[i];
            }

        }

        stats.put("highest", highest);
        stats.put("lowest", lowest);
        stats.put("totalCrates", totalCrates);

        return stats;

    }
}

