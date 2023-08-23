import java.util.Scanner;
class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer value");
        int a = input.nextInt();
        System.out.println(a);
        System.out.println("Enter a float value");
        float b = input.nextFloat();
        System.out.println(b);
        System.out.println("Enter a string");
        String c = input.next(); // Takes a word not a sentence
        System.out.println(c);
        System.out.println("Enter a string");
        String d = input.nextLine(); // Takes a entire sentence
        System.out.println(d);
        System.out.println("Enter a string");
        Character e = input.next().charAt(0); // Takes a character At 0th Index
        System.out.println(e);
    }
}
