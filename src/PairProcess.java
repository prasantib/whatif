import java.util.Scanner;

public class PairProcess {

    public static void main(String[] args) {
        int num1, num2, sum, product, avg;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? ");
        num2 = keyboard.nextInt();

        sum = (num1 + num2);
        if (sum > 200);
        System.out.println("sum = " + sum + "*");

        product = (num1 * num2);
        System.out.println("product = " + product);

        avg = (sum / 2);
        System.out.println("avg = " + avg);
    }

}