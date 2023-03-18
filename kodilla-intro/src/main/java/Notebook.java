public class Notebook {
    int weight;
    int price;
    int year;


    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("tani");
        }
        else if (this.price > 600 && this.price > 1000) {
            System.out.println("rozsądna cena");

        } else {
                System.out.println("drogi");}        }

    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("lekki");
        } else if (this.weight > 1000 && this.weight < 1800) {
            System.out.println("średniej wagi");
        }
        else if (this.weight > 1800) {
            System.out.println("ciężki");
        }
    }

    public void checkYear() {
        if (this.year < 2018) {
            System.out.println("stary");
        }
        else if (this.year > 2018 && this.year <2020) {
            System.out.println("stosunkowo nowy");
        }
        else {
            System.out.println("nowy");
        }
    }



    }







