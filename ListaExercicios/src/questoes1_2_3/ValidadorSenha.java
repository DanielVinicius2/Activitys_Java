package questoes1_2_3;
import java.util.Scanner;

public class ValidadorSenha {
	/* Requisitos necessarios para senha ser válida:
	● No mínimo 8 caracteres.
	● Pelo menos 1 número.
	● Pelo menos 1 letra maiuscula.
	*/
	public boolean validar(String senha) {
        return senha.length() >= 8 &&
               senha.matches(".*\\d.*") &&
               senha.matches(".*[A-Z].*");
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	ValidadorSenha valida = new ValidadorSenha();
    	
    	System.out.print("Digite a senha para validar: ");
        String senha = sc.nextLine();
   
    	if (valida.validar(senha)) {
    		 System.out.println("Senha válida!");
    	}
        
    	else {
    		 System.out.println("Senha inválida! \n"
    				+ "Requisitos necessarios para senha ser válida:\n"
    		 		+ "	● No mínimo 8 caracteres.\n"
    		 		+ "	● Pelo menos 1 número.\n"
    		 		+ "	● Pelo menos 1 letra maiuscula.");
    	}	
    	sc.close();
    }
}