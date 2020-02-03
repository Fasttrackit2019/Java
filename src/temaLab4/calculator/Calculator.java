package temaLab4.calculator;

public class Calculator {

    public int addition(int first, int second) {
        int result = first + second;
        return result;
    }

    public int difference(int first, int second) {
        int result = first - second;
        return result;
    }

    public int multiply(int first, int second) {
        int result = first * second;
        return result;
    }

    public float division(float first, float second) {
        float result = first / second;
        return result;
    }

    public float average(float first, float second, float third) {
        float result = (first + second + third) / 3;
        return result;
    }

    public int divRest(int first, int second) {
        int result = first % second;
        return result;
    }

    public float celsius(float x) {
        float result = 5f / 9f * (x - 32);
        return result;
    }

    public float inch(float x) {
        float result = x * 0.0254f;
        return result;
    }

    public float speedMetersPerSecond(float meters, float hours, float minutes, float seconds) {
        float speed1 = meters / (seconds + minutes * 60 + hours * 3600);
        return speed1;
    }

    public float speedKilometersPerHour(float meters, float hours, float minutes, float seconds) {
        float speed2 = (meters / 1000) / (hours + minutes / 60 + seconds / 3600);
        return speed2;
    }

    public float speedMilesPerHour(float meters, float hours, float minutes, float seconds) {
        float speed3 = (meters / 1609) / (hours + minutes / 60 + seconds / 3600);
        return speed3;
    }


}






