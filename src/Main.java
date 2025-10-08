import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<HashMap<String, String>> listaProdotti = new ArrayList<>();

        for(Integer i = 0; i < 10; i++){
            listaProdotti.add(new HashMap<>());
        }

        listaProdotti.get(0).put("nome","mouse");
        listaProdotti.get(0).put("prezzo", "50.99");
        listaProdotti.get(0).put("categoria", "gaming");

        listaProdotti.get(1).put("nome","telefono");
        listaProdotti.get(1).put("prezzo", "199.99");
        listaProdotti.get(1).put("categoria", "telefonia");

        listaProdotti.get(2).put("nome","cuffie");
        listaProdotti.get(2).put("prezzo", "70.99");
        listaProdotti.get(2).put("categoria", "gaming");

        listaProdotti.get(3).put("nome","tastiera");
        listaProdotti.get(3).put("prezzo", "80.99");
        listaProdotti.get(3).put("categoria", "gaming");

        listaProdotti.get(4).put("nome","cuffie bluetooth");
        listaProdotti.get(4).put("prezzo", "50.0");
        listaProdotti.get(4).put("categoria", "telefonia");

        listaProdotti.get(5).put("nome","penna");
        listaProdotti.get(5).put("prezzo", "13.00");
        listaProdotti.get(5).put("categoria", "cancelleria");

        listaProdotti.get(6).put("nome","tacquino");
        listaProdotti.get(6).put("prezzo", "6.56");
        listaProdotti.get(6).put("categoria", "cancelleria");

        listaProdotti.get(7).put("nome","quaderno");
        listaProdotti.get(7).put("prezzo", "9.99");
        listaProdotti.get(7).put("categoria", "cancelleria");

        listaProdotti.get(8).put("nome","banana");
        listaProdotti.get(8).put("prezzo", "5.99");
        listaProdotti.get(8).put("categoria", "frutteria");

        listaProdotti.get(9).put("nome","pesca");
        listaProdotti.get(9).put("prezzo", "7.99");
        listaProdotti.get(9).put("categoria", "frutteria");

        System.out.print("lista dei prodotti\n\t");
        listaProdotti.forEach(p -> {
            System.out.print(p.get("nome") + "\t");
        });

        System.out.println();

        System.out.print("lista di prodotti più costosi di 70€\n\t");
        listaProdotti.stream().filter(p -> Double.parseDouble(p.get("prezzo")) > 70).forEach(p -> {
            System.out.print(p.get("nome") + ": " + p.get("prezzo") + "\t");
        });

        System.out.println();

        System.out.print("\nlista di prodotti per la categoria gaming:\n\t");
        listaProdotti.stream().filter(p -> p.get("categoria").equals("gaming")).forEach(p -> {
            System.out.print(p.get("nome") + "\t");
        });

        System.out.println();

        System.out.print("\nlista di prodotti per la categoria telefonia:\n\t");
        listaProdotti.stream().filter(p -> p.get("categoria").equals("telefonia")).forEach(p -> {
            System.out.print(p.get("nome") + "\t");
        });

        System.out.println();

        System.out.print("\nlista di prodotti per la categoria cancelleria:\n\t");
        listaProdotti.stream().filter(p -> p.get("categoria").equals("cancelleria")).forEach(p -> {
            System.out.print(p.get("nome") + "\t");
        });

        System.out.println();

        System.out.print("\nlista di prodotti per la categoria gaming:\n\t");
        listaProdotti.stream().filter(p -> p.get("categoria").equals("frutteria")).forEach(p -> {
            System.out.print(p.get("nome") + "\t");
        });

        System.out.println();

        Map<String, String> mediaCategorie = new HashMap<>();

        System.out.println("\nmedia prezzo per categoria:\n\t");
        listaProdotti.stream().forEach(p -> {
            Double somma = 0.;
            Integer counter = 0;
            List<String> listaCategoria = new ArrayList<>();
            if(!listaCategoria.contains(p.get("categoria")))  listaCategoria.add(p.get("categoria"));
            for(int i = 0; i < listaProdotti.size(); i++){
                if(listaCategoria.get(listaCategoria.size()-1).equals(listaProdotti.get(i).get("categoria"))) {
                    somma += Double.parseDouble(listaProdotti.get(i).get("prezzo"));
                    counter++;
                }
            }
            mediaCategorie.put(p.get("categoria"), String.valueOf((somma/counter)));
        });

        mediaCategorie.forEach((k,v) -> {
            System.out.print(k + " " + v + "\t");
        });
    }
}