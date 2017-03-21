package br.ufrpe.sistema_mercadinho.negocio;

import java.util.ArrayList;

import br.ufrpe.sistema_mercadinho.dados.RepositorioFuncionario;
import br.ufrpe.sistema_mercadinho.exceptions.*;
import br.ufrpe.sistema_mercadinho.negocio.beans.Funcionario;

public class ControladorFuncionario {

	private RepositorioFuncionario repositorioFuncionario;
	private static ControladorFuncionario instance;

	private ControladorFuncionario() {
		this.repositorioFuncionario = RepositorioFuncionario.getInstance();
	}

	public static ControladorFuncionario getInstance() {
		if (instance == null) {
			instance = new ControladorFuncionario();
		}
		return instance;
	}

	public void cadastrar(Funcionario funcionario) throws ErroDeNegocioException {
		if (funcionario != null && !this.existe(funcionario.getCpf())) {
			this.repositorioFuncionario.cadastrar(funcionario);
		} else {
			
		}
	}

	public void atualizar(Funcionario funcionario) throws ErroDeNegocioException {
		if (funcionario != null && this.existe(funcionario.getCpf())) {
			this.repositorioFuncionario.atualizar(funcionario);

		} else {
			throw new ErroDeNegocioException("Funcionario N�o Existe !");
		}
	}

	public Funcionario procurar(String cpf) throws ErroDeNegocioException {
		Funcionario resultado = this.repositorioFuncionario.procurar(cpf);
		return resultado;
	}

	public ArrayList<Funcionario> listar() {
		return this.repositorioFuncionario.listar();
	}

	private boolean existe(String cpf) {
		ArrayList<Funcionario> retorno = this.repositorioFuncionario.listar();
		for (Funcionario func : retorno) {
			if (func.getCpf().equals(cpf)) {
				return true;
			}
		}
		return false;
	}

	public void remover(String cpf) throws ErroDeNegocioException {
		Funcionario funcionario = this.repositorioFuncionario.procurar(cpf);

		if (funcionario != null) {
			this.repositorioFuncionario.remover(cpf);
		} else {
			throw new ErroDeNegocioException("Funcionario N�o Existe !");
		}
	}

}