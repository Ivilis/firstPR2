import java.util.Scanner;

/**
 * @author Ivilis
 */
public class BASE {
    public static void main(String[] args) {

        Scanner ScanThis = new Scanner(System.in);

        //запрашиваем первый операнд
        System.out.println("Print the First Operand");
        float a = ScanThis.nextFloat();

        //запрашиваем второй операнд
        System.out.println("Print the Second Operand");
        float b = ScanThis.nextFloat();

        //запрашиваем операцию
        System.out.println("Choose your operation from list: + , - , * , /");
        String z = ScanThis.next();

        ScanThis.close();

        //выводим выводим результат в зависимости от выбранной операции
        if (z.equals("+"))
        {
            float rez = a + b;
            System.out.printf("%.4f + %.4f = %.4f", a, b, rez);
        } else if (z.equals("-"))
        {
            float rez = a - b;
            System.out.printf("%.4f - %.4f = %.4f", a, b, rez);
        } else if (z.equals("*"))
        {
            float rez = a * b;
            System.out.printf("%.4f * %.4f = %.4f", a, b, rez);
        } else if (z.equals("/"))
        {
            float rez = a / b;
            System.out.printf("%.4f * %.4f = %.4f", a, b, rez);
        }
        else System.out.println("Invalid Operation Symbol!!!");
    }
}
