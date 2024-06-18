import java.util.*;

public class Main {

    private int[] myArray;
    private int arraySize;
    private int largestIndex;
    private int smallestIndex;

    public Main(int arraySize) {
        this.arraySize = arraySize;
        this.myArray = new int[arraySize];
    }

    public void populateArray() throws Exception {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter element of array: ");
            myArray[i] = scanner.nextInt();
        }
   
        scanner.close();
    }

    public void findLargestAndSmallest() {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arraySize; i++) {
            if (myArray[i] > largest) {
                largest = myArray[i];
                largestIndex = i;
            }
            if (myArray[i] < smallest) {
                smallest = myArray[i];
                smallestIndex = i;
            }
        }

    }

    public int checkOrder() {
        if (smallestIndex < largestIndex) {
            System.out.println("Smallest number comes before largest");
            return myArray[largestIndex] - myArray[smallestIndex];
        } else {
            System.out.println("Smallest number comes after largest");
            return -1;
        }
    }
    

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int arraySize = scanner.nextInt();

        Main main = new Main(arraySize);
        main.populateArray();
        main.findLargestAndSmallest();
        System.out.println(main.checkOrder());

        scanner.close();
    }
}
