import java.util.Random;

public class task_08 {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.printf("%-8s%-8s%-8s%-8s%-8s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
        System.out.println("-".repeat(40));

        int roll = 0;
        boolean triple = false;

        while (!triple) {
            roll++;
            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;
            int die3 = random.nextInt(6) + 1;
            int sum = die1 + die2 + die3;

            System.out.printf("%-8d%-8d%-8d%-8d%-8d%n", roll, die1, die2, die3, sum);

            triple = (die1 == die2 && die2 == die3);
        }
    }
}


