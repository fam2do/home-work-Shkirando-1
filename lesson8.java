import java.util.Scanner;
public class MainClass {

    public static void main(String[] args) {

        //19. Два двузначных числа, записанных одно за другим ,
        // образуют четырёхзначное число, которое делится на их произведение. Найти эти числа.
         /*
        for (int x = 10; x <= 99; x++) {
        int num = 100 * x * y;
            for (int y = 10; y <= 99; y++) {
                if (num % (x * y) == 0)
                    System.out.println(num);

        //21. Дано натуральное n. вычислить 1/(2 *2) + 1/(4*2)++ 1/(6*2)... + 1/(n*2)
        /*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += 1.0 / (i * i);
        }
        System.out.println(sum);
        */
        //28. Бизнессмен взял ссуду m тысяч рублей в банке под 20% годовых.
        // через сколько лет его долг превысит s тысяч рублей, если за это время он не будет отдавать долг.
         /*
        Scanner in = new Scanner(System.in);
        System.out.print("Введитен начальную сумму ссуды ");
        int nach_summa = in.nextInt();
        int proc = 3;
        System.out.print("Введите сумму гарантии ");
        int s = in.nextInt();
        double dolg = nach_summa;
        int k = 0;
        while (dolg <= s) {
            dolg = dolg * (1 + proc / 100.0);
            k++;
        }
        System.out.println("Через " + k + " лет");
          */

        //00. Начальная дистанция 1км. Каждую неделю дистанция растёт на 10%
        //через сколько недель дистанция превысит 10км.
        /*
        double dist = 1.0;
        int k = 0;
        while (dist < 10.0001) {
            dist *= 1.1;
            System.out.println(dist);
            k++;
        }
        System.out.println(k);
        */
        //30. С помощью оператора while напишите программу определения
        // суммы всех нечетных чисел в диапазоне от 1 до 99 включительно.
        /*
        int sum = 0;
        int i = 1;
        while (i <= 99) {
            sum += i;
            i += 2;
        }
        System.out.println(sum);
        */


        }

    }