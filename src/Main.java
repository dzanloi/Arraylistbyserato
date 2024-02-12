public class Main {
    public static void main(String[] args) {
        MyList ml = new MyList();
        try {
            ml.add(1);
            ml.remove(1);
        } catch (ArrayFullException e) {
            throw new RuntimeException(e);
        }


    }
}