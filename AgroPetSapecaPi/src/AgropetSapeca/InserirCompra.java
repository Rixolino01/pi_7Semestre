package AgropetSapeca;

public class InserirCompra {

	public static void main(String[] args) {
		CompraDAo dao = new CompraDAo();
		
		Compras co = new Compras();
		co.setNumero_do_pedido("0002");
		co.setNota_fiscal("56458");
		co.setForma_pagamento("30 dias");
		co.setFrete(55.00);
		co.setPreco(289.00);
		co.setDataCompra("15/12/2022");		
		
		System.out.println(dao.inserir(co));

	}

}
