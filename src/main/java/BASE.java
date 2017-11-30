import java.util.Scanner;

/**
 * @author Ivilis
 */
public class BASE {
    public static void main(String[] args) {


        Scanner ScanThis = new Scanner(System.in);

        System.out.println("Print the First Operand");
        float a = ScanThis.nextFloat();

        System.out.println("Print the Second Operand");
        float b = ScanThis.nextFloat();

        ScanThis.close();

        float sum = a + b;
        System.out.printf("Sum of %.4f and %.4f is %.4f", a, b, sum);
    }
}
