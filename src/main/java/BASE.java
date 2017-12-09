
import java.util.Scanner;

/**
 * @author Ivilis
 */
public class BASE {
    public static void main(String[] args) {

        //запрашиваем выбор операций 1 - калькулятор, 2 - поиск максимального элемента массива строк
        Scanner firstSwitchScan = new Scanner(System.in);
        System.out.println("Choose, what to do:\n 1 - Calculator\n 2 - Array Stuff");
        int mainSwitch = firstSwitchScan.nextInt();

//кейс 1 - калькулятор
        switch (mainSwitch) {
            case 1:


                Scanner scanThis = new Scanner(System.in);

                //запрашиваем первый операнд
                System.out.println("Print the First Operand");
                float a = scanThis.nextFloat();

                //запрашиваем второй операнд
                System.out.println("Print the Second Operand");
                float b = scanThis.nextFloat();

                //запрашиваем операцию
                System.out.println("Choose your operation from list:\n 1: +\n 2: -\n 3: *\n 4: /");
                int z = scanThis.nextInt();

                scanThis.close();

                switch (z) {
                    case 1:
                        float sum = a + b;
                        System.out.printf("%.4f + %.4f = %.4f", a, b, sum);
                        break;
                    case 2:
                        float sub = a - b;
                        System.out.printf("%.4f - %.4f = %.4f", a, b, sub);
                        break;
                    case 3:
                        float multip = a * b;
                        System.out.printf("%.4f * %.4f = %.4f", a, b, multip);
                        break;
                    case 4:
                        float div = a / b;
                        System.out.printf("%.4f / %.4f = %.4f", a, b, div);
                        break;
                    default:
                        System.out.printf("Это уже какой-то бред");
                        break;
                }
                break;

                //кейс 2 - поиск максимального элемента массива строк
            case 2:

                Scanner massiveScan = new Scanner(System.in);

                //запрашиваем размер массива
                System.out.println("Задайте размер одномерного массива cлов целым числом. Если не целым, то всё сломается. ЗЫ. обработка ошибок будет добавлена в будущих релизах");
                int arrSize = massiveScan.nextInt();
                String wordArr[] = new String[arrSize];

                //запрашиваем ввод элементов массива
                System.out.println("Вводи слова - элементы массива:");
                for (int i=0; i < arrSize; i++)
                {wordArr[i] = massiveScan.next();}

                //выводим массив на экран
                System.out.printf("Ваш массив из %d элементов: \n", arrSize);

                for (int i=0; i < arrSize; i++)
                {
                    int visibleCount = i+1;
                    System.out.printf("Элемент №" + visibleCount + ": ");
                    System.out.println(wordArr[i]);
                }

                //находим максимальный элемент массива строк
                String longestWord = wordArr[0];
                for (int i=0; i < arrSize-1; i++) {
                    if (longestWord.length() < wordArr[i + 1].length()) {
                        longestWord = wordArr[i+1];
                    }
                }

                //выводим его на экран
                System.out.println("Длиннейшее слово в массиве: ");
                System.out.println(longestWord);
                break;

            default:
                System.out.printf("Не знаю такой операции");
                break;
        }
        firstSwitchScan.close();

        ////легаси код калькулятора.
        /*//выводим выводим результат в зависимости от выбранной операции
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
        */
    }
}
