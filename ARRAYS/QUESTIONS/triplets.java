import java.util.Scanner;
public class triplets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr.length;j++){
                for(int k=0;k<arr.length;k++){
                    System.out.println(arr[i] + " " + arr[j]+ " "+arr[k]);
                }
            }
        }
    }
    
}
