package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Proc1. Описать функцию PowerA3(A, B), вычисляющую третью степень числа A и возвращающую ее в .
        // С помощью этой функции найти третьи степени пяти данных чисел.
        /*
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print(" Введите целое число ");
            int x = in.nextInt();
            System.out.println(x + " ^ 3 = " + powerA3(x));
        }
    }
    static int powerA3(int a){
        return a*a*a;

       */
        //Proc3. Описать 2 фунции aMean(X, Y), вычисляющую
        //среднее арифметическое AMean = (X+Y)/2 и gMean(X, Y) среднее геометрическое
        //GMean =√X·Y двух положительных чисел X и Y (X и Y — входные,
        //AMean и GMean — выходные параметры вещественного типа). С помощью
        //этих функций найти среднее арифметическое и среднее геометрическое
        //для пар (A, B), (A, C), (A, D), если даны A, B, C, D.
        /*
        int a = 5;
        for(int i = 0; i < 3; i ++){
            int z = (int)(Math.random()*10);
            System.out.println(a + " " + z + " amean = " + aMean(a,z));
            System.out.println(a + " " + z + " gmean = " + aMean(a,z));
        }
    }
    static int powerA3(int a){
        return a*a*a;
    }
    static double aMean(int x, int y) {
        return (x + y) / 2.0;
    }
    static double gMean(int x, int y){
        return Math.sqrt(x*y);

        */
        //Proc4◦
        //. Описать 2 функции процедупу TrianglePS(a) вычисляющую по стороне a
        //равностороннего треугольника его периметр P = 3·a и площадь
        //S = (a^2·√3)/4
        //(параметры являются вещественными). С помощью этой процедуры найти периметры и площади
        //трех равносторонних треугольников с данными сторонами.
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сторону равносторннего треугольника ");
        double a = in.nextDouble();
        for(int i = 0; i < 3; i ++) {
            System.out.println("\n Периметр треугольника со стороной " + a + " = " + perimetr(a));
            System.out.println("Площадь треугольника со стороной " + a + " = " + ploschad(a));
        }
    }
    static int powerA3(int a){
        return a*a*a;

    }

    static double aMean(int x, int y) {
        return (x + y) / 2.0;
    }
    static double gMean(int x, int y) {
        return Math.sqrt(x * y);
    }
    static double perimetr(double a) {
        return 3 * a;
    }
    static double ploschad (double a){
        return (a * a * Math.sqrt(3) / 4);
        */

        //Proc5. Описать функцию RectPS(x1, y1, x2, y2, P, S), вычисляющую периметр P
        //прямоугольника со сторонами, параллельными осям координат, по координатам (x1, y1), (x2, y2) его противоположных вершин
        //С помощью этой функции найти периметры трех прямоугольников с данными противоположными вершинами

         /*
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите вершину x1: ");
            int x1 = in.nextInt();
            System.out.print("Введите вершину x2: ");
            int x2 = in.nextInt();
            System.out.print("Введите вершину y1: ");
            int y1 = in.nextInt();
            System.out.print("Введите вершину y2: ");
            int y2 = in.nextInt();
            System.out.println("\n Периметр прямоугольника равен: " + rectP(x1, y1, x2, y2));

        }
    }

    static int rectP(int x1, int y1, int x2, int y2) {
        int a = Math.abs(x2 - x1);
        int b = Math.abs(y2 - y1);
        return 2 * (a + b);

          */

        //Вычислить площадь треугольника по формуле Герона
        //S = p*(p-a)*(p-b)*(p-c)
        //p - полупериметр, a,b,c
        //Проверить с помощью функции, что по сторонам a,b,c можно построить треугольник
        //Вычислить площадь 3-х треугольников

        /*
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            System.out.println("Введите стороны треугольника");
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            if (isTriangle(a, b,c)) {
                System.out.println("Площадь треугольника " + s(a, b, c));
            }
            else{
                System.out.println("Такого треугольника не существует");
            }
        }
    }
      static boolean isTriangle(int a, int b, int c){
        return a + b > c && a + c > b  && b + c > a;

      }
      static double p(int a, int b, int c) {
          return (a + b + c) / 2.0;
      }
      static double s(int a, int b, int c){
        double p = p(a, b, c);
        return Math.abs(p*(p-a)*(p-b)*(p-c));

         */

        ////Proc6. Описать функцию DigitCount(K), находящую количество
        ////цифр целого положительного числа K. С помощью этой функции
        ////найти количество цифр для каждого из пяти целых чисел.

        /*
        Random gen = new Random();
         for(int i = 0; i < 5; i++){
             int x = gen.nextInt(1_000);
             System.out.println("В числе " + x + " " + digitCount(x) + " цифр");
             System.out.println("В числе " + x + " " + summ(x) + " сумма цифр");
        }
      }
      //ф-ция подсчитывает кол-во цифр в числе
        static int digitCount(int a) {
            int k = 0;
            while (a != 0) {
                a /= 10;
                k++;
            }
            return k;
        }
        //ф-ция подсчитывает сумму цифр в числе
            static int summ(int a){
            int summ = 0;
            while(a != 0) {
                int c = a % 10;
                a /= 10;
                summ +=c;
            }
            return summ;

         */
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int k = in.nextInt();
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите цифру :");
            int d = in.nextInt();
            System.out.println(addRightDigit(d, k));
        }
    }

    static int addRIghtDigit(int d, int k) {
        return k * 10 + d;
        */
    }
        static int sign(int k){
            int sign;
            if (k < 0) sign = -1
            else if (k == 0) sign = 0;
            else if (k > 0) sign = 1 ;
            return sign;


        }

    }
