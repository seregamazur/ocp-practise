package chapters.one.enums;

public class Dispatcher {

    public static void main(String[] args) {
        Certifications oca = Certifications.OCA;
        Certifications ocp = Certifications.OCP;
        System.out.println(oca.done());
        System.out.println(ocp.done());

        System.out.println(Certifications.OCA.done());
    }

}
