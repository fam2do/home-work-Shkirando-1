package homework1;
// Шкирандо Владислав, ИСПРАВЛЕННОЕ
import static java.lang.Math.PI;
import java.util.Scanner;

public class Homework1 {
    private static Object x1;

    public static void main(String[] args) {
        //Begin13 Даны два круга с общим центром и радиусами R1 и R2 (R1 > R2). Найти площади этих кругов S1 и S2, а также площадь S3 кольца, внешний радиус которого равен R1, а внутренний радиус равен R2:
        //S1 = ?·(R1)2, S2 = ?·(R2)2, S3 = S1 ? S2
        /*
        int R1 = 4;
        int R2 = 18;
        //Ищем площадь кругов S1 и S2, а также площадь S3 кольца;
        final double pi = 3.14;
        double S1 = pi * (R1 * R1);
        double S2 = pi * (R2 * R2);
        double S3 =  S1 - S2;
        System.out.println("Площадь круга S1: " + S1 + "    " + "Площадь круга S2; "  + S2 + " " + "Площадь кольца S3:" + S3);*/
        //Begin16 Найти расстояние между двумя точками с заданными координатами x1 и x2 на числовой оси: |x2 ? x1|
        /*
        int x1 = -18;
        int x2 = 13;
        int a = Math.abs(x1);
        int b = Math.abs(x2);
        double s = x2 - x1;
        System.out.println(s);
        */
        //Begin19 Даны координаты двух противоположных вершин прямоугольника: (x1, y1), (x2, y2). Стороны прямоугольника параллельны осям координат.
        //Найти периметр и площадь данного прямоугольника.
        /*
        int x1 = 3;
        int y1 = 11;
        int x2 = 7;
        int y2 = 16;
        final double pi = 3.14;
        int mod = Math.abs(x1);
        int mod2 = Math.abs(y1);
        int mod3 = Math.abs(x2);
        int mod4 = Math.abs(y2);
        int a1 = y1 - y2;
        int a2 = x1- x2;
        int S = a1 * a2;
        double P = 2 * (a1 + a2);
        System.out.println("Периметр прямоугольника: " + PI);
        System.out.println("Площадь прямоугольника: " + S);
        */
        //Begin20 Найти расстояние между двумя точками с заданными координатами(x1, y1) и (x2, y2) на плоскости. Расстояние вычисляется по формуле q(x2 ? x1)2 + (y2 ? y1)2;
        /*
        int x1 = 16;
        int y1 = 16;
        int x2 = 24;
        int y2 = 41;
        double g_avg = Math.sqrt(x2-x1)*2 + (y2-y1)*2;
        System.out.println("Расстояние между двумя точками: " + g_avg);*/
        //Begin21 Даны координаты трех вершин треугольника: (x1, y1), (x2, y2), (x3, y3)Найти его периметр и площадь, используя формулу для расстояния между двумя точками на плоскости (см. задание Begin20). Для нахождения
        //площади треугольника со сторонами a, b, c использовать формулу Герона S =?p·(p ? a)·(p ? b)·(p ? c),где p = (a + b + c)/2 — полупериметр
        /*
        Scanner yn = new Scanner(System.in);
        System.out.println("Введите значение x1:");
        int x1 = yn.nextInt();
        System.out.println("Введите значение y1;");
        int y1 = yn.nextInt();
        System.out.println("Введите значение x2;");
        int x2 = yn.nextInt();
        System.out.println("Введите значение y2;");
        int y2 = yn.nextInt();
        System.out.println("Введите значение x3;");
        int x3 = yn.nextInt();
        System.out.println("Введите значение y3;");
        int y3 = yn.nextInt();
        double g_avg = Math.sqrt(x2-x1)*2 + (y2-y1)*2;
        double g_avg1 = Math.sqrt(x3-x2)*2 + (y3-y2)*2;
        double g_avg2 = Math.sqrt(x3-x1)*2 + (y3-y2)*2;
        double P = (g_avg + g_avg1 + g_avg2)/2;
        double a = g_avg; double b = g_avg1; double c=g_avg2;
        System.out.println("Полупериметр равен:" + P);
        double g_avg4 = Math.sqrt(P *(P - a) *( P - b)*( P - c));
        System.out.println("Площадь треугольника равно:" + g_avg4);
        */
        
        
        
        
              
        
        
        
        
        
         
        
        
        
        
        
              
        
        
       
        
        
        

        
        
        
        
        
                
        
        
                
        
        
        
        
        
        
    }
    
}