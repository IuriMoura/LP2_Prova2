package imd.modelo;

public class Pessoa implements Tributavel{
	private String nome;
	private double salario;
	private ContaCorrente conta;
	private SeguroVida seguro;
	
	public Pessoa() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public ContaCorrente getConta() {
		return conta;
	}

	public void setConta(ContaCorrente conta) {
		this.conta = conta;
	}

	public SeguroVida getSeguro() {
		return this.seguro;
	}

	public void setSeguro(SeguroVida seguro) {
		this.seguro = seguro;
	}

	@Override
	public double calculaTributos() {
		return 0.11*salario;
	}
	
}
