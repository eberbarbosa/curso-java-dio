
import java.util.ArrayList;
import java.util.List;

class Mensagens {
    private List<String> mensagensEnviadas;
    private List<String> mensagensRecebidas;

    public Mensagens() {
        this.mensagensEnviadas  = new ArrayList<>();
        this.mensagensRecebidas = new ArrayList<>();
    }

    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando mensagem para " + numero + ": " + mensagem);
        mensagensEnviadas.add(mensagem);
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem.");
    }

    // Getters e Setters
    public List<String> getMensagensEnviadas() {
        return mensagensEnviadas;
    }

    public List<String> getMensagensRecebidas() {
        return mensagensRecebidas;
    }
}
