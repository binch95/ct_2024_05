package com.ki.level0.p120807;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(new Solution().solution(999));
    }
}


class Solution {
    public int solution(int hp) {
        int a = 0;
        int s = 5;
        int answer = 0;
        for (int i = 1; i <= 3; i++) {
            a = hp / s;
            hp = hp - a * s;
            s = s - 2;
            answer += a;
        }
        return answer;
    }
}