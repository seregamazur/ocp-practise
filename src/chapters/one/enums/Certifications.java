package chapters.one.enums;

public enum Certifications implements Seriohable {
    OCA(20) {
        @Override
        public void doSeriohable() {
        }

        @Override
        public Boolean done() {
            howItWas();
            return true;
        }

        @Override
        public Boolean unDone() {
            return true;
        }

        private String howItWas() {
            return "Hard";
        }
    },
    OCP(40, "") {
        @Override
        public void doSeriohable() {
        }

        @Override
        public Boolean done() {
            return false;
        }

        public String howItWas() {
            return "IDK";
        }

        @Override
        public Boolean unDone() {
            return super.unDone();
        }
    };

    private Integer price;
    private String line;

    Certifications(Integer price) {
        this.price = price;
        System.out.println("HELLO EPTA");
    }

    //public, protected -> compile error
    Certifications(Integer price, String line) {
        this.price = price;
        this.line = line;
    }

    public abstract Boolean done();

    public Boolean unDone() {
        return false;
    }

}
