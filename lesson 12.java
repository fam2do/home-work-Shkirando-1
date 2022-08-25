package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static void fillRandom(ArrayList<Integer> mas, int left, int right, int qty) {
        Random gen = new Random();
        for (int i = 0; i < qty; i++) {
            mas.add(gen.nextInt(right - left + 1) + left);
        }
    }

    static void print(ArrayList<Integer> mas) {
        for (int i = 0; i < mas.size(); i++) {
            System.out.print(mas.get(i) + " ");
        }
        System.out.println();
    }

    static int findPosMax(ArrayList<Integer> mas) {
        int posMax = -1;
        if (mas.size() == 0) return posMax;
        int Max = mas.get(0);
        for (int i = 0; i < mas.size(); i++) {
            if (mas.get(i) > Max) {
                Max = mas.get(i); // аналогия для массива mas[i]
                posMax = i;

            }
        }
        return posMax;
    }

    static int findPosMin(ArrayList<Integer> mas) {
        int posMin = -1;
        if (mas.size() == 0) return posMin;
        int min = mas.get(0);
        for (int i = 0; i < mas.size(); i++) {
            if (mas.get(i) < min) {
                min = mas.get(i); // аналогия для массива mas[i]
                posMin = i;

            }
        }
        return posMin;
    }

    static void swap(ArrayList<Integer> mas, int index1, int index2) {
        int temp = mas.get(index1); // temp = mas[index1];
        mas.set(index1, mas.get(index2));//mas[index1] =  mas[index2]
        mas.set(index2, temp);//mas[index2] = temp
    }

    static void initDeck(ArrayList<Integer> deck) {
        for (int k = 0; k < 4; k++) {
            for (int i = 1; i < 10; i++) {
                deck.add(i);
            }
            for (int i = 0; i < 4; i++) {
                deck.add(10);
            }
        }
    }

    static void shuffleDeck(ArrayList<Integer> deck) {
        Random gen = new Random();
        for (int k = 0; k < 3; k++) {
            for (int i = 0; i < deck.size(); i++) {
                int randomIndex = gen.nextInt(deck.size());
                swap(deck, i, randomIndex);
            }
        }
    }

    static int numbers(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
    }

   static int numbers2(ArrayList<Integer> numbers2) {
    int proiz = 1;
    for (int i = 1; i < numbers2.size(); i++) {
        proiz *= numbers2.get(i);
    }
    return proiz;
}

    static double sre (ArrayList<Integer> sre){
        /*int sum = 0;
        for ( int i = 0; i < sre.size(); i++) {
            sum+= sre.get(i);
        }*/
        return (double)numbers(sre)/sre.size();
    }


    public static void main(String[] args){


        ArrayList<Integer> arr = new ArrayList<Integer>();
        /*fillRandom(arr, -10, 10, 15);
        print(arr);
        //Найт и позицию минимального элемента
        System.out.println(findPosMin(arr));
        //Найти позицию максимального элемента
        System.out.println(findPosMax(arr));
        //Поменять позицию местами
        swap(arr,findPosMin(arr), findPosMax(arr));
        print(arr);*/



/*
        ArrayList<Integer> deck = new ArrayList<>();
        initDeck(deck);
        print(deck);
        shuffleDeck(deck);
        print(deck);
        */
        //Series1◦. Даны десять вещественных чисел. Найти их сумму
        fillRandom(arr, 5, 13, 5);
        print(arr);
    }
}