// Question no-02
    // Check the number is prime number or not 
import java.util.Scanner;
public class javaAssignment_5 {
    public static void findPrime(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num <= 1) {
                System.out.println(num + " is not a prime number");
                continue;
            }
            
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("ente Element in array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
         System.out.println("Array is :");
         for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
         }
         System.out.println();
System.out.println("Check prime number or not");
         findPrime(arr);
    }
}
