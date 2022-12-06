package fastcampus.kotlinjava;

public class JvmFieldClassInJava {

    public static void main(String[] args) {
        int id = JvmFieldClass.id;

        String name = JvmFieldObject.INSTANCE.getName();

        int code = JvmFieldClass.CODE;
        String familyName = JvmFieldObject.FAMILY_NAME;

    }
}
