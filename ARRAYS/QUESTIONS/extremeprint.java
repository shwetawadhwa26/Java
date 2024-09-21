import java.util.Scanner;
public class extremeprint{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr= new int[5];
        int left =0;
        int right =arr.length-1;
        for(int i =0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        while(left<=right){
            if(left==right){
                System.out.println(arr[left]);
            }
            else{
                System.out.println(arr[left]);
                System.out.println(arr[right]);

            }
            left++;
            right--;
        }
    }
}