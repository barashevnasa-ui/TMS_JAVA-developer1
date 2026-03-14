//@author Aliaksandra_Baranava

import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        int arrayString, arrayColumn;
        Scanner sc = new Scanner(System.in);

//Задача 1:
//1.1 Создать двумерный массив, заполнить его случайными числами.
//1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
//1.3 Найти сумму всех получившихся элементов и вывести в консоль.
        System.out.println("Задача 1.");
        System.out.println("Введите количество строк массива: ");
        arrayString = sc.nextInt();
        System.out.println("Введите количество столбцов массива: ");
        arrayColumn = sc.nextInt();
        double[][] array = new double[arrayString][arrayColumn];
        for (int i = 0; i < arrayString; i++) {
            for (int j = 0; j < arrayColumn; j++) {
                array[i][j] = Math.round(Math.random() * 100);
            }
        }
        for (int i = 0; i < arrayString; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        for (int i = 0; i < arrayString; i++) {
            for (int j = 0; j < arrayColumn; j++) {
                System.out.println("Введите число: ");
                double num = sc.nextDouble();
                array[i][j] += num;
            }
        }
        for (int i = 0; i < arrayString; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        double sum = 0;
        for (int i = 0; i < arrayString; i++) {
            for (int j = 0; j < arrayColumn; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Сумма элементов массива: " + sum);

//Задача 2:
//Создать программу для раскраски шахматной доски с помощью цикла. Создать
//двумерный массив String 8х8. С помощью циклов задать элементам массива значения
//B(Black) или W(White)
        System.out.println("Задача 2.");
        String[][] chess = new String[8][8];
        for (int i = 0; i < 7; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j <= 6; j += 2) {
                    chess[i][j] = "W";
                    chess[i][j + 1] = "B";
                }
            } else {
                for (int j = 0; j <= 6; j += 2) {
                    chess[i][j] = "B";
                    chess[i][j + 1] = "W";
                }
            }
            System.out.println(Arrays.toString(chess[i]));
        }

//Задача *:
//Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).
//Формат входных данных:
//Программа получает на вход два числа n и m.
//Формат выходных данных:
//Программа должна вывести полученный массив, отводя на вывод каждого числа ровно 3
//символа.
        System.out.println("Задача *.");
        int n, m;
        System.out.println("Введите количество строк массива: ");
        n = sc.nextInt();
        System.out.println("Введите количество столбцов массива: ");
        m = sc.nextInt();
        int number = 0;
        int[][] A = new int[n][m];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    A[i][j] = number;
                    number++;
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    A[i][j] = number;
                    number++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print((A[i][j] < 10 ? "  " : (A[i][j] < 100 ? " " : "")) + A[i][j]);
            }
            System.out.println();
        }
    }
}