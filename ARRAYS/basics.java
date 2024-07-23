import java.util.Scanner;

public class basics 
{
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int[] arr=new int[5];
        // arr[0]=23;
        // arr[1]=45;
        // arr[2]=353;
        // arr[3]=44;
        // arr[4]=90;
        // System.out.println(arr[3]);



        //Input using for loops
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]);
        // }
        
        //FOR EACH LOOP SYNTAX 
        for(int num:arr){//for every element in array , print the element 
            System.out.print(num+" "); //here num represents element of the array
        }
        //INDEX OUT OF BOUND ERROR
       // System.err.println(arr[5]);
    }
    
}
