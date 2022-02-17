package imd.modelo;

public class ContaCorrente implements Tributavel{
	private String agencia;
	private String numero;
	private double saldo;
	
	public ContaCorrente() {}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(double valor) {
		if(valor > this.saldo)
			System.out.println("Valor insuficiente para saque na conta [" + this.numero + "]");
		else {
			this.saldo -= valor;
			System.out.println("Saque de " + valor + " em [" + this.numero + "] efetuado com sucesso!");
		}	
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("Deposito de " + valor + " em [" + this.numero + "] efetuado com sucesso!");
	}
	
	public boolean trasnfere(double valor, ContaCorrente conta) {
		if(valor > this.saldo) {
			System.out.println("Saldo insuficiente para tranferir");
			return false;
		}
		else {
			this.saldo -= valor;
			conta.depositar(valor);
			System.out.println("Transferido " + valor + " para [" + conta.getNumero() + "]");
			return true;
		}
	}
	
	@Override
	public double calculaTributos() {
		return 0.0038*this.saldo;
	}
}
