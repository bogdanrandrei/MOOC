package Week2;

public class Exercise28HundredToOne {
    public static void main(String[] args) {
        int number = 100;

        while (number >= 1) {
            System.out.println(number);
            number--;  // number++ means the same as number = number + 1
        }
    }
}
