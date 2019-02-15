package tableofnuclides;

public class Element {

    private final String elt;

    public Element(int Z) {

        String e;

        if (Z == 1) {
            e = "H";
        } else if (Z == 2) {
            e = "He";
        } else if (Z == 3) {
            e = "Li";
        } else {
            e = "U";          
        }

        this.elt = e;
    }

    public String getChem() {
        return elt;
    }
}