# Fizz Buzz TDD

Reference: https://kata-log.rocks/fizz-buzz-kata

### Requirements:
- [x] Write a program that prints one line for each number from 1 to 100
- [x] Usually just print the number itself.
- [ ] For multiples of three print Fizz instead of the number
- [ ] For the multiples of five print Buzz instead of the number
- [ ] For numbers which are multiples of both three and five print FizzBuzz instead of the number

### Rules:
Implement the requirements above while following the Test-Driven Development (TDD) approach.

#### Steps:
1. Write a failing test for a requirement that is not implemented yet.
2. Write the necessary code changes to make the test pass.
3. Refactor the codes and re-run the tests. The tests should still pass.
4. Repeat

TDD Reference: http://agiledata.org/essays/tdd.html

### Writing Tests:
```java
@Test
void when_getFizzBuzzValue_should_return_number_as_string_given_number() {
    String fizzBuzzValue = fizzBuzz.getFizzBuzzValue(1);

    assertThat(fizzBuzzValue).isEqualTo("1");
}
```
To write a test, use the `@Test` annotation from `org.junit.jupiter.api` then create a `void` method with the name:
```
when_{method}_should_{behavior}_given_{scenario}
```

We usually use `when-should-given` to describe tests, but we can write them as `should-when-given` or in any other order depending on your team's coding standards. We can also use a different format, but for this project, let's stick with `when-should-given`. 
