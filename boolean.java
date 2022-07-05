package Lesson2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 //Boolean1◦  Дано целое число A. Проверить истинность высказывания: «Число A является положительным».
        /*
        Scanner on = new Scanner(System.in);
        System.out.println("Введите число:");
        int pl = on.nextInt();
        boolean res = pl > 0;
        System.out.println(res);
         */
        //Boolean2◦ Дано целое число A. Проверить истинность высказывания: «Число A является нечетным»
        /*
        Scanner on = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int ol = on.nextInt();
        int a1 = ol%2;
        boolean res = a1!=0;
        System.out.println(res);
         */
        //Boolean3◦ Дано целое число A. Проверить истинность высказывания: «Число A является четным».
        /*
        Scanner ou = new Scanner(System.in);
        int a1 = ou.nextInt();
        boolean res = a1 % 2 == 0;
        System.out.println(res);
         */
        //Boolean4◦ Даны два целых числа: A, B. Проверить истинность высказывания: «Справедливы неравенства A > 2 и B ≤ 3».
        /*
        Scanner q = new Scanner(System.in);
        System.out.println("Введите число A:");
        int a = q.nextInt();
        System.out.println("Введите число B:");
        int b = q.nextInt();
        boolean res = a > 2 && b <=3;
        System.out.println(res);
        */
        //Boolean5◦ Даны два целых числа: A, B. Проверить истинность высказывания:«Справедливы неравенства A ≥ 0 или B < −2».
        /*
        Scanner q = new Scanner(System.in);
        System.out.println("Введите число A:");
        int a = q.nextInt();
        System.out.println("Введите число B:");
        int b = q.nextInt();
        boolean res = a>=0 && b < -2;
        System.out.println(res);
         */
        //Boolean6◦  Даны три целых числа: A, B, C. Проверить истинность высказывания: «Справедливо двойное неравенство A < B < C».
        /*
        Scanner q = new Scanner(System.in);
        System.out.println("Введите число A:");
        int a = q.nextInt();
        System.out.println("Введите число B:");
        int b = q.nextInt();
        System.out.println("Введите число C:");
        int c = q.nextInt();
        boolean res = a < b && b < c;
        System.out.println(res);
        */
        //Boolean7◦ Даны три целых числа: A, B, C. Проверить истинность высказывания: «Число B находится между числами A и C»
        /*
        Scanner on = new Scanner(System.in);
        int a = on.nextInt();
        int b = on.nextInt();
        int c = on.nextInt();
        boolean res = (a < b && b < c) && (c>b && b>a);
        System.out.println(res);
         */
        //Boolean8◦ Даны два целых числа: A, B. Проверить истинность высказывания: «Каждое из чисел A и B нечетное».
        /*
        Scanner on = new Scanner(System.in);
        int a = on.nextInt();
        int b = on.nextInt();
        boolean res = (a % 2 != 0) && (b % 2 != 0 );
        System.out.println(res);*/
        //Boolean9◦
        //. Даны два целых числа: A, B. Проверить истинность высказывания: «Хотя бы одно из чисел A и B нечетное».
        /*
        Scanner on = new Scanner(System.in);
        int a = on.nextInt();
        int b = on.nextInt();
        boolean res = (a % 2 != 0) || (b % 2 != 0 );
        System.out.println(res);
        */
        //Boolean10◦ Даны два целых числа: A, B. Проверить истинность высказывания: «Ровно одно из чисел A и B нечетное».
        /*
        Scanner on = new Scanner(System.in);
        int a = on.nextInt();
        int b = on.nextInt();
        boolean res = (a % 2 != 0) || (b % 2 == 0 ) || (a % 2 == 0) || (b % 2 != 0 );
        System.out.println(res);
        */
        // Boolean11◦  Даны два целых числа: A, B. Проверить истинность высказывания: «Числа A и B имеют одинаковую четность».
        /*
        Scanner on = new Scanner(System.in);
        int a = on.nextInt();
        int b = on.nextInt();
        boolean res = (a % 2 != 0) && (b % 2 !=0 ) || (a % 2 == 0) || (b % 2== 0 );
        System.out.println(res);
        */
        // +++
        /*Scanner on = new Scanner(System.in);
        int a = on.nextInt();
        int b = on.nextInt();
        boolean res = (a%2)==(b%2);
        System.out.println(res);
         */

        //Boolean12 Даны три целых числа: A, B, C. Проверить истинность высказывания: «Каждое из чисел A, B, C положительное»
        /*
        Scanner on = new Scanner(System.in);
        int a = on.nextInt();
        int b = on.nextInt();
        int c = on.nextInt();
        boolean res = a >= 0 && b >= 0 && c >0;
        System.out.println(res);
        */
         // Boolean13◦  Даны три целых числа: A, B, C. Проверить истинность высказывания: «Хотя бы одно из чисел A, B, C положительное».
        /*
        Scanner on = new Scanner(System.in);
        int a = on.nextInt();
        int b = on.nextInt();
        int c = on.nextInt();
        boolean res = a > 0 || b >0 || c>0;
        System.out.println(res);
        */
        //Boolean14◦  Даны три целых числа: A, B, C. Проверить истинность высказывания: «Ровно одно из чисел A, B, C положительное»
        /*
        Scanner on = new Scanner(System.in);
        int a = on.nextInt();
        int b = on.nextInt();
        int c = on.nextInt();
        //boolean res = (a > 0 && b < 0 && c < 0) || (a < 0 && b > 0 && c < 0) || (a < 0 && b < 0 && c > 0);
        boolean res = a > 0 ^ b > 0 ^ c > 0;
        System.out.println(res);
        */
        // Boolean15 Даны три целых числа: A, B, C. Проверить истинность высказывания: «Ровно два из чисел A, B, C являются положительными».
        /*
        Scanner on = new Scanner(System.in);
        int a = on.nextInt();
        int b = on.nextInt();
        int c = on.nextInt();
        boolean res = (a > 0 && b > 0 && c < 0) || (a < 0 && b > 0 && c > 0) || (a > 0 && b < 0 && c > 0);
        System.out.println(res);
         */
        //Boolean16◦ Дано целое положительное число. Проверить истинность высказывания: «Данное число является четным двузначным».
        /*
        Scanner on = new Scanner(System.in);
        int a = on.nextInt();
        //четное двузначначное
        boolean res = (a % 2 == 0) &&  ( a >= 10 && a <= 100);
        System.out.println(res);
        */
        //Boolean18◦ Проверить истинность высказывания: «Среди трех данных целых /чисел есть хотя бы одна пара совпадающих»
        /*
        Scanner on = new Scanner(System.in);
        int a = on.nextInt();
        int b = on.nextInt();
        int c = on.nextInt();
        boolean res = (a == b) || (b==c) || (a==c);
        System.out.println(res);
        */
        //Boolean19◦ Проверить истинность высказывания: «Среди трех данных целых чисел есть хотя бы одна пара взаимно противоположных».
        /*
        Scanner on = new Scanner(System.in);
        int a = on.nextInt();
        int b = on.nextInt();
        int c = on.nextInt();
        boolean res = a == -b && a == -c && b == -c;
        System.out.println(res);
        */
        //Boolean20◦
        //. Дано трехзначное число. Проверить истинность высказывания: «Все цифры данного числа различны».
        /*
        Scanner on = new Scanner(System.in);
        int a = on.nextInt();
        int sot = a / 100;
        int des = (a / 10) % 10; // (a % 100) / 10;
        int ed = a % 10;
        boolean res = (sot != des) && (des != ed) && (sot != ed);
        System.out.println(res);
        */
        //Boolean21◦ Дано трехзначное число. Проверить истинность высказывания: «Цифры данного числа образуют возрастающую последовательность».

    }
}
