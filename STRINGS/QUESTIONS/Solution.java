

import java.util.Arrays;
import java.util.Scanner;
class Solution{
    public boolean Anagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        char[] sArr = s.toCharArray();
        char[] tArr= t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return Arrays.equals(sArr,tArr);

    

}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
    String t = scanner.nextLine();
    Solution solution = new Solution();
    if (solution.Anagram(s, t)) {
            System.out.println("anagram");
        } else {
            System.out.println("not anagram");
        }
    }
}
