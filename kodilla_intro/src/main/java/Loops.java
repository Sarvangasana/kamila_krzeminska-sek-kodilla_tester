public class Loops {
    public static void main (String [] args) {

        String[] names = new String[] {"Zygfryd", "Gwidon", "Florentyna"};

        /* for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        } */

        /* for (int i = 0; i<= names.length; i++) {
            System.out.println(i);
        }
            System.out.println(); */


        /* for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        } */

        /* int[] tablica = new int[] {1, 2, 3, 4, 5};

        int suma = getSuma(tablica);

        System.out.println(suma); */


        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

    }

    private static int getSuma(int[] a) {
        int suma = 0;

        for (int i = 0; i < a.length; i++) {
            suma += a[i];
        }
        return suma;
    }



}

