
import java.util.InputMismatchException;
import java.util.Scanner;
import ProgBranches.*;

/**
 * @author Ivilis
 */
public class BASE {
    public static void main(String[] args) {

        //запрашиваем выбор операций 1 - калькулятор, 2 - поиск максимального элемента массива строк
        Scanner firstSwitchScan = new Scanner(System.in);
        System.out.println("Choose, what to do:\n 1 - Calculator\n 2 - Array Stuff");
        //ловим невалидный ввод всюду
        try {
            int mainSwitch = firstSwitchScan.nextInt();


//кейс 1 - калькулятор
        switch (mainSwitch) {
            case 1:

                Calculator calc1 = new Calculator();
                Scanner scanThis = new Scanner(System.in);

                //запрашиваем первый операнд
                System.out.println("Print the First Operand");
                calc1.setOperand1(scanThis.nextFloat());

                //запрашиваем второй операнд
                System.out.println("Print the Second Operand");
                calc1.setOperand2(scanThis.nextFloat());

                //запрашиваем операцию
                System.out.println("Choose your operation from list:\n 1: +\n 2: -\n 3: *\n 4: /");
                int z = scanThis.nextInt();


                scanThis.close();

                switch (z) {
                    case 1:
                        calc1.calculateSum();
                        //System.out.printf("%.4f + %.4f = %.4f", calc1.getOperand1(), calc1.getOperand2(), calc1.calculateSum());
                        break;
                    case 2:
                        calc1.calculateSubtraction();
                        //System.out.printf("%.4f - %.4f = %.4f", calc1.getOperand1(), calc1.getOperand2(), calc1.calculateSubtraction());
                        break;
                    case 3:
                        calc1.calculateMultiplication();
                        //System.out.printf("%.4f * %.4f = %.4f", calc1.getOperand1(), calc1.getOperand2(), calc1.calculateMultiplication());
                        break;
                    case 4:
                        calc1.calculateDivision();
                        //System.out.printf("%.4f / %.4f = %.4f", calc1.getOperand1(), calc1.getOperand2(), calc1.calculateDivision());
                        break;
                    default:
                        System.out.printf("Это уже какой-то бред");
                        break;
                }

                break;



                //кейс 2 - поиск максимального элемента массива строк
            case 2:

                //создаем экземпляр MaxArrayElement
                MaxArrayElement newWordArray = new MaxArrayElement();
                Scanner massiveScan = new Scanner(System.in);

                //запрашиваем размер массива
                System.out.println("Задайте размер одномерного массива cлов целым числом. Если не целым, то всё сломается. ЗЫ. обработка ошибок будет добавлена в будущих релизах");
                newWordArray.setArrSize(massiveScan.nextInt());
                newWordArray.setWordArr(new String[newWordArray.getArrSize()]);

                //запрашиваем ввод элементов массива
                System.out.println("Вводи слова - элементы массива:");
                for (int i=0; i < newWordArray.getArrSize(); i++)
                {newWordArray.getWordArr()[i] = massiveScan.next();}

                //выводим массив на экран
                newWordArray.printMassive();

                //выводим его на экран
                System.out.println("Длиннейшее слово в массиве: ");
                System.out.println(newWordArray.getMaxElement());
                break;

            default:
                System.out.printf("Не знаю такой операции");
                break;
        }
        firstSwitchScan.close();

        } // обработка пойманного невалидного ввода
        catch (InputMismatchException e1)
        {
            System.out.println("We got Exception: " + e1.toString());
            System.out.println("Only numbers, man! Think about that.");
        }

    }
}
