/*
Create a class named Person that holds the following fields:

two String objects for the person’s first and last name and a LocalDate object for the person’s birthdate.

Provide constructors for each class that accept parameters for each field, and provide get methods for each field.
 */

package testwedding;
import java.time.LocalDate; //LocalDate package
    
//Create a class named Person that holds the following fields:

public class Person {

//Attriubutes
    
  private String firstName; //String Object for the person firstname
  private String lastName; //String Object for the person lastname
  private LocalDate birthDate; //LocalDate Object for the person's birthdate
  
  
//Constructor
  
public Person(String firstName, String lastName, LocalDate birthDate){
  
this.firstName = firstName;       //parameters
this.lastName = lastName;        //parameters
this.birthDate = birthDate;    //parameters

}

public String getFirstName(){ //get methods for each field.
    
    return firstName; //return firstName
}
        
public String getLastName(){ //get methods for each field.
    
    return lastName; //return lastName
}

public LocalDate getBirthDate(){ //get methods for each field.
    
    return birthDate; //return birthDate
}

public String toString(){
    
    return (firstName + lastName + "was born on " + birthDate); //printing out the return string for the first name and the last name
}
}

