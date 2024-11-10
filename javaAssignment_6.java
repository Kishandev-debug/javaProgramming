// Question no-04
// Given String is palindrom or not 
import  java.util.Scanner;
public class javaAssignment_6 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter String you want to check palindrome");
    String str=sc.nextLine();
    System.out.println("your word is : "+str);
    
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
}
