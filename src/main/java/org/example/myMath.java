package org.example;

public class myMath {

    public static final double PI = 3.1415926535;
    public static final double E = 2.7182818284;

    public static double changeSign(double input) { // Возвращает значение double с обратным знаком
        short minusOne = -1;
        double output = input * minusOne;
        return output;
    }

    public static int changeSign(int input) { // Возвращает значение int с обратным знаком
        short minusOne = -1;
        int output = input * minusOne;
        return output;
    }

    public static long changeSign(long input) { // Возвращает значение long с обратным знаком
        short minusOne = -1;
        long output = input * minusOne;
        return output;
    }

    public static float changeSign(float input) { // Возвращает значение float с обратным знаком
        short minusOne = -1;
        float output = input * minusOne;
        return output;
    }

    public static int ctg(int sideA, int sideB) { // Возвращает котангенс заданного угла
        int ctg = sideB / sideA;
        return ctg;
    }

    public static double arcctg(int ctg) {
        double arcctg = (1 / ctg);
        return arcctg;
    }


    public static double circleLength(int diam) { // Возвращает длину окружности
        double length = diam * PI;
        return length;
    }


    /* public static void primeNumbers(int firstPoint, int secondPoint) { // Должно возвращать простое число, но не работает
        for (int number = firstPoint; number <= secondPoint; number++){
            for (int P = 1; P <= number; P++) {
                for (int i = 1; i < P; i++){
                    if (P % i == 0){
                        System.out.println(P + " ");
                    }
                }
            }
        }
    } */

    public static double sqrt(double x, double eps) {
        double guess = x;
        double error = guess * guess - x;
        while (error > eps) {
            guess = (guess + x / guess) / 2.0;
            error = guess * guess - x;
        }
        return guess;
    }
}



