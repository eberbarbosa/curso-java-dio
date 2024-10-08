package enumeracoes;

public enum EstadoBrasileiro {
	
	SAO_PAULO   ("SP", "São Paulo", 11),
	RIO_JANEIRO ("RJ", "Rio de Janeiro", 12),
	PIAUI       ("PI", "Piauí", 13),
	MARANHAO    ("MA", "Maranhão", 14),
	CEARA       ("CE", "Ceará", 15)
	;
	
	private String sigla;
	private String nome;
	private int    ibge;
	
	
	private EstadoBrasileiro(String sigla, String nome, int ibge) {
		this.nome  = nome;
		this.sigla = sigla;
		this.ibge  = ibge;
	}
	
	public int getIbge() {
		return ibge;
	}
	
	public String getSigla() {
		return sigla;
	}

	public String getNome() {
		return nome;
	}	

	

		
	public String getNomeMaiusculo() {
		
		return nome.toUpperCase();
	}
	
	
	
	

}
