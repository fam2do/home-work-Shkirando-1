import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Введите цену за 1 кг: ");
        double price = in.nextDouble();
        for (double weight = 1.2; weight < 2.001; weight = + 0.2) {
            System.out.println(weight + " кг стоит " + weight*price);
         */
        //For7. Даны два целых числа A и B (A < B). Найти сумму всех целых чисел
        //от A до B включительно.
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Введите два целых числа: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum = sum + 1;
        }
            System.out.println("Сумма = " + sum);
         */
        //For8. Даны два целых числа A и B (A < B). Найти произведение всех целых
        //чисел от A до B включительно
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Введите два целых числа: ");
        int a = in.nextInt();
        int b = in.nextInt();
         */
        //For9. Даны два целых числа A и B (A < B). Найти сумму квадратов всех целых чисел от A до B включительно.
        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите два целых числа: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum = sum + i * i;
        }
        System.out.println("Сумма квадратов: ");

        */
        //For11. Дано целое число N (> 0). Найти сумму
        //N
        //2 + (N + 1)2 + (N + 2)2 + . . . + (2·N)
        //2
        /*
        Scanner in = new Scanner(System.in);
        System.out.print("Введите два целых числа: ");
        int n = in.nextInt();
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum = sum + (n + i) * (n + i);
            */
        //Series1◦
        //. Даны десять вещественных чисел. Найти их сумму
        /*
        double sum = 0.0;
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            double x = in.nextInt();
            sum = sum + x;
        }
        System.out.println("Сумма = " + sum);
      */
        /*
        double sum =1.0;
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            double x = in.nextInt();
            sum = sum *x;
        }
        System.out.println("Сумма = " + sum);

         */


        //Series3. Даны десять вещественных чисел. Найти их среднее арифметическое.

        double sum =1.0;
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            double x = in.nextInt();
            sum = sum % x / (10);
        }
        System.out.println("Сумма = " + sum);

    }
}

