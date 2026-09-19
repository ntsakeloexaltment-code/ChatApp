
package com.mycompany.chatapp;



/**
 *
 * @author Student
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

public class RegistrationAppTest {

    // 1. Valid username
    @Test
    void testValidUsername() {
        assertTrue(
                RegistrationApp.checkUserName("kyl_1")
        );
    }

    // 2. Invalid username
    @Test
    void testInvalidUsername() {
        assertFalse(
                RegistrationApp.checkUserName("kyle")
        );
    }

    // 3. Valid password
    @Test
    void testValidPassword() {
        assertTrue(
                RegistrationApp.checkPasswordComplexity(
                        "Ch&&sec@ke99!"
                )
        );
    }

    // 4. Invalid password
    @Test
    void testInvalidPassword() {
        assertFalse(
                RegistrationApp.checkPasswordComplexity(
                        "password"
                )
        );
    }

    // 5. Valid South African cellphone number
    @Test
    void testValidCellPhoneNumber() {
        assertTrue(
                RegistrationApp.checkCellPhoneNumber(
                        "+27838968976"
                )
        );
    }

    // 6. Invalid cellphone number
    @Test
    void testInvalidCellPhoneNumber() {
        assertFalse(
                RegistrationApp.checkCellPhoneNumber(
                        "0838968976"
                )
        );
    }

    // 7. Successful registration
    @Test
    void testSuccessfulRegistration() {

        String result =
                RegistrationApp.registerUser(
                        "kyl_1",
                        "Ch&&sec@ke99!",
                        "+27838968976"
                );

        assertEquals(
                "User registered successfully!",
                result
        );
    }

    // 8. Registration with invalid username
    @Test
    void testRegistrationWithInvalidUsername() {

        String result =
                RegistrationApp.registerUser(
                        "kyle",
                        "Ch&&sec@ke99!",
                        "+27838968976"
                );

        assertEquals(
                "Username is not correctly formatted; "
                + "please ensure that your username contains an "
                + "underscore and is no more than five characters in length.",
                result
        );
    }

    // 9. Successful login
    @Test
    void testSuccessfulLogin() {

        RegistrationApp.registerUser(
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976"
        );

        assertTrue(
                RegistrationApp.loginUser(
                        "kyl_1",
                        "Ch&&sec@ke99!"
                )
        );
    }

    // 10. Failed login with incorrect password
    @Test
    void testFailedLogin() {

        RegistrationApp.registerUser(
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976"
        );

        assertFalse(
                RegistrationApp.loginUser(
                        "kyl_1",
                        "WrongPassword1!"
                )
        );
    }
   
}

