public class genericmethods {
    public static void main(String[] args) {
        printData("hello");
        printData(123);
        genericmethods obj = new genericmethods();
        obj.doubleData("112");

        CustomClass custom = new CustomClass();
        obj.doubleData(custom);
    }
    static <E> void printData(E data){
        System.out.println(data);
    }
    <E> void doubleData(E data){
        System.out.println(data);
        
    }
    
}
