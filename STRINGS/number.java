

public class Main {

    /
    public static void countStrings(int n, int ind, String str, int[] ans) {
        if (ind == n) {
            int count = 0;
            int temp = 0;
            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == '1') {
                    temp++;
                } else {
                    temp = 0;
                }
                count = Math.max(count, temp);
            }
            if (count >= 2) {
                ans[0]++;
            }
            return;
        }

        countStrings(n, ind + 1, str + "0", ans);
        countStrings(n, ind + 1, str + "1", ans);
    }

    
    public static void main(String[] args) {
        int[] ans = {0}; // To store the answer
        countStrings(5, 0, "", ans);
        System.out.println(ans[0]);
    }
}
