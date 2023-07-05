package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserValidatorTest {
    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"j", "aB","1", "23", })
    public void validateUsername01(String username) {
        boolean result = userValidator.validateUsername(username);
        assertFalse(result);
    }
    @ParameterizedTest
    @ValueSource(strings = {"user name", "user@name","user_name-123", "user!name", "user_name" })
    public void validateUsername02(String username) {
        boolean result = userValidator.validateUsername(username);
        assertTrue(result);
}
@ParameterizedTest
    @ValueSource(strings = {"przykladowy@przyklad.pl", "przy.klad@przyk.com.pl", "przy_klad123@mail.pl"})
    public void validateEmail01 (String email){
        boolean result = userValidator.validateEmail(email);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {" ", "przyklad", "przyklad@", "przyklad@przykladowy", "przylad@.com", "przy@klad@przy.com"})
    public void validateEmail02 (String email){
        boolean result = userValidator.validateEmail(email);
        assertFalse(result);
    }
}