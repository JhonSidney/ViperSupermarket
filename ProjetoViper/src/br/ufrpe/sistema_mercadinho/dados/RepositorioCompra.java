
package br.ufrpe.sistema_mercadinho.dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import br.ufrpe.sistema_mercadinho.negocio.beans.Compra;

public class RepositorioCompra implements IRepositorioCompra, Serializable {

	public static final String NOME_ARQUIVO_BD = "compras.dat";
	
	private ArrayList<Compra> compras;
	public static RepositorioCompra instancia;

	private RepositorioCompra() {
		this.compras = new ArrayList<>();
	}

	public static RepositorioCompra getInstance() {

		if (instancia == null) {
			try {
				instancia = lerDoArquivo();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return instancia;
	}

	public static RepositorioCompra lerDoArquivo() throws IOException {

		RepositorioCompra instanciaLocal = null;
		File in = new File(NOME_ARQUIVO_BD);
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(in);
			ois = new ObjectInputStream(fis);
			Object o = ois.readObject();
			instanciaLocal = (RepositorioCompra) o;
		} catch (Exception e) {
			instanciaLocal = new RepositorioCompra();
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
		File out = new File(NOME_ARQUIVO_BD);
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
	public boolean cadastrar(Compra compra) {
		this.compras.add(compra);
		salvarArquivo();
		return true;
	}

	@Override
	public boolean atualizar(Compra compra) {
		int i = 0;
		for (Compra c : this.compras) {
			
			if (c.getCodigoPedido().equals(compra.getCodigoPedido())) {
				this.compras.set(i, compra);
				salvarArquivo();
				return true;
			}
			i++;
		}
		return false;
	}

	@Override
	public Compra procurar(String codigoPedido) {

		for (Compra c : this.compras) {

			if (c.getCodigoPedido().equals(codigoPedido)) {
				return c;
			}

		}

		return null;
	}

	@Override
	public ArrayList<Compra> listar() {
		return this.compras;
	}

	@Override
	public boolean remover(String codigoPedido) {

		int i = 0;
		for (Compra c : this.compras) {
			
			if (c.getCodigoPedido().equals(codigoPedido)) {
				this.compras.remove(i);
				salvarArquivo();
				return true;
			}
			i++;

		}

		return false;
	}

}