import java.util.Scanner;
public class shiftelementbyone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i =0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        int temp = arr[arr.length-1];
        for(int i =arr.length-1;i>=1;i--){
            arr[i]=arr[i-1];
            
        }
        arr[0]=temp;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        
        }
        
    }
    
}
