package temaLab5.calculator;

public class LogicalOp {

    //    Q2 Assignment
    public int[] arrayToHundred() {
        int[] array = new int[100];
        for (int i = 1; i <= 100; i++) {
            array[i - 1] = i;
        }
        return array;
    }

    //    Q3 Assignment
    public int[] evenNumber(int[] evenArray) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenArray[i / 2 - 1] = i;
            }
        }
        return evenArray;
    }

    //    Q4 Assignment
    public float average(int[] arrayAverage) {
        int sum = 0;
        int arrayLength = arrayAverage.length;
        for (int i = 0; i < arrayLength; i++) {
            sum += arrayAverage[i];
        }
        return (float) sum / arrayLength;
    }

    //    Q5 Assignment
    public boolean checkString(String[] array, String element) {
        int length = array.length;
        boolean isEqual = false;
        for (int i = 0; i < length; i++) {
            if (array[i].equals(element)) {
                isEqual = true;
            }
        }
        return isEqual;
    }

    //    Q6 Assignment
    public int findPosition(int[] array, int number) {
        int length = array.length;
        int position = 0;
        for (int i = 0; i < length; i++) {
            if (array[i] == number) {
                position = i;
            }
        }
        return position;
    }

    //    Q7 Assignment
    public void printPattern(String [] array) {
        for (int i = 1; i <= array.length; i++) {
                System.out.print("-");
            }
            System.out.println("\n");
        }
}
































