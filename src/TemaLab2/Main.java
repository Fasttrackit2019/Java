package TemaLab2;

public class Main {
    public static void main(String[] args) {

        //        Q2 assignment
        System.out.println("Addition result is " + sum(15, 30));
        System.out.println("Difference result is " + difference(50, 36));
        System.out.println("Multiplication result is " + multiply(110, 240));
        System.out.println("Division result is " + division(29, 13));

        //       Q3 Assignment
        javaPrint();

        //        Q4 Assignment
        System.out.println("The average result is " + average(3, 8, 11));

        //        Q5 Assignment
        printFace();

        //        Q6 Assignment
        System.out.println("The rest of two numbers divided is " +divRest(10,3));

    }

    public static int sum(int first, int second) {
        int result = first + second;
        return result;
    }

    public static int difference(int first, int second) {
        int result = first - second;
        return result;
    }

    public static int multiply(int first, int second) {
        int result = first * second;
        return result;
    }

    public static float division(float first, float second) {
        float result = first / second;
        return result;
    }

    public static void javaPrint() {
        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
    }

    public static float average(float first, float second, float third) {
        float result = (first + second + third) / 3;
        return result;
    }

    public static void printFace() {
        System.out.println("  + \" \" \" \" \" +  ");
        System.out.println("[ |  O     O  | ]");
        System.out.println("  |     ^     |");
        System.out.println("  |    '-'    |");
        System.out.println("  +- - - - - -+");
    }

    public static int divRest (int first, int second) {
        int result = first % second;
        return result;
    }
}
