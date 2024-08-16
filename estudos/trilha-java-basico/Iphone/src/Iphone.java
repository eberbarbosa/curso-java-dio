

class iPhone extends Dispositivo {
    
    private SistemaOperacional sistemaOperacional;
    private Telefone           telefone;
    private Mensagens          mensagens;
    private Midia              midia;
    private NavegadorWeb       navegadorWeb;

    public iPhone(String modelo, int armazenamento, int bateria, SistemaOperacional sistemaOperacional) {
        super(modelo, armazenamento, bateria);
        this.sistemaOperacional = sistemaOperacional;
        this.telefone           = new Telefone();
        this.mensagens          = new Mensagens();
        this.midia              = new Midia();
        this.navegadorWeb       = new NavegadorWeb();
    }

    @Override
    public void ligar() {
        System.out.println("iPhone ligado.");
        sistemaOperacional.iniciar();
    }

    @Override
    public void desligar() {
        System.out.println("iPhone desligado.");
    }

    @Override
    public void configurar() {
        System.out.println("Configurando iPhone.");
    }

    @Override
    public void sincronizar() {
        System.out.println("Sincronizando iPhone.");
    }

    // Métodos adicionais para interagir com funcionalidades
    public void fazerChamada(String numero) {
        telefone.fazerChamada(numero);
    }

    public void enviarMensagem(String numero, String mensagem) {
        mensagens.enviarMensagem(numero, mensagem);
    }

    public void reproduzirMusica(String nomeMusica) {
        midia.reproduzirMusica(nomeMusica);
    }

    public void navegarParaURL(String url) {
        navegadorWeb.navegarParaURL(url);
    }
}
