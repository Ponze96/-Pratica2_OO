package questao2;

public class Rendimento {
	private long rendimento;
	private long InvestimentoInicial;
	private long TaxaRendimento;
	private long NumeroMeses;
	private long saldo;
	private long calculaSaldo;
	
	
	public Rendimento(long rendimento, long investimentoInicial, long taxaRendimento, long numeroMeses, long saldo,
			long calculaSaldo) {
		super();
		this.rendimento = rendimento;
		InvestimentoInicial = investimentoInicial;
		TaxaRendimento = taxaRendimento;
		NumeroMeses = numeroMeses;
		this.saldo = saldo;
		this.calculaSaldo = calculaSaldo;
	}	
	
		public long getRendimento() {
			return rendimento;
		}
	
		public void setRendimento(long rendimento) {
			this.rendimento = rendimento;
		}
		
		public long getInvestimenoInicial() {
			return InvestimentoInicial;
			
		}
		
		public void setinvestimentoInicial(long investimenoInicial){
			this.InvestimentoInicial = InvestimentoInicial;
		}	
				
		public long getTaxaRendimeto() {
			return TaxaRendimento;
		}
		
		public void setTaxaRendimento(long TaxaRendimento) {
			this.TaxaRendimento = TaxaRendimento;
		}
		
		public long getnumeroMeses() {
			return NumeroMeses;
		}
		
		public void setnumeroMeses(long numeroMeses) {
			this.NumeroMeses = numeroMeses;
			
		}
		
		
		
		
		public long calculaSaldo() {
			return rendimento ();
			
		}
}

