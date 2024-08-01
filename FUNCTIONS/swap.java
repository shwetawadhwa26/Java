
public class swap {
    public static void main(String[] args){
        int a = 12;
        int b =20;


        int temp =a;
        a=b;
        b=temp;

        System.out.println(a+" "+b);
        String name = "shweta wadhwa ";
        changename(name);
        System.out.println(name);

    }
    static void changename(String name){
        name = "sakshi wadhwa "; 
    }
    static void swap(int a, int b){
        int temp =a;
        a=b;
        b=temp;
    }
    
}
