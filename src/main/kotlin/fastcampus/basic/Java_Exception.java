package fastcampus.basic;

public class Java_Exception {

    public static void main(String[] args) {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
