package chapters.one.nestedclass;

public class StaticNested {

    int x = 10;

    static class Nested {

        static StaticNested nested = new StaticNested();

        static void greeting() {
        }

        void doGreetings() {
            System.out.println(nested.x);
        }
    }

    public static void main(String[] args) {

    }

}
