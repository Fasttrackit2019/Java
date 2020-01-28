package temaLab4.calculator;

public class LogicalOp {

    //    Q1 Assignment
    public void countToHundred(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }

    //    Q2 Assignment
    public void countToNumber(int number) {
        for (int i = number; i >= -100; i--) {
            System.out.println(i);
        }
    }

    //   Q3 Assignment
    public void countBetweenNumbers(int first, int second) {
        for (int i = first; i <= second; i++) {
            System.out.println(i);
        }
    }

    //    Q4 Assignment
    public void countFromGivenNumbers(int first, int second) {
        if (first > second) {
            for (int i = first; i >= second; i--) {
                System.out.println(i);
            }
        } else if (first < second) {
            for (int j = first; j <= second; j++) {
                System.out.println(j);
            }
        } else {
            System.out.println("The given numbers are identical");
        }
    }

    //        Q5 Assignment
    public void evenNumber(int number) {
        for (int i = number; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    //    Q6 Assignment
    public void unevenNumber(int number) {
        for (int i = number; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    //    Q7 Assignment
    public void sumFromOneToHundred(int number) {
        int sum = 0;
        for (int i = number; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("Suma numerelor pana la 100 este " + sum);
    }

    //    Q8 Assignment
    public void printToHundred(int number) {
        float sum = 0f;
        int count = 0;
        for (int i = number; i <= 100; i++) {
            count++;
            sum = sum + i;
        }
        float result = sum / count;
        System.out.println("Media primelor 100 numere adunate este " + result);
    }

    //    Q9 Assignment
    public void printPattern(int first, int second) {
        for (int i = first; i <= second; i++) {
            for (int j = second; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("\n");
        }

    }

}



















