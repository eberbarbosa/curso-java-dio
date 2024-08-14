package escola;

public class SistemaCadastro {
	
	public static void main(String[] args) {
		
		// croiamos uma pessao no sistema
		Pessoa marcos = new Pessoa("MARCOS", "123.123.123");
		
		// definimos o endereço de Marcos
		marcos.setEndereco("Rua da Amendoeiras");
		
		
		System.out.println(marcos.getNome() + "-" + marcos.getCpf());
	}

}
