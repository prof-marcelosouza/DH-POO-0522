package entities.exception;

public class ClienteException extends Exception {

    public ClienteException() {
    }

    public ClienteException(String msg) {
        super(msg);
    }

    @Override
    public String toString() {
        return getMessage();
    }
}
