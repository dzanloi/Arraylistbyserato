public class ArrayFullException extends Exception{
    ArrayFullException(String message) {
        super(message);
    }

    ArrayFullException() {
        printStackTrace();
    }
}
