public class basics {
    public static void main(String[] args){
        int[] numbers = new int [5];
        String[] names = new String[5];

        //data of 5 numbers :{roll no,name , marks}
        int[] rno = new int [5];
        String[] name = new String[5]; 
        float[] marks = new float[5];

        Student[] students = new Student[5];
        Student kunal = new Student(); //declare and intialise
        System.out.println(kunal.rno); //accessing instance variable 'rno'
        System.out.println(kunal.name); 
        kunal.changeName("shoe lover");
        kunal.greetings();
        
    } 
    
    //create a class
    //for every single student 
    static class Student{
        int rno;
        String name;
        float marks;

    void greetings(){
        System.out.println("HELLO! My name is " + name);
        System.out.println("HELLO! My name is " + this.name);
    }
    void changeName(String newName){
        name = newName;
    }
    Student () {
        this.rno=14;
        this.name="KUNAL KUSHWAHA";
        this.marks=88.5f;
    }
}
}
