// Question no-6
// Write a program that accepts n integers from the user (where n is also
// provided by the user). Store the numbers in an array and write a method
// to find and display the second largest number in the array.
import java.util.Scanner;

public class javaAssignment_8 {
    public static void sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("enter value in array");
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
sort(arr);
// for(int i=0;i<arr.length;i++){
//     System.out.print(arr[i]+" ");
// }
System.out.println("Second largest element in array is : "+arr[arr.length-2]);
}    
}