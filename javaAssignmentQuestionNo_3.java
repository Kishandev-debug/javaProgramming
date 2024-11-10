import java.util.Scanner;
public class javaAssignmentQuestionNo_3 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n=sc.nextInt();
    int count=1;
    for (int i=0;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(count+" ");
            count++;
        }
        System.out.println();
    }
}    
}
