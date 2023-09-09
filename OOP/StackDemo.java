package OOP;

import java.util.Scanner;

public class StackDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements (1-10) : ");
        int n = scan.nextInt();
        Stack s1 = new Stack();
        for (int i = 0; i < n; i++) {
            int val = scan.nextInt();
            s1.push(val);
        }
        
        // Last in first out
        for (int i=0  ; i<n ;i++)
        {
            System.out.println("Top of the Stack has : "+s1.pop());
        }
        System.out.println("\nTop of the Stack has : "+s1.pop());
        

         /*
        for (int i=0  ; i<n ;i++)
        {
            System.out.println("Last of the Stack has : "+s1.pop());
        }
        System.out.println("\nLast of the Stack has : "+s1.pop());
        */
    }
}
