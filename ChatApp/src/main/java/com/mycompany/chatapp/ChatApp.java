/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chatapp;

/**
 *
 * @author Student
 */




import java.util.Scanner;

public class ChatApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("          CHAT APP");
        System.out.println("================================");

        // Get user's name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        // =========================
        // REGISTRATION
        // =========================

        System.out.println("\n--- REGISTRATION ---");

        // Username
        String username;

        while (true) {

            System.out.print("Enter username: ");
            username = scanner.nextLine();

            if (RegistrationApp.checkUserName(username)) {

                System.out.println(
                        "Username successfully captured."
                );

                break;

            } else {

                System.out.println(
                        "Username is not correctly formatted; "
                        + "please ensure that your username contains "
                        + "an underscore and is no more than five "
                        + "characters in length."
                );

                System.out.println(
                        "Please enter your username."
                );
            }
        }

        // Password
        String password;

        while (true) {

            System.out.print("Enter password: ");
            password = scanner.nextLine();

            if (RegistrationApp.checkPasswordComplexity(password)) {

                System.out.println(
                        "Password successfully captured."
                );

                break;

            } else {

                System.out.println(
                        "Password is not correctly formatted; "
                        + "please ensure that the password contains "
                        + "at least eight characters, a capital letter, "
                        + "a number, and a special character."
                );

                System.out.println(
                        "Please enter your password ."
                );
            }
        }

        // Cell phone number
        String phoneNumber;

        while (true) {

            System.out.print(
                    "Enter South African cell phone number "
                    + "(e.g. +27838968976): "
            );

            phoneNumber = scanner.nextLine();

            if (RegistrationApp.checkCellPhoneNumber(phoneNumber)) {

                System.out.println(
                        "Cell phone number successfully added."
                );

                break;

            } else {

                System.out.println(
                        "Cell phone number incorrectly formatted "
                        + "or does not contain international code."
                );

                System.out.println(
                        "Please enter your cellphone number."
                );
            }
        }

        // =========================
        // REGISTER USER
        // =========================

        String registrationResult =
                RegistrationApp.registerUser(
                        username,
                        password,
                        phoneNumber
                );

        System.out.println("\nRegistration Result:");
        System.out.println(registrationResult);

        // =========================
        // LOGIN
        // =========================

        System.out.println("\n--- LOGIN ---");

        String loginUsername;
        String loginPassword;

        while (true) {

            System.out.print("Enter username: ");
            loginUsername = scanner.nextLine();

            System.out.print("Enter password: ");
            loginPassword = scanner.nextLine();

            if (RegistrationApp.loginUser(
                    loginUsername,
                    loginPassword)) {

                System.out.println(
                        "\nWelcome " + firstName + ", "
                        + lastName
                        + " it is great to see you again."
                );

                break;

            } else {

                System.out.println(
                        "\nUsername or password incorrect, "
                        + "please try again."
                );
            }
        }

        scanner.close();
    }
}
