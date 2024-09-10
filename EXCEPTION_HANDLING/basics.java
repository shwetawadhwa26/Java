
public class basics {
    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println("hello guys");

        try {
            System.out.println(a[8]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Tried to access the out of bound element ");
        }
        System.out.println("bye guys");
    }
    }
    

