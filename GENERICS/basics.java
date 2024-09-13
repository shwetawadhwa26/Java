public class basics {
    public static void main(String[] args) {
        Dog<String,String>  d1=new Dog<>("123","TOM");
        Dog<String,String>  d2= new Dog<>("a23","Leo");

        Dog<Integer,String> d3= new Dog<>(122,"bonny");
        System.out.println(d3.getId());
        System.out.println(d2.getId());

       // ArrayList<E> a = new ArrayList<>();
    }

}

class Dog<E,V>{
    E id; //parameter
    V name;
    public Dog(E id,V name){
        this.id=id;
        this.name=name;
    }
    E getId(){
        return id;

    }
}
