/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author famidos
 */
import java.util.Scanner;
public class homework5 {
    public static void main(String[] args) {
    /*
        //Series4. Дано целое число N и набор из N вещественных чисел. Вывести
        //сумму и произведение чисел из данного набора.
        double sum = 0;
        double pr = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число N ");
        int n = in.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.print("Введите вещественное число ");
            double x = in.nextDouble();
            sum = sum + x;
            pr = pr * x;
        }
        System.out.println("Сумма = " + sum);
        System.out.println("Произведение = " + pr);
                 */

       /* 
      //Series5. Дано целое число N и набор из N положительных вещественных
        //чисел. Вывести в том же порядке целые части всех чисел из данного
        //набора (как вещественные числа с нулевой дробной частью), а также
        //сумму всех целых частей.
        double sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число N ");
        int n = in.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.print("Введите вещественное число ");
            double x = in.nextDouble();
            x = Math.floor(x);
            System.out.println("Целая часть  " + x);
            sum = sum + x;
        }
        System.out.println("Сумма = " + sum);
        */
        /*
       //Series6. Дано целое число N и набор из N положительных вещественных
        //чисел. Вывести в том же порядке дробные части всех чисел из данного набора
        // (как вещественные числа с нулевой целой частью), а также произведение всех дробных частей.
        double pr = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число N ");
        int n = in.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.print("Введите вещественное число ");
            double x = in.nextDouble();
            x =x-Math.floor(x) ;
            System.out.println("Дробная часть  " +  x);
            pr = pr *  x;
        }
        System.out.println("Произведение = " + pr);
                 */
    }
}
    
