public class Clovek implements Comparable,UmiSeTridit{
    boolean jeMuz;
    double vaha;

    public Clovek(boolean jeMuz, double vaha) {
        this.jeMuz = jeMuz;
        this.vaha = vaha;
    }



    @Override
    public String toString() {
        return "Clovek{" +
                "jeMuz=" + jeMuz +
                ", vaha=" + vaha +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Clovek b = (Clovek)o;

        if (jeMuz == true && b.jeMuz == false) {
            return 1;
        }
        else if (jeMuz == false && b.jeMuz == true) {
            return -1;
        }
        else if (vaha > b.vaha) {
            return 1;
        }
        else {
            return 0;
        }
    }

    @Override
    public boolean jsemVetsiNez(UmiSeTridit b) {
        return false;
    }
}
