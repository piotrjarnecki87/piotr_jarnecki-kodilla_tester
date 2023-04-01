import java.util.Scanner;

public class GetColor {

    public static void main(String[] args) {
        String color = getColor();
        String fullName = fullNameColor(color);
        System.out.println(fullName);
    }

    public static String getColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wpisz pierwszą literę koloru: ");
        String input = scanner.nextLine();
        return input.toUpperCase();
    }

    public static String fullNameColor(String color) {
        switch(color) {
            case "C":
                return "Czerwony";
            case "Z":
                return "Zielony";
            case "N":
                return "Niebieski";
            case "Ż":
                return "Żółty";
            case "R":
                return "Różowy";
            case "F":
                return "Fioletowy";
            case "P":
                return "Pomarańczowy";
            default:
                return "Nieznany kolor";
        }
    }
}
