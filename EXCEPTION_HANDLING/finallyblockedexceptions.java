public class finallyblockedexceptions {
    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println("Hello World");
    
    try{
        System.out.println(a[8]);
    }
    catch(Exception e){
        System.out.println("Exception");
    }finally{
        System.out.println("I will run always");
    }
    System.out.println("bye world");
    
}

}