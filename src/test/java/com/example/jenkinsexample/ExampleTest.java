package com.example.jenkinsexample;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ExampleTest {
    @Test
    void failTest() {
        assertThat(1==0).isTrue();
    }
}
