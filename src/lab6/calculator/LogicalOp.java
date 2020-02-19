package lab6.calculator;

public class LogicalOp {

//    scrieti o metoda care inverseaze valorile unui array

    public int[] revrseArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[array.length - 1 - i] = array[i];
        }
        return newArray;
    }

    public int[] sortAsc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j <= array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }
        return array;
    }



}
