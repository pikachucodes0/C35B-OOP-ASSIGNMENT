/*Write a program that prompts the user to enter five integer values and reads them into
an array. The program should consist Of the following methods:
a method named "max" that reads an array of integer values and returns the maximum
value
a method named "indexOfHighest" that returns the index Of the highest element in an
array of integers. If more than one such element exists, return the smallest index.
Invoke the above methods and demonstrate them in the program.

*/
import java.util.*;

public class SecD9{
    static int arr[]=new int[5];
    static int max(){
    int max=arr[0];
    for(int i=0;i<arr.length;i++){
        if(max<arr[i]){
            max=arr[i];
        }
    }
        return max;
    
}
static int indexOfHighest(){
    int index=0;
    int max=arr[0];
     for(int i=0;i<arr.length;i++){
        if(max<arr[i]){
            index=i;
        }
    }
        return index;
}
    
    public static void main(String[] args){
       
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(max());
        
        System.out.println(indexOfHighest());
        
    }


}