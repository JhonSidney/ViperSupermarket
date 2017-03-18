package br.ufrpe.sistema_mercadinho.dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import br.ufrpe.sistema_mercadinho.negocio.beans.Item;

public class RepositorioItem implements IRepositorioItem, Serializable {

	// ATRIBUTOS
	public static final String NOME_ARQUIVOS_BD = "itens.dat";
	private ArrayList<Item> itens;
	public static RepositorioItem instancia;

	private RepositorioItem() {
		this.itens = new ArrayList<Item>();
	}

	public static RepositorioItem getInstance() {

		if (instancia == null) {
			try{
				instancia =lerDoArquivo();
			} catch (IOException e){
				e.printStackTrace();
			}
		}
		return instancia;
	}

	public static RepositorioItem lerDoArquivo() throws IOException {

		RepositorioItem instanciaLocal = null;
		File in = new File(NOME_ARQUIVOS_BD);
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(in);
			ois = new ObjectInputStream(fis);
			Object o = ois.readObject();
			instanciaLocal = (RepositorioItem) o;
		} catch (Exception e) {
			instanciaLocal = new RepositorioItem();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					/* Silence exception */
				}
			}
		}
		return instanciaLocal;
	}

	public void salvarArquivo() {
		if (instancia == null) {
			return;
		}
		File out = new File(NOME_ARQUIVOS_BD);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(out);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(instancia);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					/* Silent */}
			}
		}
	}

	@Override
	public boolean cadastrar(Item item) {
		this.itens.add(item);
		salvarArquivo();
		return true;
	}

	@Override
	public boolean atualizar(Item item) {

		int i = 0;
		for (Item a : this.itens) {
			
			if (a.getCodigoProduto().equals(item.getCodigoProduto())) {
				this.itens.set(i, item);
				salvarArquivo();
				return true;
			}
			i++;
		}
		return false;
	}

	@Override
	public Item procurar(String codigoProduto) {
		for (Item a : this.itens) {
			if (a.getCodigoProduto().equals(codigoProduto)) {
				return a;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Item> listar() {
		return this.itens;
	}

	@Override
	public boolean remover(String codigoProduto) {
		int i = 0;
		for (Item a : this.itens) {
			
			if (a.getCodigoProduto().equals(codigoProduto)) {
				this.itens.remove(i);
				salvarArquivo();
				return true;
			}
			i++;
		}
		return false;
	}
}