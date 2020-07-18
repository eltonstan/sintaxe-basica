
public class TestaCondicional2 {
	
	public static void main(String[] args) {

		int idade = 16;
		int quantidadePessoas = 3;
		if (idade >= 18 || quantidadePessoas >= 2) {
			System.out.println("você pode entrar");
		} else {
			System.out.println("Infelizmente você não pode entrar");
		}
		
		int idade2 = 20;
		int quantidadePessoas2 = 1;
		if (idade2 >= 18 && quantidadePessoas2 >= 2) {
			System.out.println("você pode entrar");
		} else {
			System.out.println("Infelizmente você não pode entrar");
		}
		
		int idade3 = 20;
		boolean acompanhado = true;
		if (idade3 >= 18 && acompanhado) {
			System.out.println("você pode entrar");
		} else {
			System.out.println("Infelizmente você não pode entrar");
		}
		
		int idade4 = 20;
		int quantidadePessoas4 = 2;
		boolean acompanhado4 = quantidadePessoas4 > 1;
		if (idade4 >= 18 && acompanhado4) {
			System.out.println("você pode entrar");
		} else {
			System.out.println("Infelizmente você não pode entrar");
		}

	}
}
