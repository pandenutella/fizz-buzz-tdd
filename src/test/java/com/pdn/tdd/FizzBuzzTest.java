package com.pdn.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {

    final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void when_getFizzBuzzValue_should_return_number_as_string_given_number() {
        String fizzBuzzValue = fizzBuzz.getFizzBuzzValue(1);

        assertThat(fizzBuzzValue).isEqualTo("1");
    }
}