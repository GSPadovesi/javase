/**
 * POO2 - Encapsulamento
 * @author gabriel.spadovesi
 */
package contas;

public class Conta {
	// encapsulamento
	private double saldo;
	private String cliente;

	/**
	 * obter o saldo
	 * 
	 * @return saldo
	 */

	public double getSaldo() {
		return saldo;
		/**
		 * Atribuir um valor a variavel saldo
		 * 
		 * @param saldo
		 */
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * obter o nome do cliente
	 * 
	 * @return cliente
	 */
	public String getCliente() {
		return cliente;
	}

	/**
	 * Atribuir um valor a
	 * 
	 * @param cliente
	 */
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Conta() {
		// super();
		System.out.println("Agência 0261");
	}

	/**
	 * exibir o saldo da conta()
	 */

	protected void exibirSaldo() {
		System.out.println("Saldo: R$" + saldo);
	}

	/**
	 * Sacar um valor da conta
	 * 
	 * @param valor
	 */
	protected void sacar(double valor) {
		saldo -= valor;
		System.out.println("Débito: " + valor);
	}

	/**
	 * depositar um valor na conta
	 * 
	 * @param valor
	 */
	protected void depositar(double valor) {
		saldo += valor;
		System.out.println("Depositado: " + valor);
	}
	protected void transferir(Conta destino, double valor) {
		   this.sacar(valor);
		   destino.depositar(valor);
		   System.out.println("Transferencia: R$" + valor);
	}
	
}
