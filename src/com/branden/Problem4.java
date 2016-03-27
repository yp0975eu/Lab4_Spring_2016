package com.branden;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**

 You are a classic rock radio DJ. Like all good classic rock DJs, you only have 4 records: Stairway to Heaven, Ace of Spades, Dark Side of the Moon, and Hotel California. (It’s important to make your listeners feel safe and comfortable with some familiar music.)

 As a DJ, you feel it’s important to be able to play your songs in any order. But, your problem is, you want to play all the songs roughly the same amount, and you don’t want to play the same song twice in a row. Write a program which helps you choose which song to play, and keeps track of how many times you’ve played each song.

 Use a HashMap to store data in this program. Other variables and data structures may help too.

 Perhaps you’ll use a loop that displays the choice of songs, lets you choose, checks that it’s not the one you just played, and also checks that you are not overplaying any of the songs.  You get to define “overplaying”.

 ("Play" a song by printing a message such as “Now Playing: Hotel California”.)
 */
public class Problem4 {
    static void run(){
        LinkedList<Integer> songQueue = new LinkedList<Integer>();
        HashMap<Integer, String> songName = new HashMap<Integer, String>();
        songName.put(1,"Stairway to Heaven");
        songName.put(2,"Ace of Spades");
        songName.put(3,"Dark Side of the Moon");
        songName.put(4,"Hotel California");

        Scanner scanner = new Scanner( System.in );
        int songNumber = 1;
        // if option is not 0 then ask what song to play
        while ( songNumber != 0) {
            // display menu
            System.out.println("What song do you want to play?\n\t1: Stairway to Heaven\n\t2: Ace of Spades\n\t3: Dark Side of the Moon\n\t4: Hotel California\n\tEnter 0 to quit.\n\n");
            songNumber = scanner.nextInt();

            // evaluate input
            if (  songNumber < 0 || songNumber > 4){
                continue;
            }
            if ( songNumber == 0){
                break;
            }

            // if the song queue is empty then add the song.
            if ( !songQueue.isEmpty() ) {

                // if the queue contains the song then display that that song is already queued
                if ( songQueue.peek() == songNumber ){
                    System.out.println("You just played that one!");
                } else if ( songQueue.contains(songNumber) ){
                    System.out.println("You play that one too much, try another!");
                } else {
                    // add song to queue
                    songQueue.add(songNumber);
                }
                // if the queue is full then play a song
                if (songQueue.size() == 4) {

                    songNumber = songQueue.remove();

                    // get the song name
                    System.out.println("Now playing: " +  songName.get(songNumber) );
                }

            } else {
                songQueue.add(songNumber);
            }



        }

    }
}
