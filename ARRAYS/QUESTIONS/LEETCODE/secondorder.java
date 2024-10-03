public class secondorder{
    public static int[] getSecondOrderElements(int n, int []a) {
        int temp;
        for(int i=0;i<n;i++)     
        {
            for(int j=i+1;j<n;j++)  
            {
                if(a[i]<a[j])    
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return new int[]{a[1],a[n-2]};
        
        // Write your code here.
    }
}



//method 2 
// public class Solution {
//     public static int[] getSecondOrderElements(int n, int[] a) {
//         // Initialize variables
//         int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

//         for (int i = 0; i < n; i++) {
//             // Update largest and second largest
//             if (a[i] > largest) {
//                 secondLargest = largest;
//                 largest = a[i];
//             } else if (a[i] > secondLargest) {
//                 secondLargest = a[i];
//             }

//             // Update smallest and second smallest
//             if (a[i] < smallest) {
//                 secondSmallest = smallest;
//                 smallest = a[i];
//             } else if (a[i] < secondSmallest) {
//                 secondSmallest = a[i];
//             }
//         }

//         return new int[]{secondLargest, secondSmallest};
//     }
// }
