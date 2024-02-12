public class InvalidPositionException extends RuntimeException{
    InvalidPositionException(int size) {
        super("Position must be between 1 and " + size);
    }
}
