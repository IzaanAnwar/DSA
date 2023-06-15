import java.lang.*;
import java.util.*;

public class Permutations {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3};
        List<List<Integer>> sol = permute(nums);
        for (List<Integer> list : sol) {
            System.out.println(list);
        }
        System.out.println();
    }
    private static void swap(int[] arr, int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2]  = temp;
    }
    private static void solve (int[] nums, List<List<Integer>> ans, int index) {
        //base case
        if(index >= nums.length) {
            List<Integer> list = new ArrayList<>();
            for(int n : nums) {
                list.add(n);
            }
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=index;i<nums.length;i++) {
            swap(nums, index, i);
            solve(nums, ans, index + 1);
            swap(nums, index, i); //back tracking

        }
    }
    public static List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        int index = 0;
        solve(nums, ans, index);
        return ans;
    }
}
