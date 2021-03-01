/*
Create a class named Couple that contains two Person objects.

Provide constructors for each class that accept parameters for each field, and 
provide get methods for each field.

 */
package testwedding;

//Create a class named Couple that contains two Person objects.
public class Couple {

//Attriubutes
    
private Person bride; //Person object
private Person groom; //Person object 

//Constructor
public Couple(Person personbride, Person persongroom){
 
    this.bride = personbride;
    this.groom = persongroom;
    
}
public Person getBride(){ //get methods for each field.
    return bride; //return bride 
}

public Person getGroom(){ //get methods for each field.
    return groom;  //return the groom 
}

public String toString(){
    
    return ("\n" + " The Grom, " + groom + "," + " And the Bride, " + "\n" + bride + "," ); //printing out the return string for the grom and the bride
}

}
