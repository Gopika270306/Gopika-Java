public class Typecon{
     public static void main(String[] args){
         //wide/Implict conversion
         int num =11;
         float f=num;
         System.out.println("The value of "+num);
         System.out.println("The value of "+f);
         //Narrow/Exlicipt conversion
         double d =87.68;
         int num=(int) d;
         System.out.println("The value of "+d);
         System.out.println("The value of "+num);
     }
 }
