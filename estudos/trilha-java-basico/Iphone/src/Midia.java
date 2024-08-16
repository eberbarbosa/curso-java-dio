
import java.util.ArrayList;
import java.util.List;

class Midia {
    private List<String> bibliotecaMidia;

    public Midia() {
        this.bibliotecaMidia = new ArrayList<>();
    }

    public void reproduzirMusica(String nomeMusica) {
        System.out.println("Reproduzindo música: " + nomeMusica);
    }

    public void exibirImagem(String nomeImagem) {
        System.out.println("Exibindo imagem: " + nomeImagem);
    }

    public void reproduzirVideo(String nomeVideo) {
        System.out.println("Reproduzindo vídeo: " + nomeVideo);
    }

    // Getters e Setters
    public List<String> getBibliotecaMidia() {
        return bibliotecaMidia;
    }
}
