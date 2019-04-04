package projetofacade;

import java.util.ArrayList;

public class CarroDeCompras {
	ArrayList<Produto> produtos = new ArrayList<Produto>();
	Pagamento pagamento = null;

	public void addFormaPagamento(Pagamento pagamento) {
		pagamento.addValor(valorTotal());

	}

	public void addProduto(Produto produto) {
		produtos.add(produto);
	}

	public void removeProduto(Produto produto) {
		produtos.remove(produto);
	}

	public void informacaoProduto() {
		for (Produto p : produtos) {
			System.out.print(p);
		}
	}

	public int quantidadeProduto() {
		return produtos.size();
	}

	public double valorTotal() {
		double valor = 0.0;
		for (Produto p : produtos) {
			valor += p.getValor();

		}
		return valor;

	}

}
