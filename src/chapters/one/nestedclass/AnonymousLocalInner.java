package chapters.one.nestedclass;

public class AnonymousLocalInner {

    private static String line = "Hello";
    interface InterfaceGreeting {

        String getAnotherGreetings();
    }

    void sayHello() {
        abstract class Greeting {

            abstract String getGreetings();
        }

        Greeting greeting = new Greeting() {
            @Override
            String getGreetings() {
                return line + ", World!";
            }
        };
        InterfaceGreeting interfaceGreeting = new InterfaceGreeting() {
            @Override
            public String getAnotherGreetings() {
                return "Hallo, Welt!";
            }
        };
        System.out.println(greeting.getGreetings());
        System.out.println(interfaceGreeting.getAnotherGreetings());
        final AnonymousLocalInner anonymousLocalInner = new AnonymousLocalInner() {
            @Override
            void sayHello() {
                System.out.println("I'm mask");
            }
        };
    }

    public static void main(String[] args) {
        new AnonymousLocalInner().sayHello();
    }

}
