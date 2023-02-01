package util;

public class MenuUtil {

    public static void menuProces(int menu) {
    }

    public static String requireName() {
        return InputUtil.requireText("enter name :");
    }

    public static String requireSurname() {
        return InputUtil.requireText("enter surname :");
    }

    public static int requireAge() {
        return InputUtil.requireNumber("enter age");
    }

    public static String requireGroupNumber() {
        return InputUtil.requireText("enter groupnumber :");
    }


}
