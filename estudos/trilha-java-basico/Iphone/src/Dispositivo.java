

public abstract class Dispositivo {
    private String modelo;
    private int    armazenamento;
    private int    bateria;

    protected Dispositivo(String modelo, int armazenamento, int bateria) {
        this.modelo        = modelo;
        this.armazenamento = armazenamento;
        this.bateria       = bateria;
    }

    public abstract void ligar();
    public abstract void desligar();
    public abstract void configurar();
    public abstract void sincronizar();

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }
}
