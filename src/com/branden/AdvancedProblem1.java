package com.branden;

/**
 The handy thing about ArrayLists and LinkedLists is that you can store anything in them. The problem with this is getting the things out. How do you know what type of Object you have? What if you store a load of Strings, then you want to get them out and test if they equal another String, ignoring case? (by calling the equalsIgnoreCase method on all of them).

 Unfortunately, this doesn’t work.


 //Create a LinkedList of languages we know
 LinkedList languages = new LinkedList();
 //And add any type of Object we like
 languages.add("Python");
 languages.add("Java Programming: Lab 4 Arrays and ArrayList and LinkedList and Hashmap");
 languages.add("C#");
 //Test if we know Python
 //(Should also work for "python" and "PYthon"...)
 for (Object lan : languages) {
 if (lan.equalsIgnoreCase("Python")){
 System.out.println("You know Python");
 }
 }

 Why doesn't this work? Because the variable lan is an Object. Object doesn’t have an equalsIgnoreCase method.

 We can fix this by forcing lan to become a String. This is known as “casting”. You can cast a variable from one type to another by using the type we want it to become in parenthesis, ( ), in front of it. Let’s try that,

 //Create a LinkedList of languages we know
 LinkedList languages = new LinkedList();
 //And add any type of Object we like
 languages.add("Python");
 languages.add("Java Programming: Lab 4 Arrays and ArrayList and LinkedList and Hashmap");
 languages.add("C#");
 //Test if we know Python
 //(Should also work for "python" and "PYthon"...)
 for (Object lan : languages) {
 String lanString = (String)lan; //cast to a String
 if (lanString.equalsIgnoreCase("Python")){
 System.out.println("You know Python");
 }
 }


 This compiles and runs. Unfortunately, since you can add any type of data to a LinkedList, nothing stops someone accidentally adding an Integer, or an array of Strings, or something else, to the languages LinkedList.  Try running this code – what happens?


 //Create a LinkedList of languages we know
 LinkedList languages = new LinkedList();
 //And add any type of Object we like
 languages.add("Python");
 languages.add("Java Programming: Lab 4 Arrays and ArrayList and LinkedList and Hashmap");
 languages.add("C#");
 languages.add(9); //Add an Integer

 //Test if we know Python
 //(Should also work for "python" and "PYthon"...)
 for (Object lan : languages) {
 String lanString = (String)lan; //cast to a String
 if (lanString.equalsIgnoreCase("Python")){
 System.out.println("You know Python");
 }
 }


 And your program crashes. We’d like to avoid this kind of error if possible. One of the things that makes Java Programming: Lab 4 Arrays and ArrayList and LinkedList and Hashmap programs more robust than, let’s say, Python (which doesn’t make you be as specific about types, so is more flexible, but you, the programmer, have to be more careful to avoid this kind of error) is that the compiler can identify type errors and make you fix them before the program will run.  But that's not happening here.

 Generic Types are Java Programming: Lab 4 Arrays and ArrayList and LinkedList and Hashmap’s solution to this problem. When you create a LinkedList (or Hashmap or ArrayList or many other types of data structure) you can specify that the LinkedList can only contain Strings.  Or, only items of any other type of your chouce. This is usually OK because most of the time, the lists you create tend to be all items of one type. Put the type in pointy brackets after the type of data structure you are creating, like this,


 LinkedList<String> languages = new LinkedList<String>();
 //Now can only add Strings
 languages.add("Python");
 languages.add("Java Programming: Lab 4 Arrays and ArrayList and LinkedList and Hashmap");
 languages.add("C#");
 languages.add(9);  //Compiler indicates error here
 //Can’t add an int by mistake

 //Test if we know Python
 //(Should also work for "python" and "PYthon"...)
 for (String lan : languages) {
 if (lan.equalsIgnoreCase("Python")){
 System.out.println("You know Python");
 }
 }

 Notice the difference in the for loop? We can now specify that lan, the variable we use to hold each of the items in the languages LinkedList in turn, is a String. We don’t have to cast it any more, and we can call all of our useful String methods, and there will be no ClassCastException thrown if lan is unexpectedly an Integer – because now we can be sure lan will always be a String.

 Delete the line that adds an int to the LinkedList and run the code.

 For this problem: Go back to problem 1 and 3 and 4 and use Generic Types to enforce the data type stored in these data structures.

 Some more code examples: An ArrayList which can only store Doubles,
 An ArrayList which stores String arrays
 A HashMap which stores String keys and int array values
 A LinkedList which stores File objects

 ArrayList<Double> numberList = new ArrayList<Double>();
 ArrayList<String[]> listOfArrays = new ArrayList<String[]>();
 HashMap<String, int[]> map = new HashMap<String, int[]>();
 LinkedList<File> languages = new LinkedList<File>();

 Use generic types for all of your data structures in the future.
 */
public class AdvancedProblem1 {
    static void run(){
        System.out.println("See Problem1, Problem3, and Problem4.");
    }
}
