package escola;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private String endereco;
	
	// método construtor
	public Pessoa(String nome, String cpf) {
		super();
		this.nome     = nome;
		this.cpf      = cpf;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	

}
