// Question no-04
// Accept a string input from the user and check if it’s a palindrome (a word
// that reads the same forwards and backwards). Create a method to
// reverse the string and compare it to the original to determine if it’s a
// palindrome.
import  java.util.Scanner;
public class javaAssignment_6 {
    public static void palindrome(String str)
    {
         String temp="";
   for(int i=str.length()-1;i>=0;i--){
    temp+=str.charAt(i);
   }
    if(str.equals(temp)){
        System.out.println(str+" is palindrom ");
    }
    else{
        System.out.println(str+" Not palindrom");
    }
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter String you want to check palindrome");
    String str=sc.nextLine();
    System.out.println("your word is : "+str);
    palindrome(str);
   
}
}
