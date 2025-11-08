import java.util.*;
public class controlflow{
  public static void main(String [] args){
  //for loop
   for(int i =0; i<=5; i++)
   {
     System.out.println(i);
   }
   //while loop
   int count = 0;
   while(count<=5)
   {
     System.out.println(count);
     count ++;
   }
   //do while
   int count = 0;
   do{
      System.out.println(count);
      count++;
   } 
    while(count <=5);
}
}
}
