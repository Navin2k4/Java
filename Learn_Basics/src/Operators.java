public class Operators {
    public static void main(String[] args) {

        // Arithmetic +,-,*,/,%
        int a = 5 ;
        int b = 10 ;
        System.out.println("Sum : " + a+b);
        System.out.println("Dif : " + (a-b));
        System.out.println("Mul : " + a*b);        // TYPE CASTING
        System.out.println("Div : " + (float)a/(float)b); // a, b both are integer which returns integer and it should be converted to float
        System.out.println("Mod : " + a%b+"\n");

        //Unary Operator Increment/Decrement
        int c = 5;
        System.out.println("Increment : " + c++); // prints and update , ++c updates and prints
        System.out.println(c);
        System.out.println("Decrement : " +c--); // prints and update , --c updates and prints
        System.out.println(c + "\n");

        //Relational Operators <,>,<=,>=,==,!=
        int m = 10;
        int n = 10;
        System.out.println(m>n);
        System.out.println(m<n);
        System.out.println(m>=n);
        System.out.println(m>=n);
        System.out.println(m==n);
        System.out.println((m!=n) + "\n");

        //Logical Operators  and && , or || , not !
        //Operator Precedence Not - > And - > Or
        boolean y = true;
        boolean z =  false;
        System.out.println(!y);
        System.out.println(y && z); // Both true - true , otherwise false
        System.out.println(y || z); // Both false - false , otherwise true

    }
}
