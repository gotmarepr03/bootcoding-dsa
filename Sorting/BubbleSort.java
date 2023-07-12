
public class BubbleSort {
    public static void main(String[] args) {

        int n = 6;/* Length of an array */
        int A[] = { 32, 12, 23, 19, 21, 10 };/* Unsorted Array */

        BubbleSort.sort(n, A);/* Calling sort Method directly by Class name becaause it is static */
        System.out.println("Sorted Array is ");
        BubbleSort.printArray(n, A); /* Print the Sorted Array */

    }

    public static void sort(int n, int A[]) {

        for (int i = 0; i < (n - 1); i++) {
            for (int j = 0; j < (n - 1 - i); j++) {
                /* Swapping A[j] with A[j+1] */
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }

            }
        }

    }

    public static void printArray(int n, int A[]) {

        for (int i = 0; i < n; i++) {

            System.out.println(A[i]);
        }

    }

}