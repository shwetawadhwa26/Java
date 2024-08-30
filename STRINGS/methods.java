
import java.util.Arrays;

public class methods {
    
    public static void main(String[] args) {
        String name = "Shweta Wadhwa";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('e'));
        System.out.println("     Shweta     ".strip());
        System.out.println(name.split(" "));
        System.out.println(Arrays.toString(name.split(" ")));
         //[Shweta, Wadhwa]
    }
}
