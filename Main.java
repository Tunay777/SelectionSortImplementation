public class Main {
    public static void main(String[] args) {
        int[] myArray = {2, 1, 3, 5, 4};
        int[] sortedArray = selectionSort(myArray);
        for (int i=0;i<sortedArray.length;i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }
    public static int[] selectionSort(int[] myArray) {
        int min_idx, temp;
        for (int i = 0; i < myArray.length - 1; i++) {
            min_idx = i;
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[j] < myArray[min_idx]) {
                    min_idx = j;
                }
            }
            if (min_idx != i) {
                temp = myArray[i];
                myArray[i] = myArray[min_idx];
                myArray[min_idx] = temp;
            }
        }
        return myArray;
    }
}