

import java.util.HashMap;
import java.util.Map;

class SistemaOperacional {
    private String versao;
    private Map<String, String> configuracoes;

    public SistemaOperacional(String versao) {
        this.versao        = versao;
        this.configuracoes = new HashMap<>();
    }

    public void iniciar() {
        System.out.println("Sistema Operacional " + versao + " iniciado.");
    }

    public void atualizar() {
        System.out.println("Sistema Operacional atualizado.");
    }

    public void configurar(String opcao, String valor) {
        configuracoes.put(opcao, valor);
        System.out.println("Configuração " + opcao + " ajustada para " + valor);
    }

    // Getters e Setters
    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public Map<String, String> getConfiguracoes() {
        return configuracoes;
    }

    public void setConfiguracoes(Map<String, String> configuracoes) {
        this.configuracoes = configuracoes;
    }
}
