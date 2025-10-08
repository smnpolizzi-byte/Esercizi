import polizzi.simone.PipelineDati.Prodotto.ListaProdotti;
import polizzi.simone.PipelineDati.Prodotto.Prodotto;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ListaProdotti l = new ListaProdotti(Arrays.asList(
           new Prodotto("mouse", 50.99, "gaming"),
           new Prodotto("telefono", 199.99, "telefonia"),
           new Prodotto("cuffie", 70.99, "gaming"),
           new Prodotto("tasiera", 80.99, "gaming"),
           new Prodotto("cuffie bluetooth", 0.0, "telefonia"),
           new Prodotto("penna", 13.00, "cancelleria"),
           new Prodotto("tacquino", 6.56, "cancelleria"),
           new Prodotto("quaderno", 9.99, "cancelleria"),
           new Prodotto("banana", 5.99, "frutteria"),
           new Prodotto("pesca", 7.99, "frutteria")
        ));

        System.out.println("lista dei prodotti: ");
        l.getProdotti().forEach( p -> System.out.print(p.getNome() + " "));

        System.out.println("\nprodotti più costosi di 70€: ");
        l.prodottiPerPrezzo(70).forEach(p -> System.out.print(p.getNome() + " " +  p.getPrezzo() + " "));

        System.out.println("\nprodotti per categoria telefonia: ");
        l.prodottiPerCategoria("telefonia").forEach(p -> System.out.print(p.getNome() + " "));

        System.out.println("\nprodotti per categoria cancelleria: ");
        l.prodottiPerCategoria("cancelleria").forEach(p -> System.out.print(p.getNome() + " "));

        System.out.println("\nprodotti per categoria frutteria: ");
        l.prodottiPerCategoria("frutteria").forEach(p -> System.out.print(p.getNome() + " "));

        System.out.println("\nmedia prezzo per categoria: ");
        l.prezzoMedioPerCategoria().forEach((s, aDouble) ->  System.out.print(s + " " + aDouble + " "));
    }
}