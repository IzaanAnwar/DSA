import java.lang.*;
import java.util.*;

public class Stack {
    private class Node {
        int data;
        Node link;
    }
    Node top;

    int height;
    Stack() {
        this.top = null; 

    }



     public static void main(String[] args) {
        // Create a new instance of the Stack class
        Stack stack = new Stack();

        // Perform stack operations
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.display();

        //stack.pop();
        //stack.display();
    }



    public void push(int data){
        Node temp = new Node();
        temp.data = data;
        temp.link = top;
        top = temp;
        this.height ++;

    }
    public void pop(){
        if(height == 0) return;
        top = top.link;
        this.height --;
    }
public void display()
    {
        // check for stack underflow
        if (top == null) {
            System.out.printf("\nStack Underflow");
        }
        else {
            Node temp = top;
            while (temp != null) {
 
                // print node data
                System.out.printf("%d ", temp.data);
 
                // assign temp link to temp
                temp = temp.link;
                if(temp != null)
                    System.out.print(" -> ");
            }
        }
    }

}
