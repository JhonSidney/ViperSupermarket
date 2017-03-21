package br.ufrpe.sistema_mercadinho.negocio;

import br.ufrpe.sistema_mercadinho.dados.IRepositorioAdministrador;
import br.ufrpe.sistema_mercadinho.dados.IRepositorioFuncionario;
import br.ufrpe.sistema_mercadinho.dados.RepositorioAdministrador;
import br.ufrpe.sistema_mercadinho.dados.RepositorioFuncionario;
import br.ufrpe.sistema_mercadinho.exceptions.ErroDeNegocioException;
import br.ufrpe.sistema_mercadinho.negocio.beans.Administrador;
import br.ufrpe.sistema_mercadinho.negocio.beans.Funcionario;

public class ControladorLogin {

	private ControladorAdministrador administrador;
	private ControladorFuncionario funcionario;
	private static ControladorLogin instance;

	private ControladorLogin() {
		this.administrador = ControladorAdministrador.getInstance();
		this.funcionario = ControladorFuncionario.getInstance();
	}

	public static ControladorLogin getInstance() {
		if (instance == null) {
			instance = new ControladorLogin();
		}
		return instance;
	}

	public int efetuarLogin(String cpf, String senha) throws ErroDeNegocioException {

		int igual = 0;
		Administrador administrador = this.administrador.procurar(cpf);
		Funcionario funcionario = this.funcionario.procurar(cpf);

		if(administrador == null && funcionario == null){
			throw new ErroDeNegocioException(" Usuario não existe! ");
		}else if (administrador != null && administrador.getSenha().equals(senha)) {
			igual = 1;
		} else if (funcionario != null && funcionario.getSenha().equals(senha)) {
			igual = -1;
		}else {
			throw new ErroDeNegocioException("senha invalida!");
		}
		
		return igual;
	}

}
