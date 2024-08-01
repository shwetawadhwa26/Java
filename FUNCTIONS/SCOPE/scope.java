public class Scope {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
    
        swap(a, b);
        // Calling random method
        random(50);
    }
    
    static void random(int marks){
        int num = 88;
        System.out.println("Num: " + num);
        System.out.println("Marks: " + marks);
    }
    
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        // This change will only be valid in this scope only
        System.out.println("Inside swap: a = " + a + ", b = " + b);
    }
}
