import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        //Объявите три массива:
        //Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.
        //Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
        //Произвольный массив. Тип и количество данных определите сами.
        // Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.
        int [] arrayOne = new int[3];
        arrayOne[0] = 1;
        arrayOne[1] = 2;
        arrayOne[2] = 3;
        float [] arrayTwo = {1.57f, 7.654f, 9.986f};
        char [] arrayThree = {'A', 'B', 'C', '1', '2', '3'};

        System.out.println("Task 2");
        //Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую.
        // В конце строки запятую ставить не надо.
        for (int i = 0; i < arrayOne.length; i ++) {
            System.out.print(i < arrayOne.length - 1 ? arrayOne[i] + ", " : arrayOne[i]);
            }
        System.out.println(" ");
        System.out.println(Arrays.toString (arrayTwo));
        System.out.println(Arrays.toString(arrayThree));

        System.out.println("Task 3");
        //Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую.
        // В конце строки запятую ставить не надо.
        for (int i = arrayOne.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrayOne[i]);
                break;
            }
            System.out.print(arrayOne[i] + ", ");
        }
        for (int i = arrayTwo.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrayTwo[i]);
                break;
            }
            System.out.print(arrayTwo[i] + ", ");
        }
        for (int i = arrayThree.length - 1; i >= 0 ; i--) {
            System.out.print(i > 0 ? arrayThree[i] + ", " : arrayThree[i]);
        }

        System.out.println(" ");
        System.out.println("Task 4");
        //Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте
        // четными (нужно прибавить 1).
        //Важно: код должен работать с любым целочисленным массивом, поэтому для решения
        // задания используйте циклы.

        for (int i = 0; i <= arrayOne.length - 1; i ++) {
            if (arrayOne[i] % 2 != 0) {
               arrayOne[i] += 1;
            }
             //System.out.println(Arrays.toString(arrayOne));
           }
        System.out.println(Arrays.toString(arrayOne));

        }
    }