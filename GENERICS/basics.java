public class basics {
    public static void main(String[] args) {
        Dog d1=new Dog("123");
        Dog d2 = new Dog("a23");
    }

}

class Dog{
    String id;
    public Dog(String id){
        this.id=id;
    }
}
