package projetofacade;

public class FacadeAmazenParaibaOnline {
	CarroDeCompras compras;
	FormaDePagamentoFactory pagamento;

	public FacadeAmazenParaibaOnline() {
		this.compras = new CarroDeCompras();
		this.pagamento = new FormaDePagamentoFactory();
	}

	public void addProduto(Produto produto) {
		compras.addProduto(produto);
	}

	public void removerProduto(Produto produto) {
		compras.removeProduto(produto);

	}

	public void formaDePagamento(String tipo) {
		this.pagamento=pagamento.gerarPagamentoPor(tipo);
		
		
		
	}
	public double total(){
		return 
	}

}
