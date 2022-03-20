package questao1;
import java.util.Scanner;
public class Estoque {
	
             private String nome;
             private int precisaRepor;
             private int mostra;
             private int estoquebaixa;
             private int estoque;
             private int qtdAtual;
             private int qtdMinima;
			            
	
			public Estoque(String nome, int precisaRepor, int mostra, int estoquebaixa, int estoque,
					int qtdAtual, int qtdMinima) {
				this.nome = nome;
				this.precisaRepor = precisaRepor;
				this.mostra = mostra;
				this.estoquebaixa = estoquebaixa;
				this.qtdAtual = qtdAtual;
				this.qtdMinima = qtdMinima;
			}
				
			
			public int mostraEstoque() {
				return this.estoque;
			}
			
			private void mostraEstoque (int estoque) {
				this.estoque = estoque;
			
			} 
			
			public String mostraNome() {
				return this.nome;
			}

			private void mostraNome(String nome) {
				this.nome = nome;
			}

			public int darBaixaQtdAtual() {
				return this.qtdAtual;
			}

			private void darBaixaQtdAtual(int qtdAtual) {
				this.qtdAtual = qtdAtual;
				
				
			}

			public int darBaixaQtdMinima() {
				return this.qtdMinima;
			}

			private void darBaixaQtdMinima(int qtdMinima) {
				this.qtdMinima = qtdMinima;
			} 
			
			public void darBaixaEstoque(int estoquebaixa){
				estoque=estoque-estoquebaixa;
			
			}
						
			public String mostra() {
				
				return "\n \nNome produto:" + this.nome+ "\nQuantidade atual:"
						+this.qtdAtual+ "\nQuantidade minima " +this.qtdMinima+ "\n \n";
			}	
									
			
			public boolean precisaRepor() {
				if (this.qtdAtual < this.qtdMinima)
					return true;
				else
					return false;				
			}
				
			
				
			}
             
          
          


