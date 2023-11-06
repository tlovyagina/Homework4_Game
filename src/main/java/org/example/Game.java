package org.example;

import java.util.List;

public class Game {
    public int playGame(List<Integer> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1)
                break;
            if (list.get(i).equals(list.get(i + 1)) || list.get(i) + list.get(i + 1) == 9) {
                list.remove(i + 1);
                list.remove(i);
                count++;
                i = -1;
            }
        }
        return count;
    }
}