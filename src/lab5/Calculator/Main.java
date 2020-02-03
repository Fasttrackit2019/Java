package lab5.Calculator;

public class Main {

    public static void main(String[] args) {

//        Defne and write of an array indices so that the values of the arrays should star from 1

        String[] myArray = new String[1];
        myArray[0] = "test";

        LogicalOp op = new LogicalOp();
        int[] newArray = op.arrayToHundred();
        String[] x = {"Hello", "Friend"};


        int[] arrayHundred = op.arrayToHundred();
        float y = op.getAverage(arrayHundred);
        System.out.println(y);
        int[] one = {1, 2, 3, 4, 5};
        float z = op.getAverage(one);
        System.out.println(z);

    }
}
