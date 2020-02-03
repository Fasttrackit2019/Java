package temaLab4.calculator;

public class LogicalOp {

    //    FOR loops

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

    //    WHILE loops

    //    Q1 Assignment
    public void countToPositive(int i) {
        do {
            System.out.println(i);
            i++;
        } while (i <= 100);
    }

    //    Q2 Assignment
    public void countToNegative(int i) {
        do {
            System.out.println(i);
            i--;
        } while (i >= -100);
    }

    //    Q3 Assignment
    public void countBetweenVariables(int x, int y) {
        do {
            System.out.println(x);
            x++;
        } while (x <= y);
    }

    //    Q4 Assignment
    public void countBetweenInterval(int x, int y) {
        if (x < y) {
            do {
                System.out.println(x);
                x++;
            } while (x <= y);
        } else if (x > y) {
            do {
                System.out.println(x);
                x--;
            } while (x >= y);
        } else {
            System.out.println("The numbers are identical");
        }
    }

    //    Q5 Assignment
    public void countEvenNumberToHundred(int x) {
        do {
            if (x % 2 == 0) {
                System.out.println(x);
            }
            x++;
        } while (x <= 100);
    }

    //    Q6 Assignment
    public void countUnevenNumberToHundred(int x) {
        do {
            if (x % 2 != 0) {
                System.out.println(x);
            }
            x++;
        } while (x <= 100);
    }

    //    Q7 Assignment
    public float getAverage(int first, int second) {
        float sum = 0;
        float average = 0;
        int counter = 0;
        while (first <= second) {
            sum += first;
            first++;
            counter++;
        }
        average = sum / counter;
        return average;
    }

    //    Q8 Assignment          ??????????????????????
    public float getAverageDivSeven(int first, int second) {
        float sum = 0;
        float average = 0;
        int counter = 0;
        do {
            if (sum % 7 == 0) {
                average = sum / counter;
                first++;
                counter++;
            }
        } while (first < second);
        return average;
    }

    //    Q9 Assignment
    public void fibonacciTwenty(int x, int y) {
        x = 0;
        y = 1;
        int sum = 0;
        int counter = 0;
        do {
            System.out.println(sum);
            x = y;
            y = sum;
            x++;
        } while (counter <= 18);
    }

    //    Q10 Assignment                       ??????????????????????????
    public void cozaLozaWoza(int i) {

        do {
            System.out.println(i);
            if (i % 3 == 0) {
                System.out.print("Coza");
            }
            if (i % 5 == 0) {
                System.out.print("Loza");
            }
            if (i % 7 == 0) {
                System.out.print("Woza");
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("CozaLoza");
            }
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println("WozaLoza");
            }
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.println("CozaLozaWoza");
            }
            i++;
        } while (i <= 110);
    }
}
































