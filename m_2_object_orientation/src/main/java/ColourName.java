import java.util.Scanner;
public class ColourName {
    public static String getFullColourName() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first letter of colour name: ");
            String firstLetter = scanner.nextLine().trim().toUpperCase();
            switch (firstLetter) {
                case "Y":
                    return "YELLOW";
                case "G":
                    return "GREY";
                case "R":
                    return "RED";
                case "B":
                    return "BLUE";
                default:
                    System.out.println("You entered wrong sign. Please enter a first letter of colour name.");
            }
        }
    }
}
