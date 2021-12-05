package ru.job4j.array;

/**
 * Вам даны очки игроков.
 * Игроки разделись таким образом, что под четными индексами
 * находятся очки первой команды, под нечетными второй.
 * Ваша задача определить, кто выиграл. Выигрывает та команда,
 * которая набрала наибольшее число очков. Если выиграла первая команда,
 * то нужно вернуть 1, если вторая, то 2, если ничья, то 0.
 */
public class EvenVsOdd {

    public static int whoWin(int[] players) {
        int evenIdx = 0;
        int oddIdx = 0;
        for (int i = 0; i < players.length; i++) {
            if (i % 2 == 0) {
                evenIdx += players[i];
            } else {
                oddIdx += players[i];
            }
        }
        if (evenIdx > oddIdx) {
            return 1;
        } else if (oddIdx > evenIdx) {
            return 2;
        }
        return 0;
    }
}
