// Search word and count occurance or character in a String 

import java.util.Scanner;
public class CharacterOccurance {
    public static int occurance(String str,char searchChar){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==searchChar){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter word :");
        String str=sc.nextLine();
        System.out.println("enter a  character you want to searcha nd count occurance");
        char searchChar=sc.next().charAt(0);
        System.out.print(occurance(str, searchChar));
       
    }
    
}
