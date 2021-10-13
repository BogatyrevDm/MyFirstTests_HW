package com.geekbrains.myfirsttests

import org.junit.Assert.*
import org.junit.Test

class PasswordValidatorTest {
    @Test
    fun passwordValidator_PasswordsMatch_ReturnsTrue(){
        assertTrue(passwordsAreEqual("222","222"))
    }
    @Test
    fun passwordValidator_PasswordsMatch_ReturnsFalse(){
        assertFalse(passwordsAreEqual("333","222"))
    }
    @Test
    fun passwordValidator_PasswordsMatch_Equal(){
        assertEquals(passwordsAreEqual("222","222"),passwordsAreEqual("222","222"))
    }
    @Test
    fun passwordValidator_PasswordsMatch_NotEqual(){
        assertNotEquals(passwordsAreEqual("222","222"),passwordsAreEqual("222","333"))
    }
}