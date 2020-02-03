package temaLab5.calculator;

public class Calculator {

    //    Q1 Assignment
    public int addition(int first, float second) {
        return (int) (first + second);
    }

    public int addition(int first, int second, int third) {
        return first + second + third;
    }

    public int addition(int first, int second, double third, double fourth) {
        return (int) (first + second + third + fourth);
    }

    public int difference(float first, int second) {
        return (int) (first - second);
    }

    public int difference(int first, int second, int third) {
        return first - second - third;
    }

    public int difference(double first, double second, int third, int fourth) {
        return (int) (first - second - third - fourth);
    }

    public int multiply(int first, float second) {
        return (int) (first * second);
    }

    public int multiply(int first, int second, int third) {
        return first * second * third;
    }

    public int multiply(double first, double second, int third, float fourth) {
        return (int) (first * second * third * fourth);
    }

    public int division(float first, float second) {
        return (int) (first / second);
    }

    public int division(int first, int second, int third) {
        return first / second / third;
    }

    public int division(double first, float second, int third, int fourth) {
        return (int) (first / second / third / fourth);
    }

    public float average(int first, int second) {
        return (float) (first + second) / 2;
    }

    public float average(int first, float second, double third) {
        return (float) (first + second + third) / 3;
    }

    public float average(float first, float second, float third, float fourth) {
        return first + second + third + fourth / 4;
    }

    public int divRest(float first, float second) {
        return (int) (first % second);
    }

    public int divRest(int first, int second, int third) {
        return first % second % third;
    }

    public int divRest(double first, double second, float third, int fourth) {
        return (int) (first % second % third % fourth);
    }

}






