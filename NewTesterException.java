package five;

public class NewTesterException extends Exception {

    public NewTesterException() {
        super("ERROR OF MAKING NEW OBJECT OF CLASS TESTER");
    }

    public NewTesterException(String message) {
        super(message);
    }
}
