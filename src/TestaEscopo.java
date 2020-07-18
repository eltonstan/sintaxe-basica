
public class TestaEscopo {
	
	public static void main(String[] args) {
		
		int idade = 20;
		int quantidadePessoas = 3;
		
		boolean acompanhado = false;
		if (quantidadePessoas >=2) {
			acompanhado = true;
		}
		
		if (idade >= 18 && acompanhado) {
			System.out.println("você pode entrar");
		} else {
			System.out.println("Infelizmente você não pode entrar");
		}
		
	}

}
