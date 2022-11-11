public class Clovek {
    boolean jeMuz;
    double vaha;

    public Clovek(boolean jeMuz, double vaha) {
        this.jeMuz = jeMuz;
        this.vaha = vaha;
    }

    public boolean jsemVetsiNez (Clovek b) {
        if (jeMuz == true && b.jeMuz == false) {
            return true;
        }
        else if (jeMuz == false && b.jeMuz == true) {
            return false;
        }
        else if (vaha > b.vaha) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Clovek{" +
                "jeMuz=" + jeMuz +
                ", vaha=" + vaha +
                '}';
    }
}
