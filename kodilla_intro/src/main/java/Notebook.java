public class Notebook {
    String weight;
    int price;
    int year;

    public Notebook(String weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;

        if (!this.weight.matches("[1-9]+[0-9]*g")) {
            throw new RuntimeException("Niewłaściwy format. Wpisz liczbę gramów większą od 0 i dodaj bezpośrednio na końcu jednostkę miary: g");
        }
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        String weightStep1 = this.weight.substring(0, this.weight.length()-1);
        int weight = Integer.parseInt(weightStep1);

        if (weight < 1200) {
            System.out.println("Lightweight");
        } else if (weight < 2000) {
            System.out.println("Not too heavy");
        } else {
            System.out.println("Very heavy");
        }
    }

    public void checkPriceAndYear () {
        if (this.year < 2000) {
            System.out.println("This notebook was produced before 2000 - it's very old.");
            if (this.price < 600) {
                System.out.println("This notebook is very cheap.");
            } else if (this.price <= 1000) {
                System.out.println("The price is good.");
            } else {
                System.out.println("This notebook is expensive.");
            }
        } else if (this.year <= 2014) {
            System.out.println("This notebook is produced after 1999 but before 2014. It's quite old.");
            if (this.price < 600) {
                System.out.println("This notebook is very cheap.");
            } else if (this.price <= 1000) {
                System.out.println("The price is good.");
            } else {
                System.out.println("This notebook is expensive.");
            }
        } else {
            System.out.println("This notebook is produced after 2013. It's relatively new.");
            if (this.price < 600) {
                System.out.println("This notebook is very cheap.");
            } else if (this.price <= 1000) {
                System.out.println("The price is good.");
            } else {
                System.out.println("This notebook is expensive.");
            }
        }
    }
}
