package co.danieldev.oneforall.javacore.Iexception.exception.domain;

public class LoginInvalidException extends Exception {
    public LoginInvalidException() {
        super("Invalid login");
    }

    public LoginInvalidException(String message) {
        super(message);
    }
}
