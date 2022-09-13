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
public class HomeWork7 {
    public static void main(String[] args) {
       /*//Proc17. Описать функцию RootsCount(A, B, C) целого типа, определяющую
        //количество корней квадратного уравнения A·x^2 + B·x + C = 0 (A, B, C —
        //вещественные параметры, A 6= 0). С ее помощью найти количество корней
        //для каждого из трех квадратных уравнений с данными коэффициентами.
        //Количество корней определять по значению дискриминанта:
        //D = B^2 ? 4·A·C.
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++ ) {
            System.out.print("Введите значение А ");
            double a = in.nextDouble();
            System.out.print("Введите значение B ");
            double b = in.nextDouble();
            System.out.print("Введите значение C ");
            double c = in.nextDouble();
            System.out.println("Количество корней в квадратном уравнении = " + rootsCount(a,b,c));
        }
                 */
       /* //Proc18. Описать функцию CircleS(R) вещественного типа, находящую площадь круга радиуса R (R — вещественное). С помощью этой функции
        //найти площади трех кругов с данными радиусами. Площадь круга радиуса R вычисляется по формуле S = ?·R^2
        //. В качестве значения ? использовать 3.14.
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++  ) {
            System.out.print("ВВЕДИТЕ РАДИУС КРУГА R ");
            double r = in.nextDouble();
            System.out.println("Площадь круга с радиусом " + r + " равна " + circleS(r));
        }
                */
        /*//Proc19. Описать функцию RingS(R1, R2) вещественного типа, находящую площадь кольца, заключенного между двумя
        // окружностями с общим центром и радиусами R1 и R2 (R1 и R2 — вещественные, R1 > R2). С ее помощью найти
        // площади трех колец, для которых даны внешние и внутренние радиусы. Воспользоваться формулой площади
        // круга радиуса R: S = ?·R^2. В качестве значения ? использовать 3.14.
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("ВВЕДИТЕ РАДИУС КРУГА R1 ");
            double r1 = in.nextDouble();
            System.out.print("ВВЕДИТЕ РАДИУС КРУГА R2 ");
            double r2 = in.nextDouble();
            System.out.println("Площадь кольца с равна " + ringS(r1, r2));
        }
        */
    }
}
