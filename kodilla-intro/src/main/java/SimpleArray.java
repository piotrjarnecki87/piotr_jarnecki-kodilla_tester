public class SimpleArray {
    public static void main(String[] args) {
        String[] names = new String[5];

        names[0] = "Ola";
        names[1] = "Ania";
        names[2] = "Kasia";
        names[3] = "Magda";
        names[4] = "Sylwia";

        System.out.println(names[3]);

        int numberOfElements = names.length;
        System.out.println("Moja tablica zawieta " + numberOfElements + " elementów");
    }
}