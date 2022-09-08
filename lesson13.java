package com.company;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main {


    static void fillMatrix(int[][] arr, int left, int right) {
        Random gen = new Random();
        for (int i = 0; i < arr.length; i++) {//arr.length - кол-во строк в матрице
            for (int j = 0; j < arr[i].length; j++) {//arr[i].length - кол-во столбцов в строке
                arr[i][j] = gen.nextInt(right - left + 1) + left;
            }
        }
    }

    static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void task1(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {//arr.length - кол-во строк в матрице
            for (int j = 0; j < arr[i].length; j++) {//arr[i].length - кол-во столбцов в строке
                arr[i][j] = 10 * i;
            }
        }
    }

    static void task2(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {//arr.length - кол-во строк в матрице
            for (int j = 0; j < arr[i].length; j++) {//arr[i].length - кол-во столбцов в строке
                arr[i][j] = 5 * j;
            }
        }
    }

    static void showString(int[][] arrayName, int k) {
        if (k < 0 || k >= arrayName.length - 1) {
            System.out.println("Ошибка. Нет такой строки. ");
        } else {
            for (int i = 0; i < arrayName[k].length; i++) {
                System.out.print(arrayName[k][i] + " ");
            }
            System.out.println();

        }

    }

    static void showRow(int[][] arrayName, int k) {
        if (k < 0 || k >= arrayName[0].length - 1) {
            System.out.println("Ошибка. Нет такого столбца. ");
        } else {
            for (int i = 0; i < arrayName.length; i++) {
                System.out.print(arrayName[i][k] + " ");
            }
            System.out.println();
        }
    }

    static void printEvenRows(int[][] arrayName) {
        for (int i = 0; i < arrayName.length; i += 2) {
            for (int j = 0; j < arrayName[i].length; j++) {
                System.out.print(arrayName[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int sumofRow(int[][] arrayName, int k) {
        int sum = 0;
        if (k < 0 || k > arrayName.length) {
            System.out.println("Ошибка нет такой строки. ");
        } else {
            for (int j = 0; j < arrayName.length; j++) {
                sum += arrayName.length;
            }

        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int n = 4;
        final int m = 5;
        int[][] mas = new int[n][m];
        System.out.print("Введите номер строки: ");

        fillMatrix(mas, 0, 10);
        //printMatrix(mas);
        //Matrix1. Даны целые положительные числа M и N.
        // Сформировать целочисленную матрицу размера M × N, у которой все элементы I-й строки имеют
        //task1(mas);
        //printMatrix(mas);
        //Matrix2. Даны целые положительные числа M и N.
        // Сформировать целочисленную матрицу размера M × N, у которой все элементы J-го столбца
        //имеют значение 5·J (J = 1, . . ., N).
        //Matrix7◦
        //Дана матрица размера M × N и целое число K (0 ≤ K < M). Вывести
        //элементы K-й строки данной матрицы.
        //task2(mas);
        //printMatrix(mas);
        //fillMatrix(mas, 0,10);
        //showString(mas, k);
        //Matrix8. Дана матрица размера M × N и целое число K (1 ≤ K ≤ N). Вывести
        //элементы K-го столбца данной матрицы.
        //fillMatrix(mas, 0, 10);
        //showRow(mas, k);
        //Matrix9. Дан массив размера M × N. Вывести ее элементы, расположенные
        //в строках с четными номерами (0, 2, 4, . . .). Вывод элементов производить
        //по строкам, условный оператор не использовать
        //Matrix17. Дана матрица размера M × N и целое число K (0 ≤ K ≤ M). Найти
        //сумму и произведение элементов K-й строки данной матрицы.
        /*fillMatrix(mas,1, 5);
        printMatrix(mas);
        int k;
        do {
            System.out.print("Введите номер строки: ");
            k = in.nextInt();
        }while(k < 0 || k >= mas.length);
        System.out.println("Сумма элементов " + k + " -ой строки" + sumofRow(mas,k));
        printEvenRows(mas);
        */
        //Сумма её элементов
        for (int i = 0; i < mas.length; i++) {
            int sum = 0;
            for (int j = 0; j < mas[i].length; j++) {
                sum += mas[i][j];
            }
            System.out.print(sum + " ");
        }
    }
}
