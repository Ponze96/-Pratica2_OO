package questao1;
import java.util.Scanner;
public class Empresa {

	public static void main(String[] args) {
		float preco;
		int qtde;
		String nome; 
		
	
		Estoque e1 = new Estoque("caneta", 100,20);
		System.out.println(e1.mostra());
		e1.darBaixaEstoque(10);
		System.out.println(e1.mostra());
		

	}

}
