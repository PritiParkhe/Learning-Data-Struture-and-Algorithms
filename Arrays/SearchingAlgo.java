
public class SearchingAlgo {

    // Linear search
    public static int linearSearch(int[] arr, int target) { // O(n)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }

        }
        return -1;
    }

    // Binary Search
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            // find mid
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 40;
        // for LinearSearch
        int index = linearSearch(arr, target);
        System.out.println("Found at index " + index);

        // for binarysearch
        System.out.println("Found at index " + binarySearch(arr, target));
    }
}
