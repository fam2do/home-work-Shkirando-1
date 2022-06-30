package Lesson2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner in = new.Scanner(System.in);
        System.out.println("Введите целое число - кол-во сантиметров: ");
        int l = in.scanner.nextInt();
        System.out.println(l / 100 + " метров");*/
        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите число байтов: ");
        int bytes = in.nextInt();
        System.out.println(bytes / 1024 + " килобайтов");*/
        //Integer6◦
        //. Дано двузначное число. Вывести вначале его левую цифру (десятки), а затем — его правую цифру (единицы). Для нахождения десятко
        // использовать операцию деления нацело, для нахождения единиц — операцию взятия остатка от деления.
        /*Scanner in = new Scanner(System.in);
        System.out.print("Введит двухзначное число: ");
        int number = in.nextInt();
        System.out.println("Десятки " + number / 10);
        System.out.println("Единицы " + number % 10);*/
        //Integer7◦
        //. Дано двузначное число. Найти сумму и произведение его цифр
        //Integer8◦
        //. Дано двузначное число. Вывести число, полученное при перестановке цифр исходного числа
        /*Scanner in = new Scanner(System.in);
        System.out.print("Дано двухзначное число: ");
        int number = in.nextInt();
        int one = number / 10;
        int two = number % 10;
        System.out.println("Перевёрнутое число: " + (two * 10 + one));*/
        //Integer9◦
        //. Дано трехзначное число. Используя одну операцию деления нацело,
        //вывести первую цифру данного числа (сотни).
        /*Scanner in = new Scanner(System.in);
        System.out.print("Дано трёхзначное число: ");
        int number = in.nextInt();
        System.out.println("Сотни " + number / 100);*/
        //Integer10◦
        //. Дано трехзначное число. Вывести вначале его последнюю цифру
        //(единицы), а затем — его среднюю цифру (десятки)
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Введите трёхзначное число: ");
        int number = in.nextInt();
        System.out.println("Единицы: " + number / 10);
        int des = in.nextInt();
        System.out.println("Десятки: " + des);*/
        // Integer11◦
        //. Дано трехзначное число. Найти сумму и произведение его цифр.
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Введите трёхзначное число: ");
        int number = in.nextInt();
        int out = number % 10;
        int es = number / 100;
        int bln = (number/10)%10;
        System.out.println("Сумма чисел: " + (out + bln + es));
        System.out.println("Произведение чисел: " + (out * bln * es));*/
        //Integer12◦
        //. Дано трехзначное число. Вывести число, полученное при прочтении исходного числа справа налево
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Введите трёхзначное число: ");
        int number = in.nextInt();
        int out = number % 10;
        int es = number / 100;
        int bln = (number/10)%10;
        int res = 100 * out + 10 * bln + es;
        System.out.println("В обратном порядке " + res);*/
        //Integer13◦
        //. Дано трехзначное число. В нем зачеркнули первую слева цифру и
        //приписали ее справа. Вывести полученное число.
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Введите трёхзначное число: ");
        int number = in.nextInt();
        int sotni = number / 100;
        int ostatok = number % 100;
        int res = ostatok * 10 + sotni;
        System.out.println("Убрали сотни, припиcали сотни слева " + res);*/












    }
}

