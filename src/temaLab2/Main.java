package temaLab2;

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
        System.out.println("The rest of two numbers divided is " + divRest(10, 3));

        //        Q7 Assignment
        System.out.println("The conversion from Fahrenheit to Celsius is " + celsius(10));

        //        Q8 Assignment
        System.out.println("The conversion form inch to meters is " + inch(100));

        //        Q9 Assignment
        speed(20000, 2, 20, 35);
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

    public static int divRest(int first, int second) {
        int result = first % second;
        return result;
    }

    public static float celsius(float x) {
        float result = 5f / 9f * (x - 32);
        return result;
    }

    public static float inch(float x) {
        float result = x * 0.0254f;
        return result;
    }

    public static void speed(float meters, float hours, float minutes, float seconds) {
        float speed1 = meters / (seconds + minutes * 60 + hours * 3600);
        float speed2 = (meters / 1000) / (hours + minutes / 60 + seconds / 3600);
        float speed3 = (meters / 1609) / (hours + minutes / 60 + seconds / 3600);
        System.out.println(speed1);
        System.out.println(speed2);
        System.out.println(speed3);
    }

}

