public class FirstClass {
    public static void main(String[] args) {
        Notebook heavyNotebook = new Notebook("2000g", 1500, 2017);
        Notebook notebook = new Notebook("600g", 900, 2014);
        Notebook oldNotebook = new Notebook("1200g", 500, 1999);

        notebookParameters(notebook);
        notebookParameters(heavyNotebook);
        notebookParameters(oldNotebook);
    }

    private static void notebookParameters(Notebook notebook) {
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkPriceAndYear();
    }
}
