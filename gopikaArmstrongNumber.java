import java.util.*;
public class Armstrong{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Number :");
      int num = sc.nextInt();
      int original = num;
      int sum = 0;
      while (num>0){
        int d = num%10;
        sum += math.pow (d,digits);
        num /= 10;
      }
      if ( sum == original)
         System.out.println(original + "is an Armstrong number ");
      else
         System.out.println(original + "is not  an Armstrong number ");
   }
 }

