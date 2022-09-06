package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static void createDeck(ArrayList<Integer> fdeck) {
        for (int k = 0; k < 4; k++) {
            for (int i = 1; i <= 9; i++) {
                fdeck.add(i);
            }
            for (int i = 0; i < 4; i++) {
                fdeck.add(10);
            }
        }
    }

    static void shuffleDeck(ArrayList<Integer> fdeck) {
        Random gen = new Random();
        for (int i = 0; i < fdeck.size() - 1; i++) {
            int randomIndex = gen.nextInt(fdeck.size() - (i + 1)) + (i + 1);
            int temp = fdeck.get(i);
            fdeck.set(i, fdeck.get(randomIndex));
            fdeck.set(randomIndex, temp);

        }
    }

    static void playerTurn(ArrayList<Integer> fdeck, ArrayList<Integer> fplayer) {
        // Игрок по желанию берёт карты из колоды
        Scanner in = new Scanner(System.in);
        int answer;
        do {
            //игрок берёт одну карту из колоды себе
            playerTakeOneCard(fdeck, fplayer);
            //подсчитать сколько у игрока очков и выдать на экран
            int playerScore = calcScore(fplayer);
            System.out.println("У вас " + playerScore + " очков");
            if (playerScore >= 21) break;
            else {
                System.out.println("Хотите взять ещё одну карту? 1-да, любая другая цифра - нет");
                answer = in.nextInt();
            }
        }
            while (answer == 1) ;

    }
        static void dealearTurn(ArrayList<Integer> fdeck, ArrayList<Integer> fplayer) {

        }
        static void playerTakeOneCard (ArrayList < Integer > fdeck, ArrayList < Integer > fplayer){
            //взять карту из колоды
            int card = fdeck.get(fdeck.size() - 1);
            //удалить взятую карту из колоды
            fdeck.remove(fdeck.size() - 1);
            //добавить эту карту игроку
            fplayer.add(card);
        }
        static int calcScore (ArrayList < Integer > fplayer) {
            int sum = 0;
            for (int i = 0; i < fplayer.size(); i++) {
                sum += fplayer.get(i);
            }
            return sum;
        }
    public static void main(String[] args) {
        //создать новую колоду
        final int deckSize = 52;
        ArrayList<Integer> deck = new ArrayList<>();
        createDeck(deck);
        //перетасовать колоду
        shuffleDeck(deck);
        //создать игрока
        ArrayList<Integer>player = new ArrayList<>();
        //создать диллера
        ArrayList<Integer>dealer = new ArrayList<>();
        //действия игрока
        playerTurn(deck, player);
        // Проверка результатов игры игрока
        //1. Игрок набрал, 21 игра закачивается, игрок выйграл
            if(calcScore(player) == 21) {
                System.out.println("Игрок выйграл. Конец игры");
                return;
            }
        //2. Игрок набрал больше 21, игра заканчиваетя, игрок проиграл
        //3. Меньше 21 очка, игрока сказал "хватит"
        //==  действия диллера
        //1. Диллер набрал, 21 ( у игрока заведомо  < 21 ) игра закачивается, диллер выйграл
        //2. Диллер набрал больше 21, игра заканчиваетя, диллер проиграл
        //3. Диллер набрал меньше 21 очка

        //3.1 У игрока больше очков, чем у диллера - выйграл игрок
        //3.2 У диллера больше очков, чем у игрока - выйграл диллер
        //3.3 У обоих поровну очков - ничья



    }
}