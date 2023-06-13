import java.lang.*;
import java.util.*;

class SubSeq {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int [] nums = new int [] {1,2,3};
        subseq(nums);
    }
    

     private static void solve(int[] nums, List<Integer> output, int index, List<List<Integer>> ans) {
        // Base case
        if (index >= nums.length) {
            ans.add(new ArrayList<>(output));
            return;
        }

        // Exclude
        solve(nums, output, index + 1, ans);

        // Include
        int element = nums[index];
        output.add(element);
        solve(nums, output, index + 1, ans);
        output.remove(output.size() - 1); // Backtrack
    }

    public static  void subseq(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        solve(nums, output, index, ans);
        
        for (List<Integer> list : ans) {
            for (Integer num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }        }

}
