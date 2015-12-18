public class ClassWithStatic {
    public static InnerClass field;

    public static String someString() {
        throw new IllegalStateException();
    }

    public static class InnerClass {

    }
}
