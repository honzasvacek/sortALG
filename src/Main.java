public class Main {
    public static void main(String[] args) {

        Clovek[] arr = {
                new Clovek(true, 76.4),
                new Clovek(true, 89.6),
                new Clovek(false, 56.2),
                new Clovek(false, 65.3),
                new Clovek(true, 89.9),
        };

        CeleCislo[] arr2 = {
                new CeleCislo(5),
                new CeleCislo(4),
                new CeleCislo(6)
        };

        setridPole(arr2);
        for (CeleCislo z:arr2) {
            System.out.println(z);
        }
    }
    public static void setridPole(UmiSeTridit[] arr) {
        boolean jePotrebaToSetridir = true;
        while (jePotrebaToSetridir) {
            jePotrebaToSetridir = false;

            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1].jsemVetsiNez(arr[i])) {
                    UmiSeTridit x = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = x;

                    jePotrebaToSetridir = true;
                }
            }
        }
    }

}