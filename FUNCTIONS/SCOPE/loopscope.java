
public class loopscope {
    public static void main(String[] args) {
        //scoping in for loops
        for(int i=0;i<4;i++){
            System.out.println(i);
        }
        System.out.println(i);

        //any values that is assigned in the scope cant be reinsitalised again
        //anything that is intislaised inside cant be used outside
        //anything that is outside can be used inside
        //anything initialised outside the block cant be reintialised inside the block
    
    }
    
}

