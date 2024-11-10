// 5 4 3 2 1
// 4 3 2 1
// 3 2 1
// 2 1
// 1
// Question no-8 
import java.util.Scanner;
public class javaAssignmentQuestionNo_2 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n=sc.nextInt();
    for(int i=n;i>=1;i--){
        for(int j=i;j>=1;j--){
            System.out.print(j+" ");
        }
        System.out.println();
    }
}    
}
