package com.ki.level0.p120807;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("2,3 => -1")
    void t1() {
        assertThat(new Solution().solution(999)).isEqualTo(201);
    }


}
