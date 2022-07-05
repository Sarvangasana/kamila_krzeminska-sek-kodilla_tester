package com.kodilla.parametrized_tests.homework;

import com.kodilla.parametrized_tests.UserValidator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    //validateUsername()
    @ParameterizedTest
    @ValueSource(strings = {"Oskar", "Oskar-Sek", "Oskar.Sek", "Oskar1sek", "1OskarS", "_Oskar-"})
    public void shouldValidateUsername(String text) {
        assertTrue(userValidator.validateUsername(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Oskar+", "+Oskar-_", "/", "oskarSęk"})
    public void shouldNotValidateUsernameIfTextContainsCharsNotSpecifiedInRegex(String text) {
        assertFalse(userValidator.validateUsername(text));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldNotValidateUsernameIfTextIsNullOrEmpty(String text) {
        assertFalse(userValidator.validateUsername(text));
    }

    //validateEmail()
    @ParameterizedTest
    @ValueSource(strings = {"krzeminska.kamila@gmail.com", "krz.em.inska.kamila@ho.tm.a.il.com.pl"})
    public void shouldValidateEmail(String text) {
        assertTrue(userValidator.validateEmail(text));
    }

    @ParameterizedTest
    @ValueSource (strings = {"krz.em.inska.kamila@ho.tm.a.il.com.plandeka", "krzeminska.kamila@gmail.complexity"})
    public void shouldNotValidateEmailIfLastCharSetExceedsLengthOfSixChars(String text) {
        assertFalse(userValidator.validateEmail(text));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldNotValidateEmailIfTextIsNullOrEmpty(String text) {
        assertFalse(userValidator.validateEmail(text));
    }
}