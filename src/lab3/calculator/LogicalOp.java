package lab3.calculator;

public class LogicalOp {
    public int verifyGreaterNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public String verifyText(String text) {
        if (text.equals("FastTrack")) {
            return ("Learning text comparison");
        } else {
            return ("Got to try some more");
        }
    }

    public void donumber(int number) {
        if (number >= 2 && number <= 8) {
            System.out.println(number);
        }
    }
}



