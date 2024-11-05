import java.util.Scanner;
public class dp1 {
    public static int fibo(int n){
        int[] arr = new int[n+1];
        int ans = usingmemoization(n,arr);
        return ans;
    }
    public static int usingmemoization(int n, int[] arr){
        //base case 
        if(n==0)
        return 0;
        if(n==1)
        return 1;

        if(arr[n]!=0){
            return arr[n];
        }

        arr[n]=usingmemoization(n-1, arr)+usingmemoization(n-2, arr);
        return arr[n];
    }
public static int solveUsingTabulation(int n){
    int[] arr = new int[n+1];
    arr[0]=0;
    if(n==0){
        return arr[0];
    }
    arr[1]=1;
    for(int i =2; i<=n;i++){
        arr[i]=arr[i-1]+arr[i-2];
    }
    return arr[n]; 
}
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int ans = fibo(n);
        System.out.println(ans);
        int ans1 = solveUsingTabulation(n);
        System.out.println(ans1);



        
    }
    
}
