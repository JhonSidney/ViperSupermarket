package br.ufrpe.sistema_mercadinho.negocio.beans;

public class ItemVenda{
	private int quantidadeItem;
	private Item item;
	private double valor;
	
	public ItemVenda(int quantidadeItem, Item item, double valor) {
		this.setQuantidadeItem(quantidadeItem);
		this.setItem(item);
		this.setValor(valor);
	}
	public int getQuantidadeItem() {
		return quantidadeItem;
	}
	public void setQuantidadeItem(int quantidadeItem) {
		this.quantidadeItem = quantidadeItem;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	
	
	
}
