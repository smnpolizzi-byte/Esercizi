package polizzi.simone.PipelineDati.Prodotto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListaProdotti {
    private List<Prodotto> prodotti;

    public List<Prodotto> getProdotti() {
        return prodotti;
    }

    public ListaProdotti(List<Prodotto> prodotti) {
        this.prodotti = prodotti;
    }

    public List<Prodotto> prodottiPerPrezzo(Integer prezzo) {
        List<Prodotto> prodottiPerPrezzo = new ArrayList<Prodotto>();

        for(Prodotto p : prodotti) {
            if(p.getPrezzo()>prezzo) {
                prodottiPerPrezzo.add(p);
            }
        }

        return prodottiPerPrezzo;
    }

    public  List<Prodotto> prodottiPerCategoria(String categoria) {
        List<Prodotto> prodottiPerCategoria = new ArrayList<>();

        for(Prodotto p : prodotti) {
            if(p.getCategoria().equals(categoria)) {
                prodottiPerCategoria.add(p);
            }
        }

        return prodottiPerCategoria;
    }

    public Map<String, Double> prezzoMedioPerCategoria() {
        Map<String, Double> prezzoPerCategoria = new HashMap<>();

        for(Prodotto p : prodotti) {
            if(!prezzoPerCategoria.containsKey(p.getCategoria())) {
                prezzoPerCategoria.put(p.getCategoria(), p.getPrezzo());
            } else {
                prezzoPerCategoria.put(p.getCategoria(), p.getPrezzo() + prezzoPerCategoria.get(p.getCategoria()));
            }
        }

        for (String key : prezzoPerCategoria.keySet()) {
            prezzoPerCategoria.put(key, prezzoPerCategoria.get(key)/prodottiPerCategoria(key).size());
        }

        return  prezzoPerCategoria;
    }

}
