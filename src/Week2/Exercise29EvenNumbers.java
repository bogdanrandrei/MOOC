package Week2;

public class Exercise29EvenNumbers {
    public static void main(String[] args) {
        System.out.println();
        int number = 2;
        while (number <= 100) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number++;
        }
    }
}

