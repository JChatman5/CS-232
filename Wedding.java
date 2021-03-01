/*
 Create a class named Wedding for a wedding planner that includes the date of the wedding, 
the names of the Couple being married, and a String for the location. 

Provide constructors for each class that accept parameters for each field, and
provide get methods for each field.
 */
package testwedding;
import java.time.LocalDate; //LocalDate package

//Class
public class Wedding {
    
//Attriubutes
    
    private LocalDate WeddingDate;  //the date of the wedding
    private Couple couple;          //the names of the Couple being married
    private String WeddingLocation;  //a String for the location
    
//Constructor  
    
public Wedding(LocalDate WeddingDate, Couple Couple, String WeddingLocation){
    
    this.WeddingDate = WeddingDate; //Parameters
    this.WeddingLocation = WeddingLocation;  //Parameters
    this.couple = Couple;     //Parameters
    
    
}
public LocalDate getWeddingDate(){ //get methods for each field.
    return WeddingDate;           //return WeddingDate
}


public Couple getCouple(){ //get methods for each field.
    return couple;        //return couple
}


public String getWeddingLocation(){ //get methods for each field.
    return WeddingLocation;         // return WeddingLocation
}

public String toString(){ //print out for the class
    
    return ("\n" + " This Marriage will be held on " + WeddingDate + " and the it will take place at, " + WeddingLocation); //printing out the return string for the location, date, and the couple
} 

}
