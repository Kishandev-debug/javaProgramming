// Question no-3
// menu driven calculator

import java.util.Scanner;
public class javaAssignment_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int choice;
do { 
    System.out.println("Menu");
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");
    System.out.println("5. Exit");
    choice=sc.nextInt();
    if(choice>=1 && choice<=4){
System.out.println("Enter first number:");
int num1=sc.nextInt();
System.out.println("Enter second number");
int num2=sc.nextInt();
if(choice==1){
    System.out.println(num1+num2);
}
else if(choice==2){
    System.out.println(num1-num2);

}
else if(choice==3){
    System.out.println(num1*num2);
}
else if(choice ==4){
    if(num2!=0){
        double result=num1/num2;
    System.out.println(result);
}
else{
    System.out.println("second number is invalid");
}
}

else if(choice==5){
    System.out.println("END");
}
else{
    System.out.println("You enter invalid choice");
}
    }
} while (choice!=5);
    }
    
}
