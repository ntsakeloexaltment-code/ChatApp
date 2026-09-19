/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapp;

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class RegistrationApp {

    private static String registeredUsername;
    private static String registeredPassword;
    private static String registeredCellPhoneNumber;

    // Check username
    public static boolean checkUserName(String username) {

        return username != null
                && username.contains("_")
                && username.length() <= 5;
    }

    // Check password complexity
    public static boolean checkPasswordComplexity(String password) {

        if (password == null || password.length() < 8) {
            return false;
        }

        boolean hasCapitalLetter = false;
        boolean hasNumber = false;
        boolean hasSpecialCharacter = false;

        for (char character : password.toCharArray()) {

            if (Character.isUpperCase(character)) {
                hasCapitalLetter = true;
            }

            if (Character.isDigit(character)) {
                hasNumber = true;
            }

            if (!Character.isLetterOrDigit(character)) {
                hasSpecialCharacter = true;
            }
        }

        return hasCapitalLetter
                && hasNumber
                && hasSpecialCharacter;
    }

    // Check South African cellphone number
    public static boolean checkCellPhoneNumber(String phoneNumber) {

        return phoneNumber != null
                && phoneNumber.matches("^\\+27\\d{9}$");
    }

    // Register user
    public static String registerUser(
            String username,
            String password,
            String phoneNumber) {

        if (!checkUserName(username)) {

            return "Username is not correctly formatted; "
                    + "please ensure that your username contains an "
                    + "underscore and is no more than five characters in length.";
        }

        if (!checkPasswordComplexity(password)) {

            return "Password is not correctly formatted; "
                    + "please ensure that the password contains at least "
                    + "eight characters, a capital letter, a number, "
                    + "and a special character.";
        }

        if (!checkCellPhoneNumber(phoneNumber)) {

            return "Cell phone number incorrectly formatted "
                    + "or does not contain international code.";
        }

        registeredUsername = username;
        registeredPassword = password;
        registeredCellPhoneNumber = phoneNumber;

        return "User registered successfully!";
    }

    // Login user
    public static boolean loginUser(
            String username,
            String password) {

        if (username == null || password == null) {
            return false;
        }

        if (registeredUsername == null
                || registeredPassword == null) {
            return false;
        }

        return registeredUsername.equals(username)
                && registeredPassword.equals(password);
    }

    // Return login status
    public static String returnLoginStatus(
            String username,
            String password,
            String firstName,
            String lastName) {

        if (loginUser(username, password)) {

            return "Welcome " + firstName + ", "
                    + lastName
                    + " it is great to see you again.";
        }

        return "Username or password incorrect, please try again.";
    }
}