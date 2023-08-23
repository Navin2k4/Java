import java.util.Scanner;

public class ArrayInsertion {
    public static void display(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void insertAtFirst(int arr[], int n, int x) {
        for (int i = n; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = x;
        display(arr, n + 1);
    }

    public static void insertAtMiddle(int arr[], int pos, int n, int num) {
        for (int i = n - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = num;
        display(arr, n + 1);
    }

    public static void insertAtLast(int arr[], int x, int n) {
        arr[n] = x;
        display(arr, n + 1);
    }

    public static void main(String[] args) {
        int n, num, position, choice;
        int arr[] = new int[20];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the list: ");
        n = scanner.nextInt();

        System.out.print("Enter the Array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        do {
            System.out.println("\n1. Insert at First\n2. Insert at Middle\n3. Insert at Last\n0. Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to be inserted: ");
                    num = scanner.nextInt();
                    insertAtFirst(arr, n, num);
                    break;

                case 2:
                    System.out.print("Enter the element to be inserted: ");
                    num = scanner.nextInt();
                    System.out.print("Enter the position to be inserted: ");
                    position = scanner.nextInt();
                    if (position >= 0 && position <= n) {
                        insertAtMiddle(arr, position, n, num);
                    } else {
                        System.out.println("Invalid position");
                    }
                    break;

                case 3:
                    System.out.print("Enter the element to be inserted: ");
                    num = scanner.nextInt();
                    insertAtLast(arr, num, n);
                    break;

                case 0:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 0);

        scanner.close();
    }
}
