package fastcampus.basic;

import java.lang.reflect.Array;
import java.util.List;

public class Java_Exception {

    public static void main(String[] args) {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
