

//hadowing occurs when a variable declared within a certain scope (such as a method,
// constructor, or inner block) has the same name as a variable declared in an outer
// scope (such as a class or parent class).
public class shadowing {
    static int x = 90;
    public static void main(String[] args) {
         System.out.println(x);
         fun(); 
    }
    static void fun(){
        System.out.println(x);
    }
    
}
