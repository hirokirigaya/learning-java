package co.danieldev.oneforall.javacore.Iexception.exception.test;

import co.danieldev.oneforall.javacore.Iexception.exception.domain.LoginInvalidException;

import java.util.Scanner;

public class LoginInvalidExceptionTest01 {
    public static void main(String[] args) {
        try {
            login();
        } catch (LoginInvalidException e) {
            e.printStackTrace();
        }

    }

    private static void login() throws LoginInvalidException {
        Scanner scanner = new Scanner(System.in);

        String username = "Daniel";
        String password = "123456";

        System.out.println("Username: ");
        String typedUserName = scanner.nextLine();
        System.out.println("Password: ");
        String typedPassword = scanner.nextLine();

        if (username.equals(typedUserName) && password.equals(typedPassword)) {
            System.out.println("Logged successfully!");
        } else {
            throw new LoginInvalidException("Username or password as incorrect.");
        }
    }
}
