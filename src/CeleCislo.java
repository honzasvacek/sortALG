public class CeleCislo implements UmiSeTridit{
    int cislo;

    public CeleCislo(int cislo) {
        this.cislo = cislo;
    }

    @Override
    public String toString() {
        return "CeleCislo{" +
                "cislo=" + cislo +
                '}';
    }

    public boolean jsemVetsiNez (UmiSeTridit x) {
        CeleCislo b = (CeleCislo)x;
        return cislo > b.cislo;  //když to platí vratí true ksyž neplatí vrátí false
    }
}
