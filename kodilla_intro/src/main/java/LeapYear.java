public class LeapYear {
    public static void main(String[] arg) {


        int a = 2000;

        int b = 1000;

        System.out.println(czyRokPrzestepny(b));

    }


    static boolean czyRokPrzestepny(int a) {
        if (((a % 4 == 0) && (a % 100 != 0)) || (a % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}


