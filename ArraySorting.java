import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking the size of the array
        System.out.print("Enter the number of elements : ");
        int numbers = input.nextInt();

        int[] arr = new int[numbers];

        // Take array input
        System.out.println("Enter " + numbers + " numbers :");
        for (int i = 0; i < numbers; i++) {
            arr[i] = input.nextInt();
        }

        // Choose sorting order
        System.out.print("Enter '1' for Ascending or '2' for Descending : ");
        int choice = input.nextInt();

        // Rearrange the array using for loops
        for (int i = 0; i < numbers - 1; i++) {
            for (int j = i + 1; j < numbers; j++) {

                if (choice == 1 && arr[i] > arr[j]) {
                    // Ascending order
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                } else if (choice == 2 && arr[i] < arr[j]) {
                    // Descending order
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Display the final array
        System.out.println("Final Array Is Here : ");

        for (int i = 0; i < numbers; i++) {
            System.out.print(arr[i] + " ");
        }

        input.close();
    }
}
