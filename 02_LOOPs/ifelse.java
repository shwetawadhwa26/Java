public class ifelse{
    public static void main(String[] args){
        /*
         * Syntax of if statements : 
         * if(boolean expression T or F){
          //body
         * }
         * else{
          //do this}
         */


       int salary = 254000;
       if(salary>10000){
        salary=salary+2000;
       }
       else{
        salary=salary+1000;
       }
       System.out.println(salary);

       if(salary > 10000){
        salary +=2000; //salary=salary+2000
       }
       else if(salary > 20000){
        salary += 3000;       
    }
    System.out.println(salary);
    }
    
}

// import java.util.Scanner;

// public class basic {
//     public static void main(String[] args){
//         Scanner in = new Scanner(System.in);
//         String fruit = in.next();

//         if(fruit.equals("mango")){
//             System.out.println("king of fruits");

//         }
//         else{
//             System.out.println("okay");
//         }
//     }
    
// }