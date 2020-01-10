package Week3;

public class Exercise46AverageGivenNumbers {
    public static double average(int number1, int number2, int number3, int number4) {
        int sum = sum(number1, number2, number3, number4);
        double average = (double) sum / 4;
        return average;
    }

    public static int sum(int number1, int number2, int number3, int number4) {
        int sum = number1+ number2+number3+number4;
        return sum;
    }

    public static void main(String[] args) {
        double raspunsMedie = average(4, 3, 6, 1);
        System.out.println("average: " + raspunsMedie);
    }
}
