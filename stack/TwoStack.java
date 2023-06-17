import java.util.* ;
import java.io.*; 
public class TwoStack {
	int size;
	int top1;
	int top2;
	int[] arr;
	// Initialize TwoStack.
	public TwoStack(int s) {
		// Write your code here
		this.size = s;
		this.top1 = -1;
		this.top2 = this.size;
		this.arr = new int[s];
	}

	// Push in stack 1.
	public void push1(int num) {
		// Write your code here
		if(top2 - top1 > 1) {
			top1++;
			arr[top1] = num;
		} 
	}

	// Push in stack 2.
	public void push2(int num) {
		// Write your code here
		if(top2 - top1 > 1) {
			top2 --;
			arr[top2] = num;
		}
	}

	// Pop from stack 1 and return popped element.
	public int pop1() {
		// Write your code here
		if(top1 >= 0) {
			int ans = arr[top1];
			top1--;
			return ans;
		} else {
			return -1;
		}
	}

	// Pop from stack 2 and return popped element.
	public int pop2() {
		// Write your code here
		if(top2 <= this.size - 1) {
			int ans = arr[top2];
			top2++;
			return ans;
		} else {
			return -1;
		}
	}

}

