
/* IN Binary search the an Array should be in Sorted form , if it is not we have to sort it First */
public class BianarySearch {
    public static void main(String[] args) {

        int k = 10; /* Element which we have to find */
        int n = 10; /* Length of an Array */
        int min = 0; /* First Index start with 0 (Zero) */
        int max = (n - 1);/* Last index */

        int[] A = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

        BianarySearch.search(min, max, k, A);/* Calling methode directly by Class name becaus its static */

    }

    public static void search(int min, int max, int k, int A[]) {

        int mid = (min + max) / 2;/* Formula for middle finding index */

        while (min <= max) {
            if (A[mid] > k) {
                max = mid - 1;
            } else if (A[mid] < k) {
                min = mid + 1;
            } else {
                System.out.println("Element found at index :" + mid);
                break; /* break the loop  */
            }

            mid = (min + max) / 2; /* updating the value of "_mid_" */
        }
        if (min > max) {
            System.out.println("Element is not Found..");
        }

    }
}
