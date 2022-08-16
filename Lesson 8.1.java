package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //Array32. Дан массив размера N. Найти номер его первого локального минимума (локальный минимум — это элемент, который меньше любого из своих
        //соседей).
      /*
        Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.print("Введите размер массива ");
            size = in.nextInt();

        } while (size <= 0);
        int[] arr = new int[size];
        Random gen = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = gen.nextInt(10);
            System.out.println(arr[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
                System.out.println(arr[i] + " на позиции " + i);
                */
        /*
        Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.print("Введите размер массива ");
            size = in.nextInt();

        } while (size <= 0);
        int[] arr = new int[size];
        Random gen = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = gen.nextInt(10);
            System.out.println(arr[i] + " ");
        }
        System.out.println();

        int min = arr[0];
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;

            }
        }
        System.out.println("min = " + min + " index = " + minIndex);
        */
        /*
        Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.print("Введите размер массива ");
            size = in.nextInt();

        } while (size <= 0);
        int[] arr = new int[size];
        Random gen = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = gen.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int min = arr[0];
        int minIndex = 0;
        for (int i = 0; i < arr.length; i += 2) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
         */
        /*
        Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.print("Введите размер массива ");
            size = in.nextInt();

        } while (size <= 0);
        int[] arr = new int[size];
        Random gen = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = gen.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int max = arr[1];
        int maxIndex = 1;
        for (int i = 1; i < arr.length; i += 2) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
                System.out.print("min = " + max + " index = " + maxIndex);
         */
        //Array51. Даны массивы A и B одинакового размера N. Поменять местами их
        //содержимое и вывести вначале элементы преобразованного массива A, а
        //затем — элементы преобразованного массива B.
         /*
        Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.print("Введите размер массива ");
            size = in.nextInt();

        } while (size <= 0);
        int[] arr = new int[size];
        int[] mas = new int[size];
        // заполнение массива
        Random gen = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = gen.nextInt(10);
            mas[i] = gen.nextInt(21) - 10;

        }
        System.out.println("Массив arr ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Массив mas ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(mas[i] + " ");
        }
        //обмен
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            arr[i] = mas[i];
            mas[i] = temp;
        }
        //вывод массива
        System.out.println("Массив arr ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Массив mas ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        */
        //Array52. Дан массив A размера N. Сформировать новый массив B того же
        //размера, элементы которого определяются следующим образом:
        //B[K] = 2·A[K], если A[K] < 5,
        //A[K]/2 в противном случае.
        /*
        Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.print("Введите размер массива ");
            size = in.nextInt();

        } while (size <= 0);
        int[] a = new int[size];
        int[] b = new int[size];
        // заполнение случайными числами
        Random gen = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = gen.nextInt(10);
        }
        //вывод массива а
        System.out.println("Массив а");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        //Формирование массива B
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 5) {
                b[i] = 2 * a[i];

            } else {
                b[i] = a[i] / 2;
            }
        }
        System.out.println("Массив b");
        for (int i = 0; i < b.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        */

        //Array53. Даны два массива A и B одинакового размера N. Сформировать новый
        //массив C того же размера, каждый элемент которого равен максимальному
        //из элементов массивов A и B с тем же индексом.
        /*
        Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.print("Введите размер массива ");
            size = in.nextInt();

        } while (size <= 0);
        int[] a = new int[size];
        int[] b = new int[size];
        int[] c = new int[size];
        //Заполнение массивов a и b случайными числами
        Random gen = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = gen.nextInt(10);
            b[i] = gen.nextInt(10);
        }
        System.out.println();
        System.out.println("Массив b");
        for(int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        //Формирование массива c
        for(int i = 0; i < c.length; i++){
            if(a[i] >= b[i]) {
                c[i] = a[i];
            }
            else{
                c[i] =  b[i];
            }

        }
        //вывод массива c
        System.out.println("Массив c ");
        for(int i = 0; i < c.length; i++){
            System.out.print(c[i] +  " ");
        }
        System.out.println();
        */

        //Array54. Дан целочисленный массив A размера N.
        //Переписать в новый целочисленный массив B все четные числа из исходного массива (в том же
        //порядке) и вывести размер полученного массива B и его содержимое.

        /*
        Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.print("Введите размер массива ");
            size = in.nextInt();

        } while (size <= 0);
        int[] a = new int[size];
        //Заполнение массивов a и b случайными числами
        Random gen = new Random();
        int even_qty = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = gen.nextInt(15);
            if (a[i] % 2 == 0) even_qty++;
        }
        if (even_qty == 0) {
            System.out.println("В массиве а нет чётных чисел");
        } else {
            int[] b = new int[even_qty];
            int j = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] % 2 == 0) {
                    b[j] = a[i];
                    j++;
                }
            }
            System.out.println("Массив b");
            for (int i = 0; i < b.length; i++) {
                System.out.print(b[i] + " ");
            }
            System.out.println();
          */

        //Array55. Дан целочисленный массив A размера N (≤ 15). Переписать в новый
        //целочисленный массив B все элементы с нечетными порядковыми номерами
        // (1, 3, . . .) и вывести размер полученного массива B и его содержимое.
        //Условный оператор не использовать.
        /*
        Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.print("Введите размер массива ");
            size = in.nextInt();

        } while (size <= 0);
        int[] a = new int[size];
        int[] b = new int[size / 2];
        //Заполнение случайными числами массива a
        Random gen = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = gen.nextInt(20);
        }
        System.out.println();
        System.out.println("Массив a");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        for (int i = 0, j = 0; i < a.length; i += 2, j++) {
            b[j] = a[i];
            //Изменение счётчиков
        }
        System.out.println();
        System.out.println("Массив b");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
       */
        /*
        //Array68◦
        //. Дан массив размера N. Поменять местами его минимальный и максимальный элементы.
        Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.print("Введите размер массива ");
            size = in.nextInt();

        } while (size <= 0);
        int[] a = new int[size];
        //Заполнение массивов a и b случайными числами
        Random gen = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = gen.nextInt(20);
        }
        //Вывод массива a
        System.out.println("Исходный массив a");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        //Ищем маскимальный и минимальный элементы в массиве
        int min = a[0];
        int minIndex = 0;
        int max = a[0];
        int maxIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                minIndex = i;
            } else if (a[i] > max) {
                max = a[i];
                maxIndex = i;

            }
        }
        //Переставляем местами максимальный и минимальный
        a[minIndex] = max;
        a[maxIndex] = min;
        */


    }
}