public class BinarySearch {

    public static boolean binarySearch(int[] myList, int value) {
        // start will be equal zero
        int start = 0;
        // will receive the value of the length;
        int end = myList.length - 1;

        do {
            // the middle will receive the integer number of this calculation
            int middle = (start + end) / 2;
            if (myList[middle] == value) {
                return true;
            } else if (myList[middle] > value) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }


        } while (start <= end);

        // returns false
        return false;
    }

    public static void main(String[] args) {

        // the list needs to be sorted. ex: 1, 2, 3, 4. if not, this won't work
        int[] myList = {1, 3, 4, 7, 8, 10, 13};
        int value = 13;

        boolean findNumber = binarySearch(myList, value);

        // print out if the boolean is true
        if (findNumber) {
            System.out.println("The number is in the list");
        } else {
            System.out.println("The number isn't in the list!");
        }

    }
}
