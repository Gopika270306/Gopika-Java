import java .util.*;
public class ReverseString{

   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the String to be reversed: ");
       String rev = sc.nextLine();
       String reversed =  new StringBuilder(rev).reverse().toString();
       System.out.println("String after reversal: "+reversed);
   }

}
