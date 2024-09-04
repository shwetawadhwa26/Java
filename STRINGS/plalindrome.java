import java.util.Scanner;
public class plalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
      //length of string 
        char ch[]=input.toCharArray();
        int n = ch.length;
        int i =0;
        int j =n-1;
        while(i>=j){
            if(ch[i]==ch[j]){
                i++;
                j--;
            }
        System.out.println("the string is a palindrome");

        }

        
    }
    
}
