package br.com.fiap.model;

import java.util.Date;

public class VendaProduto {

	//Atributos

		private int idVenda = 0, idProduto;
		private String nomeProduto;
		private int quantidade;
		private double valor;
		private int idCliente;
		private String nomeCliente;
		private Date data;
		
		
		
		public VendaProduto( int idProduto, String nomeProduto, int quantidade, double valor, int idCliente,
				String nomeCliente) {
			this.idVenda++;
			this.idProduto = idProduto;
			this.nomeProduto = nomeProduto;
			this.quantidade = quantidade;
			this.valor = valor;
			this.idCliente = idCliente;
			this.nomeCliente = nomeCliente;
			this.data = new Date(System.currentTimeMillis());
		}
		
		
		public VendaProduto() {
		}

		public int getIdVenda() {
			return idVenda;
		}
		public void setIdVenda(int idVenda) {
			this.idVenda = idVenda;
		}
		public int getIdCliente() {
			return idCliente;
		}
		public void setIdCliente(int idCliente) {
			this.idCliente = idCliente;
		}
		public int getIdProduto() {
			return idProduto;
		}
		public void setIdProduto(int idProduto) {
			this.idProduto = idProduto;
		}
		public int getQuantidade() {
			return quantidade;
		}
		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}
		public double getValor() {
			return valor;
		}
		public void setValor(double valor) {
			this.valor = valor;
		}
		public String getNomeProduto() {
			return nomeProduto;
		}
		public void setNomeProduto(String nomeProduto) {
			this.nomeProduto = nomeProduto;
		}
		public String getNomeCliente() {
			return nomeCliente;
		}
		public void setNomeCliente(String nomeCliente) {
			this.nomeCliente = nomeCliente;
		}
		public Date getData() {
			return data;
		}
		public void setData(Date data) {
			this.data = data;
		}
		
	public void show() {
		System.out.println("Código do pedido: " + this.idVenda + " ; Produto: " +this.nomeProduto  + ", cód " + this.idProduto);
		System.out.println("Quantidade: " + this.quantidade + " preço: R$" + this.valor);
		System.out.println("Cliente: " + this.idCliente + " " + this.nomeCliente );
		System.out.println("Data: " + this.data);
		System.out.println(" ");
	}
		
		
}
