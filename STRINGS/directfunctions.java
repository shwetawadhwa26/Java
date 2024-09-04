import java.util.Scanner;

public class directfunctions{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // String input = scanner.nextLine();
        // char[] ch = input.toCharArray();
        // char result = ch[0];
        // System.out.println(result);


        // String mystr = "Hello";
        // char res = mystr.charAt(0);
        // System.out.println(res);


        // //Returns the Unicode of the character at the specified index
        // String my = "Hello";
        // int reso = my.codePointAt(0);
        // System.out.println(reso);

        // //Return the number of Unicode values found in a string:
        // String mystring = "helloworld";
        // int resulttsring = mystring.codePointCount(0,10);
        // System.out.println(resulttsring);


        //char[] str1 = input.toCharArray();
        //char[] str2 = input.toCharArray();

        String str1=scanner.next();
        String str2=scanner.next();
        //String string1 = new String(str1);
        //String string2  = new String(str2);

        //Compares two strings lexicographically
        System.out.println(str1.compareTo(str2));

        //ComAppends a string to the end of another stringpares two strings lexicographically, ignoring case differences
        System.out.println(str1.compareToIgnoreCase(str2));

        //Appends a string to the end of another string
        System.out.println(str1.concat(str2));

        //Checks whether a string contains a sequence of characters
        System.out.println(str1.contains("hell"));
        System.out.println(str2.contains("hell"));

        //Checks whether a string ends with the specified character(s)
        System.out.println(str1.endsWith("lo"));


        //Checks whether a string starts with specified characters
        System.out.println(str1.startsWith("he"));

        System.out.println(str1.toUpperCase());
        System.out.println(str2.toLowerCase());







        


        
    }
}