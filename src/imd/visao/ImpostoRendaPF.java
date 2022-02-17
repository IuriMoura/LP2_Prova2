package imd.visao;

import imd.controle.PessoaDAO;
import imd.modelo.ContaCorrente;
import imd.modelo.Pessoa;
import imd.modelo.SeguroVida;

public class ImpostoRendaPF {

	public static void main(String[] args) {
		PessoaDAO dao = new PessoaDAO();
		
		ContaCorrente roberto1 = new ContaCorrente();
		ContaCorrente dom1 = new ContaCorrente();
		ContaCorrente rui1 = new ContaCorrente();
		ContaCorrente carla1 = new ContaCorrente();
		ContaCorrente sara1 = new ContaCorrente();
		
		roberto1.setAgencia("001");
		roberto1.setNumero("123.456-01");
		roberto1.setSaldo(2000);
		
		dom1.setAgencia("001");
		dom1.setNumero("786.297-32");
		dom1.setSaldo(3000);
		
		rui1.setAgencia("001");
		rui1.setNumero("023.345-23");
		rui1.setSaldo(300);
		
		carla1.setAgencia("001");
		carla1.setNumero("875.986-32");
		carla1.setSaldo(700);
		
		sara1.setAgencia("001");
		sara1.setNumero("936.462-19");
		sara1.setSaldo(7000);
		
		SeguroVida roberto2 = new SeguroVida();
		SeguroVida dom2 = new SeguroVida();
		SeguroVida rui2 = new SeguroVida();
		SeguroVida carla2 = new SeguroVida();
		SeguroVida sara2 = new SeguroVida();
		
		roberto2.setBeneficiado("Jose");
		roberto2.setNumero(01);
		roberto2.setValor(5000);
		
		dom2.setBeneficiado("joao");
		dom2.setNumero(02);
		dom2.setValor(5000);
		
		rui2.setBeneficiado("pricila");
		rui2.setNumero(03);
		rui2.setValor(5000);
		
		carla2.setBeneficiado("ze");
		carla2.setNumero(04);
		carla2.setValor(5000);
		
		sara2.setBeneficiado("maria");
		sara2.setNumero(05);
		sara2.setValor(5000);
		
		Pessoa roberto = new Pessoa();
		Pessoa dom = new Pessoa();
		Pessoa rui = new Pessoa();
		Pessoa carla = new Pessoa();
		Pessoa sara = new Pessoa();
		
		roberto.setNome("Roberto");
		roberto.setSalario(1000);
		roberto.setConta(roberto1);
		roberto.setSeguro(roberto2);
		
		dom.setNome("dom");
		dom.setSalario(2000);
		dom.setConta(dom1);
		dom.setSeguro(dom2);
		
		rui.setNome("rui");
		rui.setSalario(1100);
		rui.setConta(rui1);
		rui.setSeguro(rui2);
		
		carla.setNome("carla");
		carla.setSalario(5000);
		carla.setConta(carla1);
		carla.setSeguro(carla2);
		
		sara.setNome("sara");
		sara.setSalario(3000);
		sara.setConta(sara1);
		sara.setSeguro(sara2);
		
		dao.cadastraPessoa(roberto);
		dao.cadastraPessoa(sara);
		dao.cadastraPessoa(dom);
		dao.cadastraPessoa(rui);
		dao.cadastraPessoa(carla);
		
		dao.listaPessoas();
		dao.calcularTributosPessoas();
	}

}
