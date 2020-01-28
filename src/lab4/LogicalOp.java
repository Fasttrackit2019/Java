package lab4;

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

    //Write a program called SumAndAverage to produce the sum of 1, 2, 3, ... , to 100
//Also compute and display the average
    public void printToHundred(int number) {
        int sum = 0;
        int count = 0;
        for (int i = number; i <= 100; i++) {
            count++;
            sum = sum + i;
            System.out.println("Numarul este " + i);
        }
        System.out.println("Media este " + sum / count);
    }

    public void printFromHundred(int first, int second) {
        for (int i = first; i >= second; i--) {
            System.out.println(i + ",");
        }
    }

    //Sa se afiseze numerele pare de la 0 la -100
    public void evenNumber(int number) {
        for (int i = number; i >= -100; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    //    Sa se afiseze doar numerele impare crescator
    public void unevenNumber(int first, int second) {
        for (int i = first; i <= second; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}




