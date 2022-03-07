package chapters.one.nestedclass;

public class LocalInner {

    private Integer number = 10;
    private final static String hello = "Hello";

    void sayHello() {
        String world = " world!";
        final class HelloTranslator {

            public String getGreetings() {
                return hello + world + number;
            }
        }
        HelloTranslator helloTranslator = new HelloTranslator();
        System.out.println(helloTranslator.getGreetings());
    }

    static void sayGoodbye() {
        final class GoodbyeTranslator {

            public String getGoodbye() {
                return hello;
            }
        }
    }

    public static void main(String[] args) {
        new LocalInner().sayHello();
    }
}
