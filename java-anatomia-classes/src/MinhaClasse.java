public class MinhaClasse {

    public static void main(String[] args) {
        String primeiroNome = "Eber";
        String segundoNome  = "Barbosa";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
        System.out.println();
        
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {

        return "\nResultado do método é " + primeiroNome.concat(" ").concat(segundoNome);


    }
    
}

