package temaLab3.calculator;

public class LogicalOp {

    //     Q3 Assignment
    public int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    //      Q4 Assignment
    public String verifyText(String text) {
        if (text.equals("FastTrack")) {
            return ("Learning text comparison");
        } else {
            return ("Got to try some more");
        }
    }

    //      Q5 Assignment
    public String verifyTextAndNumber(String text1, int number) {
        if (text1.equals("FastTrackIT") && number <= 3) {
            return (text1 + " " + number);
        } else if (!text1.equals("FastTrackIT") && number >= 4) {
            return (number + " " + text1);
        } else {
            return ("Default" + " " + number);
        }
    }

    //      Q6 Assignment
    public String snowLevel(int number) {
        if (number > 8 || number == 6) {
            return "The amount of snow this winter was(cm): " + number;
        } else {
            return "The forecast snow is(cm): " + number;
        }
    }

    //      Q7 Assignment
    public String verifyNumber(int number) {
        if (number > 3 && number != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (number == 4) {
            return "The number is equal to 4";
        } else {
            return "The number is lower than 3";
        }
    }

    //      Q8 Assignment
    public String switchNumber(int value) {
        switch (value) {
            case 1:
                return "The number is 1!";
            case 2:
                return "The number is 2!";
            case 3:
                return "The number is 3!";
            default:
                return "Default!";
        }
    }

    //      Q9 Assignment
    public boolean isNumberEven(int number) {
//        return number % 2 == 0; (simplified mode)
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //      Q10 Assignment
    public boolean isEligibleToVote(int number) {
//       return number > 18; (simplified mode)
        if (number > 18) {
            return true;
        } else {
            return false;
        }
    }

    //      Q11 Assignment

    public float bestOfThree(float first, float second, float third) {
        if (first > second && first > third) {
            return first;
        } else if (second > first && second > third) {
            return second;
        } else if (third > first && third > second) {
            return third;
        } else {
            return 0;
        }
    }


}








