package com.leo.algorithm;

/**
 * https://leetcode-cn.com/problems/lemonade-change/
 */
public class LemonadeChange {

    public static void main(String[] args) {

    }

    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;

        for (int bill : bills) {
            switch (bill) {
                case 5:
                    five++;
                    break;
                case 10:
                    if (five == 0) {
                        return false;
                    }
                    five--;
                    ten++;
                    break;
                case 20:
                    if ((ten >= 1 && five >= 1)) {
                        ten--;
                        five--;
                    } else if (five >= 3) {
                        five -= 3;
                    } else {
                        return false;
                    }
                    break;
                default:
                    break;
            }
        }
        return true;
    }
}
