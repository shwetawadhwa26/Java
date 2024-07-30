//Syntax of switch


/*
 * switch(expression){
 * case one:
 * //do something 
 * break;
 * 
 * case two;
 * //do something;
 * break;
 * 
 * case three;
 * //do somethings;
 * break;
 * 
 * default:
 * //do something}
 */



 //cases have to be of the sam etype as expressions must be constant or literal
 //duplicate case values are not allowed
 //break is use to terminate the sequence 
 //if break is not used it will continue the next case
 //default will execute when none of above does
 //if deafult is not at the end put break after it 













import java.util.Scanner;

public class basic {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

       switch(fruit){
    
        case "mango":
        System.out.println("king of fruits");
        break;
        case "apple":
        System.out.println("red fruit");
        break;
        case "orange":
        System.out.println("round orange fruit");
        break;
        default:
        System.out.println("plase eneter a valid fruit");
        

       }
    }
    
}
