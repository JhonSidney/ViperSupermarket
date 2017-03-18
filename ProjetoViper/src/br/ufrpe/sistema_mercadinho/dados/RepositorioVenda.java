package br.ufrpe.sistema_mercadinho.dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import br.ufrpe.sistema_mercadinho.negocio.beans.Venda;

public class RepositorioVenda implements IRepositorioVenda, Serializable {

	public static final String NOME_ARQUIVOS_BD = "vendas.dat";
	private ArrayList<Venda> vendas;
	public static RepositorioVenda instancia;

	private RepositorioVenda() {
		this.vendas = new ArrayList<>();
	}

	public static RepositorioVenda getInstance() {

		if (instancia == null) {
		  try{
			instancia = lerDoArquivo();
	     	} catch (IOException e){
	     		e.printStackTrace();
	     	}
		}
		return instancia;
	}

	public static RepositorioVenda lerDoArquivo() throws IOException {

		RepositorioVenda instanciaLocal = null;
		File in = new File(NOME_ARQUIVOS_BD);
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(in);
			ois = new ObjectInputStream(fis);
			Object o = ois.readObject();
			instanciaLocal = (RepositorioVenda) o;
		} catch (Exception e) {
			instanciaLocal = new RepositorioVenda();
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
	public boolean cadastrar(Venda venda) {
		this.vendas.add(venda);
		salvarArquivo();
		return true;
	}

	@Override
	public boolean atualizar(Venda venda) {
		int i = 0;
		for (Venda v : this.vendas) {
			
			if (v.getCodigoVenda().equals(venda.getCodigoVenda())) {
				this.vendas.set(i, venda);
				salvarArquivo();
				return true;
			}
			i++;
		}
		return false;
	}

	@Override
	public Venda procurar(String codigoVenda) {
		for (Venda v : this.vendas) {
			if (v.getCodigoVenda().equals(codigoVenda)) {
				return v;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Venda> listar() {
		return this.vendas;
	}

	@Override
	public boolean remover(String codigoVenda) {
		int i = 0;
		for (Venda v : this.vendas) {
			
			if (v.getCodigoVenda().equals(codigoVenda)) {
				this.vendas.remove(i);
				salvarArquivo();
				return true;
			}
			i++;
		}
		return false;
	}

}