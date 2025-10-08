package polizzi.simone.PipelineDati.Prodotto;

import java.util.List;

public class Prodotto {
    private String nome;
    private Double prezzo;
    private String categoria;

    public String getNome() {
        return nome;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public String getCategoria() {
        return categoria;
    }

    public Prodotto(String nome, Double prezzo, String categoria) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.categoria = categoria;
    }

}
