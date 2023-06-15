import java.lang.*;
import java.util.*;

class  PhoneKeyPadProbelem{
    public static void main(String[] args) {
        String digits = "23";
        List<String>solution = letterCombinations(digits);
        for (String string : solution) {
                System.out.printf("%s ",string);
        }
        System.out.println();
    }
    private static void solve(String digits,
            String output,
            int index,
            List<String> ans,
            String[] mappings
            ) {
       //base case
       if(index >= digits.length()) {
           ans.add(output);
           return;
       }

       int nums = digits.charAt(index) - '0';
       String val = mappings[nums];

       for (int i = 0; i < val.length(); i++) {
            output += val.charAt(i);
            solve(digits, output, index+1, ans, mappings);
            output = output.substring(0, output.length() - 1);

       }
    }
    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        if(digits.length() == 0) return  ans;
        String output = "";
        int index =0 ;
        String[] mappings = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxy    z"  // 9
        };

        solve(digits, output, index, ans, mappings);
        return ans;
    }

}
