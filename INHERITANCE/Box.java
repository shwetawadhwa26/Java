public class Box {
    double l;
    double h;
    double w;
    Box(){
        this.h=-1;
        this.l=-1;
        this.w=-1;

    }
    public Box(double l, double h, double w){
        this.w=w;
        this.l=l;
        this.h=h;
    }

    Box( Box old){
        this.h = old.h;
        this.l=old.l;
        this.w=old.w;
    }
    public void information(){
        System.out.println("Running the box");
    }

    
}
