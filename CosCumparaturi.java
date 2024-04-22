import java.util.ArrayList;
import java.util.List;

public class CosCumparaturi {
    private List<Produs> listaProduse;

    public CosCumparaturi() {
        this.listaProduse = new ArrayList<>();
    }

    public void adaugaProdus(Produs produs) {
        listaProduse.add(produs);
    }

    public double calculeazaTotal() {
        double total = 0.0;
        for (Produs produs : listaProduse) {
            total += produs.getPret();
        }
        return total;
    }

    public static void testCosCumparaturi() {
        CosCumparaturi cos = new CosCumparaturi();

        cos.adaugaProdus(new Produs("Laptop", 1800.0));
        cos.adaugaProdus(new Produs("Mouse", 20.0));
        cos.adaugaProdus(new Produs("Tastatură", 180.0));

        double total = cos.calculeazaTotal();

        System.out.println("Totalul: " + total);
    }

    public static void main(String[] args) {
        testCosCumparaturi();
    }
}
