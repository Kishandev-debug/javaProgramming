// 1
// 2 3
// 4 5 6
// 7 8 9 10
//     Question no-09

import java.util.Scanner;
public class FloydTriangle {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n=sc.nextInt();
    int count=1;
    for (int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(count+" ");
            count++;
        }
        System.out.println();
    }
}    
}
