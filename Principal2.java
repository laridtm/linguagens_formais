import javax.swing.*;

public class Principal2 {

	//Controla o estado do AFD
	static int estado = 0;

	//Indice da letra da entrada
	static int i = 0;
	
	public static char proximoCaracter(String entrada) {
		char retorno = 0;
		if (	i < entrada.length()){
	  		retorno = entrada.charAt(i);
			i = i + 1;
		} 
		return retorno;		
	}

	public static int avaliaEstado0(String entrada){
		char avaliar = proximoCaracter(entrada);
		int retorno = -1;
		if (avaliar == 'a') {
			retorno = avaliaEstado1(entrada);
		} else {
			retorno = -1;
		}
		return retorno;		
	}
	public static int avaliaEstado1(String entrada){
		estado = 1;
		char avaliar = proximoCaracter(entrada);
		int retorno = -1;

		if (avaliar == 'b') {			
			retorno = avaliaEstado1(entrada);
		} else {
	
			if (avaliar == 'a') {				
			   	retorno = avaliaEstado2(entrada);					 
			} else {
				retorno = -1;
			}
		}
	
		return retorno;
	}

	public static int avaliaEstado2(String entrada){
		estado = 2;	
		System.out.println("I:" + i);		
		return 2;
	}

	public static void main(String args[]){
		String entrada = JOptionPane.showInputDialog("Digite uma palavra a ser avaliada:");
		// String entrada = args[0];

		//Avalia o estado inicial
		int avaliacao = avaliaEstado0(entrada);

		System.out.println("Avaliacao:" + avaliacao);
				
		//Verifica se chegou ao estado final			
		if (avaliacao == 2) {
			System.out.println("Entrada valida!");
		} else {
			System.out.println("Entrada invalida!");
		}					
	}
}
