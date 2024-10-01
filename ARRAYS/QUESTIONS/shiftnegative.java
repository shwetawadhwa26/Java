import java.util.Scanner;
public class shiftnegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr= new int[10];
        int j =1;
        for(int i=0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i]<0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
     

    
}
