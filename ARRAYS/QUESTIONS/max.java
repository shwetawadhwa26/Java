import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr= new int[5];
        int ans=Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            arr[i]=scanner.nextInt();

        }
        for(int i =0;i<arr.length;i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
            
        }
        System.out.println(ans);
    }
    
}
