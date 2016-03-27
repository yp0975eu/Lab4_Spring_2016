package com.branden;

import java.util.ArrayList;

/**
 This is the main method of a program that creates an ArrayList containing 3 breakfast cereals.

 public static void main(String[] args) {

 ArrayList cereals = new ArrayList();
 cereals.add("Special K");
 cereals.add("Captain Crunch");
 cereals.add("Oatmeal");

 }

 •	Please remove Oatmeal from the ArrayList.
 •	Please add the name of your favorite breakfast food to the ArrayList.
 •	Add “Cornflakes” to the ArrayList.
 •	Display all of the cereals in the ArrayList.
 •	Print a message if the ArrayList contains “Special K”. Print a different message if it does not contain "Special K".
 •	Bonus non-programming question: what does Captain Crunch have to do with computer hacking?
 */
public class Problem1 {
    static void run() {
        ArrayList<String> cereals = new ArrayList();
        cereals.add("Special K");
        cereals.add("Captain Crunch");
        cereals.add("Oatmeal");

        // remove Oatmeal
        cereals.remove(2);

        // add the name of your favorite breakfast food to the ArrayList.
        cereals.add("Cheerios");

        // add Cornflakes
        cereals.add("Cornflakes");

        //Display all of the cereals in the ArrayList.
        System.out.println(cereals);
        for( String cereal : cereals){
            if ( cereal.toString().equalsIgnoreCase("Special K")){
                System.out.println("Special K in cereals");
                break;
            }
        }
    }

}
