
import java.util.ArrayList;
import java.util.List;

class Telefone {
    private String numeroTelefone;
    private List<String> historicoChamadas;

    public Telefone() {
        this.historicoChamadas = new ArrayList<>();
    }

    public void fazerChamada(String numero) {
        System.out.println("Chamando " + numero);
        historicoChamadas.add(numero);
    }

    public void receberChamada() {
        System.out.println("Recebendo chamada.");
    }

    // Getters e Setters
    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public List<String> getHistoricoChamadas() {
        return historicoChamadas;
    }
}

