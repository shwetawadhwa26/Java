import java.util.Scanner;

public class unique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int ans =0;
            int[] arr = new int [9];
            for(int i=0;i<arr.length;i++){
                arr[i]=scanner.nextInt();
                ans = ans^arr[i];
            }
            System.out.println(ans);            
            }
        }
