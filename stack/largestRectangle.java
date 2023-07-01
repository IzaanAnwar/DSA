import java.util.ArrayList;
import java.util.Stack;

public class Solution {

  private static int[] nextSmallerEl(ArrayList < Integer > heights, int n) {
      Stack <Integer> st = new Stack<>();

      st.push(-1);
      int[] ans = new int[n];

      for (int i=n-1; i >=0; i--) {
          int curr = heights.get(i);
          while (st.peek() != -1 && heights.get(st.peek()) >= curr) {
              st.pop();
          }
          ans[i] = st.peek();
          st.push(i);
      }
      return ans;
  }

  private static int[] prevSmallerEl(ArrayList < Integer > heights, int n) {
    Stack <Integer> st = new Stack<>();
    st.push(-1);            
    int[] ans = new int[n];

    for (int i=0; i < n; i++) {
        int curr = heights.get(i);
        while (st.peek() != -1 && heights.get(st.peek()) >= curr) {
            st.pop();
        }
        ans[i] = st.peek();

        st.push(i);
    }
    return ans;
  }
  public static int largestRectangle(ArrayList < Integer > heights) {
    // Write your code here.
    int n = heights.size();
    int[] nextSmaller = nextSmallerEl(heights, n);

    int[] prevSmaller = prevSmallerEl(heights, n);

    int area = -1;
    for (int i = 0; i < n; i++) {
      int length = heights.get(i);

      if (nextSmaller[i] == -1) {
        nextSmaller[i] = n;
      }
      int breadth = nextSmaller[i] - prevSmaller[i] -1;
      int newArea = length * breadth;
      if (newArea > area) {
        area = newArea;
      }
      
    }
    return area;


  }
}
