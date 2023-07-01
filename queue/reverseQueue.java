import java.util.* ;
import java.io.*; 
import java.util.Queue;

public class Solution {
    public static void reverse(Queue < Integer > q) {
        // Write your code here.

        if(q.isEmpty()) return;

        int curr = q.element();
        q.remove();

        reverse(q);
        q.add(curr);
    }
}
