
import java .util.*;
public class ReverseString{

   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the String to be reversed: ");
       String rev = sc.nextLine();
       String reversed = " ";
       for(int i=rev.length()-1;i>=0;i--){
           reversed +=rev.charAt(i);
        }

       System.out.println("String after reversal: "+reversed);
   }

}
