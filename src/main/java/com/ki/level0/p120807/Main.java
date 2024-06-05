package com.ki.level0.p120807;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] aa =  new Solution().solution(1, 5, 4, 5);

        aa[0] = aa[0];
        aa[0] = aa[1];
        System.out.printf("%d %d", aa[0], aa[1]);
    }
}


class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int a = 0;
        int w = 0;
        int e = 0;

        w = numer1 * denom2 + denom1 * numer2;
        e = denom1 * denom2;

        if (e >= w) {
            a = e;
        }
        if (w >= e) {
            a = w;
        }
        for (int i = a; i >= 2; --i) {
            if (w % i == 0) {
                if (e % i == 0) {
                    e = e / i;
                    w = w / i;
                    break;
                }
            }
        }
        answer[0] = w;
        answer[1] = e;
        return answer;
    }
}