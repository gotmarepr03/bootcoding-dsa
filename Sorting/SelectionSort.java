public class SelectionSort {

    public static void main(String[] args) {

        int n = 6;/* Length of an array */
        int A[] = { 32, 12, 23, 19, 21, 10 };/* Unsorted Array */

        SelectionSort.sort(n, A);/* Calling sort Method directly by Class name becaause it is static */
        System.out.println("Sorted Array is ");
        SelectionSort.printArray(n, A); /* Print the Sorted Array */
    }

    public static void sort(int n, int A[]) {

        for (int i = 0; i < (n - 1); i++) {
            int small = i;/* considering index i as smallest so we can compare it with others */
            for (int j = i; j < (n - 1); j++) {
                if (A[small] > A[j + 1]) {

                    small = j + 1; /* Assigning small a new value which is smaller tha previous value of small */
                }
            }
            int temp = A[i];
            A[i] = A[small];      /* swapping vlaue of A[i] with the value at A[small] and vice-versa*/
            A[small] = temp;
        }
    }

    public static void printArray(int n, int A[]) {

        for (int i = 0; i < n; i++) {

            System.out.println(A[i]);
        }

    }
}
