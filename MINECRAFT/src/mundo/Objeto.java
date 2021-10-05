package mundo;



public class Objeto {
	
	public static void main(String[] args) {
		Bloco madeira = new Bloco();	
		System.out.println("Construindo um equipamento de madeira");
		madeira.textura = "Madeira";
		madeira.resistencia = 5;
		System.out.println("Bloco: Madeira");
		System.out.println("Quantos Blocos: " + madeira.resistencia);
		System.out.println("Qual a cor do Bloco: " + madeira.textura);
		madeira.mineirar();
		madeira.craftar();
		System.out.println("Equipamento construido!!!!");
		
		System.out.println("-----------------------------");
		
		Enxada terra = new Enxada();	
		System.out.println("Arando a terra");
		terra.textura = "terra";
		terra.resistencia = 5;
		terra.conquista = false;
		System.out.println("Bloco: terra");
		System.out.println("Quantos Blocos: " + terra.resistencia);
		System.out.println("Qual a cor do Bloco: " + terra.textura);
		
		terra.construir();
		if (terra.conquista == true) {
			terra.mineirar();
			System.out.println("Você arou essa terra, parabens conquista desbloqueada!!!!");			
	    } else {
	    	System.out.println("Você não arou essa terra, conquista não desbloqueada!!! ");
	    }
	    	
	}
	
}
