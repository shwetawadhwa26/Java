import java.util.Scanner;
public class replace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a string");
        String input = scanner.nextLine();
        char[] ch = input.toCharArray();
        
        for(int i =0;i<ch.length;i++){
            if(ch[i]=='@'){
                ch[i]=' ' ;
            }
        }
        String result = new String(ch);
        System.out.println("Modified string: " + result);
    }
    
    
}



