
public class ArrayBasics {

    public static void deleteElementInArr(int[] number) {
        int deleteIndex = 2;

        // create a new array with size one  less than original array
        int[] newArr = new int[number.length - 1];

        // Copy elements from orignal array to new array , skipping element to deleted
        for (int i = 0, j = 0; i < number.length; i++) {
            if (i == deleteIndex) {
                continue; //skip element to delete
            }
            newArr[j++] = number[i];

        }

        // output th new array
        System.out.println("Array after deletion");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(" " + newArr[i]);

        }
        System.out.println();
    }

    public static void reverseArray(){
        int[] arr = {10, 20, 30 ,40,50};
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            // swap elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move pointers
            start++;
            end--;
        }
        // Print reverse array
        for(int i = 0; i < arr.length; i++){
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }
    public static void main(String args[]) {
        // A. Declaring and Initialization
        // 1. Declaration of array

        int[] arr;    // dataType[] arrayName;  // Recommended
        int num[];    // dataType arrayName[];  // also valid

        //2. Initialization (Allocating memory)
        num = new int[6];      // arrayName = new dataType[size];

        // 3. Declaration + Initialization
        int[] numbers = new int[5]; // creates an array of size 5

        // 4. direct initialization 
        int[] nums = {1, 2, 3, 4, 5};

        // B. accessing Elements in an Array
        int[] number = {10, 20, 30, 40, 50};
        System.out.println("Element at in index 0 is " + number[0]); // Output : 10
        System.out.println("Element at in index 1 is " + number[1]); // Output : 20

        // C. Iterating through an Array
        // 1. Using for loop
        for (int i = 0; i < number.length; i++) {
            System.out.print(" " + number[i]);
        }
        System.out.println();
        //2. Using enhanced for loop (for-each)
        for (int element : number) {
            System.out.print(" " + element);
        }
        System.out.println();

        // Modifying Elements in Array
        number[2] = 10;

        for (int i = 0; i < number.length; i++) {
            System.out.print(" " + number[i]);
        }
        System.out.println();

        // delete element in array
        deleteElementInArr(number);

        reverseArray();

    }
}
