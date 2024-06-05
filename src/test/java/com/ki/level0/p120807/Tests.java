package com.ki.level0.p120807;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("배열의 평균값")
    void t1() {
        assertThat(new Solution().solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})).isEqualTo(5.5);
    }


}
