// import java.util.Scanner;
// public class practise {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int arr[] = new int[10];
//         for(int i =0;i<arr.length;i++){
//             arr[i]=scanner.nextInt();
//         }
//         for(int i=arr.length-1;i>=0;i--){
//             System.out.print(arr[i]+" ");
//         }
//     }
    
// }


import java.util.Scanner;
public class practise{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for(int i =0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            sum =sum+arr[i];
        }
        System.out.println(sum);
    }
}

