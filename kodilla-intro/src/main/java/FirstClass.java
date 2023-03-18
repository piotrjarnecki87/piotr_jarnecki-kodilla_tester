public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2018);
        System.out.println("1. Waga komputera wynosi " + notebook.weight + "g , cena kształtuje się na poziomie " + notebook.price + "zł. Data wyprodukowania: " + notebook.year + "r.");
        System.out.println ("Ocena wagi produktu: ");
        notebook.checkWeight();
        System.out.println("Ocena ceny produktu:");
        notebook.checkPrice();
        System.out.println("Ocena wieku produktu:");
        notebook.checkYear();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2019);
        System.out.println("2. Waga komputera wynosi " + heavyNotebook.weight + "g , cena kształtuje się na poziomie " + heavyNotebook.price + "zł. Data wyprodukowania: " + heavyNotebook.year + "r.");
        System.out.println ("Ocena wagi produktu: ");
        heavyNotebook.checkWeight();
        System.out.println("Ocena ceny produktu:");
        heavyNotebook.checkPrice();
        System.out.println("Ocena wieku produktu:");
        heavyNotebook.checkYear();

        Notebook oldNotebook = new Notebook(1200, 500, 2012);
        System.out.println("3. Waga komputera wynosi " + oldNotebook.weight + "g , cena kształtuje się na poziomie " + oldNotebook.price + "zł. Data wyprodukowania: " + oldNotebook.year + "r.");
        System.out.println ("Ocena wagi produktu: ");
        oldNotebook.checkWeight();
        System.out.println("Ocena ceny produktu:");
        oldNotebook.checkPrice();
        System.out.println("Ocena wieku produktu:");
        oldNotebook.checkYear();

        Notebook gamingNotebook = new Notebook(1100, 3000,2023);
        System.out.println("4. Waga komputera wynosi " + gamingNotebook.weight + "g , cena kształtuje się na poziomie " + gamingNotebook.price + "zł. Data wyprodukowania: " + gamingNotebook.year + "r.");
        System.out.println ("Ocena wagi produktu: ");
        gamingNotebook.checkWeight();
        System.out.println("Ocena ceny produktu:");
        gamingNotebook.checkPrice();
        System.out.println("Ocena wieku produktu:");
        gamingNotebook.checkYear();


    }

}
