package com.ki.level0.p120807;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(new Solution().solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
}


class Solution {
    public double solution(int[] numbers) {
        int a = 0;
        for (int i = 0;i< numbers.length;i++){
            a = a + numbers[i];
        }
        return (double) a / numbers.length;
    }
}