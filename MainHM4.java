//@author Aliaksandra_Baranava

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int arrayCapacity = sc.nextInt();
        double[] array = new double[arrayCapacity];
        for (int i = 0; i < arrayCapacity; i++) {
            array[i] = Math.round(Math.random() * 100);
        }

//Задача 1:
// Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
        System.out.println("Задача 1.");
        System.out.println("Элементы массива по порядку: ");
        for (int i = 0; i < arrayCapacity; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Элементы массива в обратном порядке: ");
        for (int i = arrayCapacity - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

//Задача 2:
//Найти минимальный-максимальный элементы и вывести в консоль.
//Задача 3:
//Найти индексы минимального и максимального элементов и вывести в консоль
        System.out.println("Задачи 2 и 3.");
        double maxNum = array[0], minNum = array[0];
        int maxNumIndex = 0, minNumIndex = 0;
        for (int i = 0; i < arrayCapacity; i++) {
            if (maxNum < array[i]) {
                maxNum = array[i];
                maxNumIndex = i;
            }
        }
        for (int i = 0; i < arrayCapacity; i++) {
            if (minNum > array[i]) {
                minNum = array[i];
                minNumIndex = i;
            }
        }
        System.out.println("Максимальный элемент: " + maxNum + ", его индекс: " + maxNumIndex);
        System.out.println("Минимальный элемент: " + minNum + ", его индекс: " + minNumIndex);

//Задача 4:
//Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
//сообщение, что их нет.
        System.out.println("Задача 4.");
        int zeroCount = 0;
        for (int i = 0; i < arrayCapacity; i++) {
            if (array[i] == 0) {
                zeroCount++;
            }
        }
        System.out.println("Количество нулевых элементов: " + zeroCount);

//Задача 5:
//Пройти по массиву и поменять местами элементы первый и последний, второй и
//предпоследний и т.д.
        System.out.println("Задача 5.");
        double temp = 0;
        for (int i = 0; i < arrayCapacity - i; i++) {
            temp = array[arrayCapacity - 1 - i];
            array[arrayCapacity - 1 - i] = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));

//Задача 6:
//Проверить, является ли массив возрастающей последовательностью (каждое следующее
//число больше предыдущего).
        System.out.println("Задача 6.");
        boolean a = true;
        for (int i = 1; i < arrayCapacity; i++) {
            if (array[i - 1] > array[i]) {
                System.out.println("Массив не является возрастающей последовательностью.");
                a = false;
                break;
            }
        }
        if (a) {
            System.out.println("Массив является возрастающей последовательностью.");
        }

//Задача *:
//Имеется массив из неотрицательных чисел(любой). Представьте что массив
//представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
//добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
//содержит нуля в начале, кроме самого числа 0.
        System.out.println("Задача *.");
        int[] arrayNew = new int[]{1, 1, 1};
        int size = arrayNew.length;
        System.out.println(Arrays.toString(arrayNew));
        if (arrayNew[size - 1] != 9) {
            arrayNew[size - 1] += 1;
            System.out.println(Arrays.toString(arrayNew));
        } else {
            arrayNew[size - 1] = 0;
            for (int i = size - 2; i >= 0; i--) {
                if (i == 0) {
                    if (arrayNew[0] != 9) {
                        arrayNew[0] += 1;
                        System.out.println(Arrays.toString(arrayNew));
                        break;
                    } else {
                        int[] arrayFinal = new int[size + 1];
                        arrayFinal[0] = 1;
                        System.out.println(Arrays.toString(arrayFinal));
                    }
                if (arrayNew[i] != 9) {
                    arrayNew[i] += 1;
                    System.out.println(Arrays.toString(arrayNew));
                    break;
                } else arrayNew[i] = 0;
                }
            }
        }
    }
}
