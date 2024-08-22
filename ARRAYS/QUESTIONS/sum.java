import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        int[] arr = new int[10];
        for(int i =0;i<10;i++){
            arr[i] = scanner.nextInt();
            sum = sum +arr[i];
        }

        System.out.println(sum);

    }
    
}
