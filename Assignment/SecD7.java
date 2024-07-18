/*7. Design and implement a simple Java application that prompts the user to enter a string within a specified length, for example, between 5 and 20 characters. Your application should throw and handle a custom exception if the user enters a string outside this length.
    - InvalidStringLengthException: A custom exception that is thrown when the user enters a string with a length outside the valid range (5 to 20 characters).

*/
import java.util.*;

public class SecD7{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        try{
            System.out.println("Enter:");
            String text=sc.nextLine();
            
        if(text.length()<5 || text.length()>20){
            throw new Exception("Length not valid");
        }
        else{
            System.out.print("Nice word");
        }
            
        }
        catch( Exception e){
            System.out.println(e);
            
        }
        
     
    }
    
    
}