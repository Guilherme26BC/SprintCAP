package br.com.fiap.model;

public class FilaVenda {

	// atributos
	// NO
	private class NO {
		VendaProduto dados;
		NO prox;
	}

	// atributos auxiliares já iniciados
	NO ini = null, fim = null;
	int cont = 0;

	public boolean isEmpty() {
		return (ini == null && fim == null);
	}

	public void enqueue(VendaProduto vendaProduto) {
		NO novo = new NO();
		novo.dados = vendaProduto;
		novo.prox = null;
		if(isEmpty()) {
			ini = novo;
		}else {
			fim.prox = novo;			
		}
		fim = novo;
		cont++;
	}
	
	public VendaProduto dequeue() {
		VendaProduto produto = ini.dados;
		ini = ini.prox;
		if(ini==null) {
			fim=null;
		}
		return produto;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}
}
