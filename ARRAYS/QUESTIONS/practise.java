//REVERSE

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

//SUM

// import java.util.Scanner;
// public class practise{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int sum =0;
//         int size = scanner.nextInt();
//         int arr[] = new int[size];
//         for(int i =0;i<arr.length;i++){
//             arr[i]=scanner.nextInt();
//         }
//         for(int i=0;i<arr.length;i++){
//             sum =sum+arr[i];
//         }
//         System.out.println(sum);
//     }
// }

//PRINT 1-10
// import java.util.Scanner;
// public class practise{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int size = scanner.nextInt();
//         int arr[] = new int[size];
//         for(int i =0;i<arr.length;i++){
//             arr[i]=i+1;}
//         for(int i =0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }



//MAX

// import java.util.Scanner;
// public class practise{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int size = scanner.nextInt();
//         int arr[] = new int[size];
//         int ans = Integer.MIN_VALUE;
//         for(int i =0;i<arr.length;i++){
//             arr[i]=scanner.nextInt();
//         }
//         for(int i =0;i<arr.length;i++){
//             if(arr[i]>ans){
//                 ans=arr[i];
//             }
//         }
//         System.out.println(ans);
//     }
// }

//MIN
// import java.util.Scanner;
// public class practise{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int size = scanner.nextInt();
//         int arr[]=new int[size];
//         int ans = Integer.MAX_VALUE;
//         for(int i =0;i<arr.length;i++){
//             arr[i]=scanner.nextInt();
//         }
//         for(int i =0;i<arr.length;i++){
//            if(arr[i]<ans){
//             ans=arr[i];
//            }
//         }
//         System.out.println(ans);
//     }
// }


//Linear Search
// import java.util.Scanner;
// public class practise{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int size = scanner.nextInt();
//         int arr[] = new int [size];
        
//         for(int i =0;i<arr.length;i++){
//             arr[i]=scanner.nextInt();
//         }
//         int search=scanner.nextInt();
//         boolean found = false;
//         for(int i =0;i<arr.length;i++){
//             if(arr[i]==search){
//                 found = true;
//         }

//     }
//     if (found) {
//             System.out.println("Found");
//         } else {
//             System.out.println("Not found");
//         }}

// }



//Extreme Print 
// import java.util.Scanner;
// public class practise{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int size = scanner.nextInt();
//         int arr[] = new int[size];
//         for(int i =0;i<arr.length;i++){
//             arr[i]=scanner.nextInt();
//         }
//         int left =0;
//         int right = size-1;
//         while(left<=right){
//             if(left==right){
//                 System.out.println(arr[left]);
//             }
//             else{
//                 System.out.println(arr[left]);
//                  System.out.println(arr[right]);
//             }
//             left++;
//             right--;
//         }
//     }
// }


//Unique element
import java.util.Scanner;
public class practise{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];
        int ans =0;
        for(int i =0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
            ans = ans^arr[i];
        }
        System.out.println(ans);
        
    }
}