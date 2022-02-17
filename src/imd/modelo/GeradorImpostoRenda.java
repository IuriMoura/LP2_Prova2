package imd.modelo;

public class GeradorImpostoRenda{
	private double totalTributo;
	
	public GeradorImpostoRenda() {}
	
	public double calculaValorTotalTributo(Pessoa p) {
		totalTributo = 0;
		totalTributo += p.calculaTributos();
		totalTributo += p.getConta().calculaTributos();
		totalTributo += p.getSeguro().calculaTributos();
		
		return this.totalTributo;
	}
}
