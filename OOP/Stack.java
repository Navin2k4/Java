package OOP;


public class Stack {
    int[] s = new int[10];
    
    int top_of_stack;

    Stack() {
        top_of_stack = -1;
    }
    void push(int value) {
        if (top_of_stack == 9) {
            System.out.println("Stack is full");
        }
        // top_of_stack = top_of_stack + 1 ;
        s[++top_of_stack] = value;
    }
    int pop() {
        if (top_of_stack >= 0) {
            return s[top_of_stack--];
        } else {
            System.out.println("Stack is Empty.");
            return -1;
        }
    }
    
    /*
    Stack() {
        last_of_stack = -1;
    }
    void push(int value) {
        if (last_of_stack == 9) {
            System.out.println("Stack is full");
        }
        // top_of_stack = top_of_stack + 1 ;
        s[++last_of_stack] = value;
    }

    int pop() {
        last_of_stack = 1;
        if (last_of_stack > 10) {
            return s[last_of_stack++];
        } else {
            System.out.println("Stack is Empty.");
            return -1;
        }
    }

    */
}
