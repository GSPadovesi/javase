package seguros;
/**
 * @author gabriel.spadovesi
 */
import contas.Conta;

public class SeguroPessoaFisica extends Conta{
	/**
	 * Conta corrente 3
	 * @param args
	 */

		 public static void main(String[] args){
			
			SeguroPessoaFisica cc3 = new SeguroPessoaFisica();
			cc3.setCliente("Gabriel Santana");
			cc3.setSaldo(1000);
			System.out.println("Cliente: " + cc3.getCliente());
			cc3.exibirSaldo();
			cc3.sacar(500);
			cc3.exibirSaldo();
			cc3.depositar(250);
			cc3.exibirSaldo();
}
	}

