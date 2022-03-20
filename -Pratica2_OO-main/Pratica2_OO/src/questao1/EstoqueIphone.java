package questao1;
import java.util.Scanner;
public class EstoqueIphone {


	float preco;
	int qtde;
	String Iphone; 
		
	public EstoqueIphone(float preco, int qtde, String iphone) {
		super();
		this.preco = preco;
		this.qtde = qtde;
		Iphone = iphone;
	}
	
	void imprimirEstoque() {
		System.out.println("Nome do Produto: "+ Iphone);
		System.out.println("Valor do Produto: "+ preco);
		System.out.println("Qtde do Produto: "+ qtde);
	}

	void alteraPreco(float pc) {
		preco=pc;
	}

}

