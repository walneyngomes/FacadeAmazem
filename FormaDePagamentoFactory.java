package projetofacade;

public class FormaDePagamentoFactory  {
	public Pagamento gerarPagamentoPor(String tipo){
		Pagamento pagamento = null;
		if("boleto".equals(tipo)){
			pagamento= new PagamentoBoleto();
		}
		else if("cartao".equals(tipo)){
			pagamento = new PagamentoCartao();

		}
		return pagamento;
	}

}
