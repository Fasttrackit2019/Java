package lab3.calculator;

import lab3.calculator.LogicalOp;
import org.w3c.dom.ls.LSOutput;

public class Main {
//given the numbers see which one is the greatest an print it

    public static void main(String[] args) {
        int x = 3;
        int y = 8;

        LogicalOp op = new LogicalOp();
        System.out.println(op.verifyGreaterNumber(x, y));

//            Given a number, if it's equal to or higher than 2 and equal to or lower than 8, print the number
        op.donumber(5);


        //        Given a text input, if it is "FastTrack" then print "Learning text comparison" if not, print "Got to try some more"

        String text = "FastTrack";
        String result = op.verifyText(text);
        System.out.println(result);
    }


}