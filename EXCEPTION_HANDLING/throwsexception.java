

public class throwsexception {
    public static void main(String[] args) {
        int a[] = new int[5];
        
        try {
            getNumberFromArray(a);  
        } catch (Exception e) {
            System.out.println("Caught the exception: " + e.getMessage());
        }
    }

    
    static int getNumberFromArray(int a[]) throws ArrayIndexOutOfBoundsException {
        return a[8];  
    }
}
