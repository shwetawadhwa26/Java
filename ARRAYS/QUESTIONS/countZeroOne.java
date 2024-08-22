import java.util.Scanner;

public class countZeroOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int sumone=0;
        int sumzero =0;
        for(int i =0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                sumzero=sumzero+1;
            }
            else if(arr[i]==1){
                sumone=sumone+1;
            }
        }
        System.out.println("TOTAL NUMBER OF ZERO's" + sumzero);
         System.out.println("TOTAL NUMBER OF ONE's" + sumone);
    }
    
}
