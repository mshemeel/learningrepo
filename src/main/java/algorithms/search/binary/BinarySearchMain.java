package main.java.algorithms.search.binary;

//For sorted list
public class BinarySearchMain {
    public static void main(String[] args) {
        int[] input = {1, 3, 5, 6, 7, 9, 11, 14, 44, 98, 106};
        int toFind = 5;
        int pos = findPos(input, toFind);
        int pos2 = binarySearch(input, 0, input.length - 1, toFind);
        System.out.println(pos + "-" + pos2);
    }

    /* iterative */
    private static int findPos(int[] input, int To_Find) {
        int lo = 0;
        int hi = input.length - 1;
        while (hi - lo > 1) { // size of array > 1
            int mid = (hi + lo) / 2;
            if (input[mid] < To_Find) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        if (input[lo] == To_Find) {
            System.out.println("Found At Index " + lo);
            return lo;
        } else if (input[hi] == To_Find) {
            System.out.println("Found At Index " + hi);
            return hi;
        } else {
            System.out.println("Not Found");
            return -1;
        }
    }

    /* Recursion */
    private static int binarySearch(int[] arr, int l, int r, int x) {
        if (r >= l) {
            int mid = (l + r) / 2;

            // If the element is present at the middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present in array
        return -1;
    }
}
