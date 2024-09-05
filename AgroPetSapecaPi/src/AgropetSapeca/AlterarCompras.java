package AgropetSapeca;

public class AlterarCompras {

	public static void main(String[] args) {
		CompraDAo dao = new CompraDAo();
		
		Compras co = new Compras();
		co.setNumero_do_pedido(null);
		co.setNota_fiscal(null);
		co.setForma_pagamento(null);
		co.setFrete(0);
		co.setPreco(0);
		co.setDataCompra(null);
		
		System.out.println(dao.alterar(co));

	}

}
