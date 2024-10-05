class MajorityElement{
    static int majorityElement(int[] arr) {
        int n = arr.length; 
        int count = 0;
        for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > n / 3) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1, 3, 5, 1,1,3,1};

        System.out.println(majorityElement(arr));
    }
}