package com.company;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        /*String str1 = "Java";
      String str = "I like Java!!!";
        1.    Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
          System.out.println(str.charAt(str.length()-1));
        2.Распечатать последний символ строки. Используем метод String.charAt().
        3Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
          System.out.println(str.endsWith("!!!"));
        4.Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
          System.out.println(str.startsWith("!!!"));
        5.Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        System.out.println(str.contains("Java"));
        6.Найти позицию подстроки “Java” в строке “I like Java!!!”.
        System.out.println(str.indexOf("Java"));
        7.Заменить все символы “а” на “о”.
        System.out.println(str.replace('a', 'o'));
        8.Преобразуйте строку к верхнему регистру.
        System.out.println(str.toLowerCase(Locale.ENGLISH));
        9.Преобразуйте строку к нижнему регистру.
        System.out.println(str.toUpperCase(Locale.ENGLISH));
        10.Вырезать строку Java c помощью метода String.substring().

        int startIndex, endIndex;
        System.out.println(str.substring(str.indexOf("I like"), str.indexOf("I like") + "I like".length()));
        */
         //Дано два числа, например 3 и 56, необходимо составить следующие строки:
        //3 + 56 = 59
        //3 – 56 = -53
        //3 * 56 = 168.
        //Используем метод StringBuilder.append().
        //Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().
        //Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
        //Смотрите решение задачи в видео.
         Integer x,y;
         Scanner in = new Scanner(System.in);
         BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
         /*String str = buf.readLine();*/
         /*x = Integer.parseInt(str);
         str = buf.readLine();
         y = Integer.parseInt(str);
         Integer res = x + y;
         StringBuilder sb = new StringBuilder(x.toString());
         sb.append(" + ");
         sb.append(y.toString());
         sb.append(" = ");
         sb.append(res);
         System.out.println(sb);*/

        /* String str1 = buf.readLine();
         x = Integer.parseInt(str1);
         str1 = buf.readLine();
         y = Integer.parseInt(str1);
         Integer res1 = x + y;
         StringBuilder sb1 = new StringBuilder(x.toString());
         sb1.append(" + ");
         sb1.append(y.toString());
         sb1.append(" = ");
         sb1.append(res1);
         sb1.deleteCharAt(6);
         System.out.println(sb1.insert(5, " Равно"));
*/

/*
         String str2 = buf.readLine();
         x = Integer.parseInt(str2);
         str2 = buf.readLine();
         y = Integer.parseInt(str2);
         Integer res2 = x + y;
         StringBuilder sb2 = new StringBuilder(x.toString());
         sb2.append(" + ");
         sb2.append(y.toString());
         sb2.append(" = ");
         sb2.append(res2);
         System.out.println(sb2.replace(6, 7,"Равно"));
         */



        //"Object-oriented programming is a programming language model organized around objects rather than
         // "actions" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla."

         }

}





