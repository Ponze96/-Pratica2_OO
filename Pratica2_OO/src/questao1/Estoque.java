package questao1;

public class Estoque {
	
             private String nome;
             private int qtdAtual;
             private int qtdMinima;
			
             public Estoque(String nome, int qtdAtual, int qtdMinima) {
			 this.nome = nome;
			 this.qtdAtual = qtdAtual;
			 this.qtdMinima = qtdMinima;
            }

			public String mostraNome() {
				return nome;
			}

			private void mostraNome(String nome) {
				this.nome = nome;
			}

			public int darBaixaQtdAtual() {
				return qtdAtual;
			}

			private void darBaixaQtdAtual(int qtdAtual) {
				this.qtdAtual = qtdAtual;
			}

			public int darBaixaQtdMinima() {
				return qtdMinima;
			}

			private void darBaixaQtdMinima(int qtdMinima) {
				this.qtdMinima = qtdMinima;
			}
			
			
				
				
				
				
				
			}
             
             
             
          
}

