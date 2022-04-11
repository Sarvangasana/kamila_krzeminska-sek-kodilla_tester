public class SimpleArray {
    public static void main(String[] args) {

        String[] przyjaciele = new String[] {"Ania", "Simona", "Oskar", "Wojtek", "Natalia"};

        String[] zwierzeta = new String [5];
        zwierzeta[0] = "Pies";
        zwierzeta[1] = "Kot";
        zwierzeta[2] = "Chomik";

        String przyjaciel = przyjaciele[3];

        System.out.println(przyjaciel);

        int numberOfElements = przyjaciele.length;

        System.out.println("Moja tablica zawiera" + ' ' + numberOfElements + ' ' + "elementów.");
    }
}
