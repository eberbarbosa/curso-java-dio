public class AppIphone {
    public static void main(String[] args) {
        SistemaOperacional ios = new SistemaOperacional("iOS 1.0");
        iPhone meuIphone = new iPhone("iPhone 1", 16, 1000, ios);

        meuIphone.ligar();
        meuIphone.fazerChamada("555-1234");
        meuIphone.enviarMensagem("555-1234", "Olá, este é meu novo iPhone!");
        meuIphone.reproduzirMusica("Let It Be");
        meuIphone.navegarParaURL("http://www.apple.com");
        meuIphone.desligar();
    }
}
