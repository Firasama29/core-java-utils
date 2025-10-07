package main.java.numbers;

import java.util.Arrays;

public class NumberUtils {

    // addition
    public static double add(double num1, double num2) {
        return num1 + num1;
    }

    // subtraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // division
    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("Cannot perform this operation!");
        }
    }

    // square root
    public static double sequareRoot(double num) {
        return num * num;
    }

    // cube root
    public static double cubeRoot(double num) {
        return num * num * num;
    }

    // even/odd checker
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // positive/negative
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    // modulus
    public static double modulus(double num1, double num2) {
        return num1 % num2;
    }

    // average
    public static double average(double[] numbers) {
        double result = 0;
        for (double number : numbers) {
            result += number;
        }
        return result / numbers.length;
    }

    // median
    public static double median(double[] numbers) {
        /* sort the array
        get the number of items in the array
        if the count is odd, the middle item is the median
        if the count is even, the middle is the average of the two middle numbers
         */
        Arrays.sort(numbers);
        int count = numbers.length;
        if (count % 2 == 0) {
            return ((numbers[count / 2 - 1]) + (numbers[count / 2])) / 2;
        } else {
            return numbers[count / 2];
        }
    }

    // absolute number
    public static int absolute(int number) {
        return number >= 0 ? number : number * -1;
    }

    // exponentiation
    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result * base;
        }
        return result;
    }

    // sum
    public static int sum(int[] numbers) {
        int result = 0;
        for (int num : numbers) {
            result += num;
        }
        return result;
    }

    // percentage
    public static double percentage(double num1, double num2) {
        return (num1 / num2) * 100;
    }

    // rounding
    public static double round(double num) {
        return Math.round((double) num);
    }

    // ceil
    public static double ceil(double num) {
        return Math.ceil(num);
    }

    // floor
    public static double floor(double num) {
        return Math.floor(num);
    }

    // max number in an array
    public static int max(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    // min number in an array
    public static int min(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    // generate random number
    public static double random() {
        return Math.random();
    }
}
