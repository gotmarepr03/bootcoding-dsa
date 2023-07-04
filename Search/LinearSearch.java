
public class LinearSearch {
    public static void main(String[] args) {
        /* Size of an Array */
        int n = 10;
        /* Value Which we Are Searching */
        int k = 60;

        /*Creating an Array with 10 elements */
        int[] A = { 10, 20, 34, 45, 65, 21, 43, 45, 65, 21 };
        /* Calling the search methode with class name because it is static */
        LinearSearch.search(A, n, k);

        if (LinearSearch.search(A, n, k) == -1) {
            System.out.println("The key " + k + " is not avalible");
        } else {
            System.out.println(" The Key " + k + " found at " + LinearSearch.search(A, n, k));
        }

    }

    public static int search(int A[], int n, int k) {

        /* Using for loop to traverse through Array in Search of key" k " */
        for (int i = 0; i < n; i++) {
            if (A[i] == k) {
                return i;
            }
        }
        return -1;
    }
}
