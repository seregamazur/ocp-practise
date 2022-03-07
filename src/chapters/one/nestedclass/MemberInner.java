package chapters.one.nestedclass;

import java.io.Serializable;

public class MemberInner {

    private static String line = "Hello";
    public Integer someNumber = 10;

    abstract class Member implements Cloneable, Serializable {

        abstract String getGreetings();
    }

    final class MemberRealization extends Member {

        private int innerNumber = 20;

        @Override
        String getGreetings() {
            return line + someNumber;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    public static void main(String[] args) {
        MemberInner member = new MemberInner();
        MemberInner.MemberRealization realization = member.new MemberRealization();
        System.out.println(realization.innerNumber);
    }

}
