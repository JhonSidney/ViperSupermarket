package br.ufrpe.sistema_mercadinho.negocio.beans;

import java.io.Serializable;

public class Item implements Serializable {
	private String codigoProduto;
	private String nomeProduto;
	private int quantidade;
	private String descricao;
	private String categoria;
	private double precoCusto;
	private double precoVenda;
	private double pesoProduto;
	

	public Item(String codigoProduto, String nomeProduto, int quantidade,
			String descricao, String categoria, double precoCusto,
			double precoVenda, double pesoProduto) {

		this.setCodigoProduto(codigoProduto);
		this.setnomeProduto(nomeProduto);
		this.setDescricao(descricao);
		this.setCategoria(categoria);
		this.setPrecoCusto(precoCusto);
		this.setPrecoVenda(precoVenda);
		this.setPesoProduto(pesoProduto);
		this.setQuantidade(quantidade);
	}

	public String getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getnomeProduto() {
		return nomeProduto;
	}

	public void setnomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public double getPesoProduto() {
		return pesoProduto;
	}

	public void setPesoProduto(double pesoProduto) {
		this.pesoProduto = pesoProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public boolean equals(Object o) {
		boolean igual = false;
		if (((Item) o).getCodigoProduto().equals(this.getCodigoProduto())) {
			igual = true;
		}
		return igual;
	}

	public String toString() {
		return "Item [codigoProduto=" + codigoProduto + ", nomeProduto=" + nomeProduto
				+ ", quantidade=" + quantidade + ", descricao=" + descricao
				+ ", categoria=" + categoria + ", precoCusto=" + precoCusto
				+ ", precoVenda=" + precoVenda + ", pesoProduto=" + pesoProduto
				+ "]";
	}
}
