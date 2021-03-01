/*
 Author ; JaQon Chatman 
Date ; 02 - 07 - 2021

Create a class named Person that holds the following fields: two String objects 
for the person’s first and last name and a LocalDate object for the person’s birthdate.
Create a class named Couple that contains two Person objects. Create a class named Wedding 
for a wedding planner that includes the date of the wedding, the names of the Couple being married, 
and a String for the location. Provide constructors for each class that accept parameters for each field,
and provide get methods for each field. Then write a program that creates two Wedding objects and in turn passes
each to a method that displays all the details. Save the files as Person.java, Couple.java, Wedding.java, and TestWedding.java. 

 */
package testwedding;
import java.time.LocalDate;

public class TestWedding {

    public static void main(String[] args) {
    
     Person personbride = new Person ("Kiercin " , "Jackson ", LocalDate.of(2003, 8, 11)); //firstname, lastname, birthdate
     Person persongroom = new Person ("JaQon " , "Chatman ", LocalDate.of(2000, 9, 5));   //firstname, lastname, birthdate
     Person personbride1 = new Person ("Janet " , "Dill ", LocalDate.of(2000, 6, 15));   //firstname, lastname, birthdate
     Person persongroom1 = new Person ("Tay " , "Jackson ", LocalDate.of(2000, 5, 5));   //firstname, lastname, birthdate
     
     Couple coupleBride = new Couple (personbride, persongroom); //persons for couple //mkaing the couple
     Couple coupleGrom = new Couple (personbride1, persongroom1);  //persons for couple  //mkaing the couple
     
     Wedding wedding1 = new Wedding (LocalDate.of(2021, 9, 23), coupleBride, " The Beach ");  //date of wedding , couple, location of wedding
     Wedding wedding2 = new Wedding (LocalDate.of(2024, 6, 8), coupleGrom, "The Saks ");        //date of wedding , couple, location of wedding
     
    System.out.println("In the First wedding " + "\n" + wedding1.getCouple() + " this marriage will be at" + "\n" + wedding1.getWeddingLocation() + "on " + wedding1.getWeddingDate()); //printing out the information for the first wedding object
    System.out.println("\n" + "In the Second wedding " + "\n" + wedding2.getCouple() + " this marriage will take place at " + "\n" + wedding2.getWeddingLocation() + "on " + wedding2.getWeddingDate()); //printing out the information for the first wedding object
     
     
     
     
         }
}
