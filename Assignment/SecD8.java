/*8. Design and implement a simple Java application that prompts the user to enter a valid email address. Your application should throw and handle a custom exception if the user enters an invalid email address.
    - InvalidEmailException: A custom exception that is thrown when the user enters an email address that does not match a valid email pattern (e.g., it should contain '@' and ‘.’ Symbols)

*/
import java.util.*;

public class SecD8{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
    
         try{
             System.out.println("Enter email:");
             String email=sc.nextLine();
            
        if(email.contains("@")&&email.contains(".")){
            System.out.println("Valid email");
        }
        else{
            throw new Exception("Invalid email format");
        }
            
    }
        catch( Exception e){
            System.out.println(e);
            
        }
        
     
    }
    
    
}