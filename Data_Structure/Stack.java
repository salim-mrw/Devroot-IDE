package Data_Structure;

public class Stack {

    // Variables of class Stack

    public int top;
    public int size;
    public int st[];

    // Constructure Stack class

    public Stack(int size) {
        this.top = -1;
        this.size = size;
        this.st = new int[size];

    }

    // Methods of class Stack

    // Chick the stack is full

    public boolean isfull() {
        return top == size - 1;
    }

    // Chick the stack is empty

    public boolean isempty() {
        return top == -1;
    }

    // Add the elements into stack

    public void push(int x) {
        if (isfull()) {
            System.out.println("Stack is OverFlow");
        } else {
            top++;
            st[top] = x;
        }
    }

    // Delete the elements from stack and show the element deleted

    public void pop() {
        if (isempty()) {
            System.out.println("Stack OverFlow");
        } else {
            System.out.println(st[top]);
            top--;
        }
    }

    // Show

    public void peek() {
        System.out.println(st[top]);
    }

    // Print the elements stack

    public void display() {

        for (int i = top; i >= 0; i--) {
            System.out.println(st[i] + "\t");

        }

    }

    // End class Stack

}
