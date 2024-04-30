package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import herancaepolimorfismo.Produto;
import herancaepolimorfismo.ProdutoUsado;
import herancaepolimorfismo.ProdutoImportado;

public class ProdutosProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		List<Produto> lista = new ArrayList<>();
		
		System.out.print("Digite a quantidade de produtos: ");
		int n = scanner.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Dados do Produto #" + i);
			System.out.print("Comum, usado ou importado (c/u/i)? ");
			char tipo = scanner.next().charAt(0);
			System.out.print("Nome: ");
			scanner.nextLine();
			String nome = scanner.nextLine();
			System.out.print("Preço: ");
			double preco = scanner.nextDouble();
			
			if (tipo == 'u') {
				System.out.print("Data de Fabricação (DD/MMM/YYYY): ");
				LocalDate dataFabricacao = LocalDate.parse(scanner.next(), formatoData);
				lista.add(new ProdutoUsado(nome, preco, dataFabricacao));
		
			} else if (tipo == 'i') {
				System.out.print("Taxa de Alfândega: ");
				double taxaAlfandega = scanner.nextDouble();
				lista.add(new ProdutoImportado(nome, preco, taxaAlfandega));
				
			} else {
				lista.add(new Produto(nome, preco));
				
			}
		}
		
		System.out.println("\n TAGS DE PREÇO: ");
		for (Produto produto: lista) {
			
			System.out.println(produto.tagPreco());
		}

	}

}
