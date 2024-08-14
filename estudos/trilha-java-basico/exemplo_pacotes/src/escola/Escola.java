package escola;

public class Escola {
	
		public static void main(String[] args) {
			
			Aluno eber = new Aluno();
			
			eber.setNome("Eber");
			eber.setIdade(10);
			
			System.out.println("O aluno " + eber.getNome() + " tem " + eber.getIdade() + " anos ");
		}

}
