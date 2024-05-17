package br.com.fiap.aplicacao;

import java.util.Scanner;

import br.com.fiap.model.FilaVenda;
import br.com.fiap.model.VendaProduto;

public class AplicacaoTestes {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		FilaVenda relatorio = new FilaVenda();

		// atributos para o objeto
		int idProduto, idCliente, idConsultora, qtd;
		double preco, precoTotal;
		String nomeConsultora, nomeCliente, nomeProduto;
		// atributos auxiliares para os loops
		int loop = 1;
		String continuar = " ";
		double rendaTotal = 0;

		// Informando o nome e o Id da consutora, como se fosse um login inicial
		System.out.println("Olá, Sou o chatBot da Natura para auxiliar você em sua jornada com seus pedidos.");
		System.out.println("Mas para isso eu preciso conhecer melhor voçê.");
		System.out.print("Qual o seu nome?");
		nomeConsultora = teclado.nextLine();

		System.out.print("Agora eu quero saber seu ID de Consultora");
		idConsultora = teclado.nextInt();

		System.out.println("\nPronto, vamos começar a fazer seus pedidos!!");

		do {
			teclado.nextLine();
			System.out.print(nomeConsultora + ", informe o nome da cliente:");
			nomeCliente = teclado.nextLine();

			System.out.print("informe o código da cliente: ");
			idCliente = teclado.nextInt();

			System.out.print("Agora diga-me primeiro o código do produto");
			idProduto = teclado.nextInt();

			teclado.nextLine();
			System.out.print("Qual o nome desse produto: ");
			nomeProduto = teclado.nextLine();

			System.out.print("Quantos " + nomeProduto + " o cliente " + nomeCliente + " comprou?");
			qtd = teclado.nextInt();

			System.out.print("Qual o preço da unidade do " + nomeProduto);
			preco = teclado.nextDouble();

			precoTotal = preco * qtd;

			VendaProduto produto = new VendaProduto(idProduto, nomeProduto, qtd, precoTotal, idCliente, nomeCliente);

			relatorio.enqueue(produto);
			teclado.nextLine();
			do {
			System.out.println(nomeConsultora + ", voçê deseja inserir mais pedidos? 1 -para sim e 0 -para não");
			loop = teclado.nextInt();
			}while(loop!= 0 && loop !=1);
		} while (loop != 0);

		System.out.println("Olá, " + nomeConsultora + " , esse foi o seu relatório do mês:");
		System.out.println("*******");
		do {
			VendaProduto venda = new VendaProduto();
			venda = relatorio.dequeue();
			venda.show();
			rendaTotal += venda.getValor();

		} while (!relatorio.isEmpty());
		System.out.println("Número total de pedidos: " + relatorio.getCont());
		System.out.println("Valor total recebido no mês: " + rendaTotal);
	}

}
