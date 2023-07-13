public class InsertionSort {
    public static void main(String[] args) {

        int n = 6;/* Length of an array */
        int A[] = { 32, 12, 23, 19, 21, 10 };/* Unsorted Array */

        InsertionSort.sort(n, A);/* Calling sort Method directly by Class name becaause it is static */
        System.out.println("Sorted Array is ");
        InsertionSort.printArray(n, A); /* Print the Sorted Array */
    }

    // Sorting the Array
    public static void sort(int n, int A[]) {

        for (int i = 1; i < n; i++) {

            int current = A[i];/* considering the value at A[i] A current */
            int j = i - 1;

            while (j >= 0 && current < A[i]) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = current;
        }
    }

    // printing the array
    public static void printArray(int n, int A[]) {

        for (int i = 1; i < n; i++) {

            System.out.println(A[i]);
        }

    }

}
