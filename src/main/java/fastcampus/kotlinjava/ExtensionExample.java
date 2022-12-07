package fastcampus.kotlinjava;


public class ExtensionExample {

    public static void main(String[] args) {
//        "ABCE".first();
//        "ABCD".addFirst('Z')

        char abcd = MyExtensionsKt.first("ABCD");
        String s = MyExtensionsKt.addFirst("ABCD", 'Z');

        System.out.println(abcd);
        System.out.println(s);
    }
}
