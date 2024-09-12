
public class basics {
    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println("hello guys");

        try {
            int result =9/0;

            System.out.println(a[8]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Tried to access the out of bound element ");
        }
        catch(ArithmeticException e){
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
            System.out.println(e);

        }
        System.out.println("bye guys");
    }
    }
    
 
