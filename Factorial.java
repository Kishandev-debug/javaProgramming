//Write a Java program that takes an integer input from the user and
// calculates the factorial of the number. Then, write a method to calculate
// the sum of the digits of this factorial. For example, if the user enters 5,
// calculate 5! (120) and then find the sum of its digits (1 + 2 + 0 = 3).
// import java.util.Scanner;

public class Factorial {
   public static int sumVar(int val) {
      String str = Integer.toString(val);
      int sum = 0;
      for (int i = 0; i < str.length(); i++) {
         sum += Character.getNumericValue(str.charAt(i));
      }
      return sum;
   }
   public static int factorialNum(int fact){
      int factroial = 1;
        for (int i = n; i >= 1; i--) {
         factroial *= i;
      }
      return factroial;
   }

   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number to find factroial");
      int n = sc.nextInt();
      
    
      System.out.println("factroial of the " + n + " is " + factorialNum(n));

      System.out.println("Sum is : " + sumVar(factroial));
   }
}
