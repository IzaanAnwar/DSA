import java.util.*;

/**
 * addTwoArr
 */
class AddTwoArr {
    public static void main(String[] args) {
        int[] arr = new int[] {8,8};
        int[] arrSec = new int[] {2,2};
       System.out.println(addTwoArr(arr, arrSec)); 
    }
    public static void printArrList(ArrayList<Integer> ans) {
        for (Integer n : ans) {
            System.out.printf("%d ", n);
            
        }
        System.out.println("");
    }


    public static ArrayList<Integer> addTwoArr(int[] arr1, int[] arr2) {
        int i=arr1.length - 1;
        int j=arr2.length - 1;
        int carry = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // Case 1: adding both arrays
        while (i>=0 && j>=0) {
            int sum = arr1[i--] + arr2[j--] + carry;
            carry = sum / 10;
            sum = sum % 10;
            ans.add(sum);
        }

        //Case 2: if one array is larger in size
        while (i>=0) {    
            int sum = arr1[i--] + carry;
            carry = sum / 10;
            sum = sum % 10;
            ans.add(sum);
        }

        while (j>=0) {
            int sum = arr2[j--] + carry;
            carry = sum / 10;
            sum = sum % 10;
            ans.add(sum);
        }

        //Case 3: if carry is remaining
        while (carry != 0) {
            int sum = carry;
            carry = carry / 10;
            sum = sum % 10;
            ans.add(sum);

        }

        Collections.reverse(ans);
        return ans;
    }
    
}
