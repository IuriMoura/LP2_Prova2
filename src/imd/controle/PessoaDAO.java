package imd.controle;

import java.util.ArrayList;
import imd.modelo.Pessoa;
import imd.modelo.GeradorImpostoRenda;

public class PessoaDAO {
	private ArrayList<Pessoa> pessoas;
	
	public PessoaDAO() {
		this.pessoas = new ArrayList<Pessoa>();
	}
	
	public void cadastraPessoa(Pessoa pessoa) {
		this.pessoas.add(pessoa);
	}
	
	public void listaPessoas(){
		System.out.println("######################################################");
		for(Pessoa a : this.pessoas) {
			System.out.println("Nome: " + a.getNome() + "       Salario: " + a.getSalario());
			System.out.println("Agencia: " + a.getConta().getAgencia() + " Conta: " + 
			a.getConta().getNumero() + "      Saldo: " + a.getConta().getSaldo());
			System.out.println("Seguro: " + a.getSeguro().getNumero() + " Beneficiario: " + 
			a.getSeguro().getBeneficiado());
			System.out.println("######################################################");
		}
	}
	
	public void calcularTributosPessoas() {
		GeradorImpostoRenda GRV = new GeradorImpostoRenda();
		
		System.out.println("######################################################");
		for(Pessoa a : this.pessoas) {
			System.out.println("Nome: " + a.getNome() + " IRPF: " + GRV.calculaValorTotalTributo(a));
			System.out.println("######################################################");
		}
		
	}
}
