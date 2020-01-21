package temaLab3.calculator;

public class Main {

    public static void main(String[] args) {

        Calculator op = new Calculator();

        //      Q1 Assignment
        System.out.println(op.addition(10, 5));
        System.out.println(op.difference(50, 36));
        System.out.println(op.multiply(110, 240));
        System.out.println(op.division(29, 13));

        System.out.println(op.average(3, 8, 11));

        System.out.println(op.divRest(100, 17));

        System.out.println(op.celsius(100));

        System.out.println(op.inch(50));

        System.out.println(op.speedMetersPerSecond(100, 5, 20, 15));
        System.out.println(op.speedKilometersPerHour(100, 5, 20, 15));
        System.out.println(op.speedMilesPerHour(100, 5, 20, 15));

        LogicalOp op1 = new LogicalOp();

        //      Q3 Assignment
        int biggest = op1.checkBiggerNumber(2, 3);
        System.out.println("The bigger number is " + biggest);

        //      Q4 Assignment
        String text = "FastTrack";
        String result = op1.verifyText(text);
        System.out.println(result);

        //      Q5 Assignment
        String text1 = "FastTrackIT";
        String result1 = op1.verifyTextAndNumber(text1, 4);
        System.out.println(result1);

        //      Q6 Assignment
        System.out.println(op1.snowLevel(6));

        //      Q7 Assignment
        System.out.println(op1.verifyNumber(6));

        //      Q8 Assignment
        System.out.println(op1.switchNumber(2));

        //      Q9 Assignment
        System.out.println(op1.isNumberEven(10));

        //      Q10 Assignment
        System.out.println(op1.isEligibleToVote(20));

        //      Q11 Assignment
        System.out.println(op1.bestOfThree(75.5f, 20.5f, 15.5f));


    }


}











