// Find Factorial for n term and also calculate sum of the factrioal term 
// Question no-01
import java.util.Scanner;
public class javaAssignment_4 {
   public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number to find factroial");
int n=sc.nextInt();
int factroial=1;
for(int i=n;i>=1;i--){
factroial*=i;
}
System.out.println("factroial of the "+ n+" is "+factroial);
String str=Integer.toString(factroial);
int sum=0;
for(int i=0;i<str.length();i++){
    sum += Character.getNumericValue(str.charAt(i));
}
System.out.println("Sum is : "+sum);
   } 
}
