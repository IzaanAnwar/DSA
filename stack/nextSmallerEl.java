import java.util.*;
import java.io.*;

public class Solution{
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
        // Write your code here.
        Stack <Integer> st = new Stack<>();
        st.push(-1);
        ArrayList<Integer> ans = new ArrayList<>(n);

        for (int i=n-1; i >=0; i--) {
            int curr = arr.get(i);
            while (st.peek() >= curr) {
                st.pop();
            }
            ans.add(st.peek());
            st.push(curr);
        }
        Collections.reverse(ans);
        return ans;
    }
}
