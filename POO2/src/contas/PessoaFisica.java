package contas;
/**
 * Contas
 * @param args
 */

public class PessoaFisica {

	/**
	 * Conta corrente 1
	 * @param args
	 */
	public static void main(String[] args) {
		Conta cc1 = new Conta();
		 cc1.setCliente("Henrique Moraes");
		 cc1.setSaldo(1100);
		 System.out.println("Cliente: " + cc1.getCliente());
		 cc1.exibirSaldo();
		 cc1.sacar(1000);
		 cc1.exibirSaldo();
		 cc1.depositar(1000);
		 cc1.exibirSaldo();
		 
		 System.out.println("-----------------------------------");
		 
		 /**
			 * Conta corrente 2
			 * @param args
			 */
		 
		 Conta cc2 = new Conta();
		 cc2.setCliente("Osvaldo Sandoli");
		 cc2.setSaldo(2000);
		 System.out.println("Cliente: " + cc2.getCliente());
		 cc2.exibirSaldo();
		 cc2.sacar(500);
		 cc2.exibirSaldo();
		 cc2.depositar(1000);
		 cc2.exibirSaldo();
		 
		 System.out.println("-----------------------------------");
		 /**
			 * Transferencia
			 * @param args
			 */
		 System.out.println("Transferencia");
		 System.out.println("");
		 System.out.println("Cliente: " + cc1.getCliente());
		 System.out.println("");
		 System.out.println("Favorecido: " + cc2.getCliente());
		 System.out.println("");
		 cc1.transferir(cc2, 150);
		 System.out.println("Cliente: " + cc1.getCliente());
		 cc1.exibirSaldo();
		 System.out.println("");
		 System.out.println("Favorecido: " + cc2.getCliente());
		 cc2.exibirSaldo();
		 
		 System.out.println("-----------------------------------");
		 
		 int i = 10;
		 System.out.println(i);
		 i+= 5;
		 System.out.println(i);
		 i-= 5;
		 System.out.println(i);
		
		 System.out.println("-----------------------------------"); 
		 
	}
}