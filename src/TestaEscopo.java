
public class TestaEscopo {
	
	public static void main(String[] args) {
		
		int idade = 20;
		int quantidadePessoas = 3;
		
		boolean acompanhado = false;
		if (quantidadePessoas >=2) {
			acompanhado = true;
		}
		
		if (idade >= 18 && acompanhado) {
			System.out.println("voc� pode entrar");
		} else {
			System.out.println("Infelizmente voc� n�o pode entrar");
		}
		
	}

}
