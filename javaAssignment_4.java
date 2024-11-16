import java.util.Scanner;

public class javaAssignment_4 {
   public static int sumVar(int val) {
      String str = Integer.toString(val);
      int sum = 0;
      for (int i = 0; i < str.length(); i++) {
         sum += Character.getNumericValue(str.charAt(i));
      }
      return sum;
   }

   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number to find factroial");
      int n = sc.nextInt();
      int factroial = 1;
      for (int i = n; i >= 1; i--) {
         factroial *= i;
      }
      System.out.println("factroial of the " + n + " is " + factroial);

      System.out.println("Sum is : " + sumVar(factroial));
   }
}
