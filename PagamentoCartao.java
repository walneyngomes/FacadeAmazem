package projetofacade;

public class PagamentoCartao extends Pagamento {

	private static final double JUROS = 1.23;

	@Override
	public void formaDePagamento() {
		// TODO Auto-generated method stub
		System.out.print("Cartao");
	}

	@Override
	public void addValor(double pagamento) {
		// TODO Auto-generated method stub
		System.out.print(pagamento * JUROS);
	}

}
