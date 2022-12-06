package fastcampus.kotlinjava;

public class JvmStaticExample {

    public static void main(String[] args) {
//        String hello = HelloClass.Companion.hello();
//
//        String hi = HiObject.INSTANCE.hi();

        //@Jvmstatic
        String hello = HelloClass.hello();

        String hi = HiObject.hi();
    }
}
