public class comparsion {
    public static void main(String[] args) {
        String a = "Shweta";
        String b = "Shweta";

        //==
        System.out.println(a==b);


        String c =new String("Kunal");
        String  d = new String("Kunal");

        System.out.println(c==d);

        System.out.println(b.charAt(4));


        System.out.println(c.getClass().getName() +"@"+Integer.toHexString(c.hashCode()));

        
    }
    
}
