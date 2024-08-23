import java.util.Scanner;

public class pairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i =0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr.length;j++){
                System.out.println(arr[i] + " " + arr[j]);
            }
        }

    }
    
}
