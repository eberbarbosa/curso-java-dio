
import java.util.ArrayList;
import java.util.List;

class NavegadorWeb {
    private List<String> historicoNavegacao;
    private List<String> favoritos;

    public NavegadorWeb() {
        this.historicoNavegacao = new ArrayList<>();
        this.favoritos          = new ArrayList<>();
    }

    public void navegarParaURL(String url) {
        System.out.println("Navegando para: " + url);
        historicoNavegacao.add(url);
    }

    public void adicionarFavorito(String url) {
        System.out.println("Adicionando aos favoritos: " + url);
        favoritos.add(url);
    }

    // Getters e Setters
    public List<String> getHistoricoNavegacao() {
        return historicoNavegacao;
    }

    public List<String> getFavoritos() {
        return favoritos;
    }
}
