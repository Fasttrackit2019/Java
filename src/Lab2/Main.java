package Lab2;

public class Main {

    static int memberVariable = 3;
//variabila la care toti membrii din clasa au acces, se distruge la ultima acolada inchisa

    public static void main(String[] args) {

        int localVariable = 5;
//variabila locala, se distruge la prima acolada inchisa

        System.out.println(sum(15, 89));
        System.out.println(dif(100, 50));
        System.out.println(multiply(2.5, 4.5));
        System.out.println(div(120, 17));
        prinName("Vlad");
    }

    public static int sum(int first, int second) {
        int sum = first + second;
        return sum;
    }

    public static int dif(int first, int second) {
        int dif = first - second;
        return dif;
    }

    public static double multiply(double first, double second) {
        double multiply = first * second;
        return multiply;
    }

    public static float div(float first, float second) {
        float div = first / second;
        return div;
    }

    public static void prinName(String name) {
        System.out.println("The name is:");
        System.out.println(name);
    }

}
