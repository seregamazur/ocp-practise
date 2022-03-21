package chapters.one.nestedclass;

public class AnonymousLocalInner {

    private static String line = "Hello";
    private final String goodbye = "Bye";

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
                return line + ", World!" + goodbye;
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
        final SomeClazz someClazzChild = new SomeClazz() {

            @Override
            void doSomeClazz() {

            }

            @Override
            public void doSeriohable() {

            }
        };
        final ClassWithNoOverrideMethods classWithNoOverrideMethods = new ClassWithNoOverrideMethods() {

        };
    }

    public static void main(String[] args) {
        new AnonymousLocalInner().sayHello();
    }

}
