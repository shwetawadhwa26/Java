public class blockscope {
    public static void main(String[] args) {
        int a =10;
        int  b =20;
        {
            a =78;
            int c =99;
            //values intialised in this block will remain in this block 
        }
        System.out.println(c);
        
    }
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }



}
