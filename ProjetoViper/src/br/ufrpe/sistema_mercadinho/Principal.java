package br.ufrpe.sistema_mercadinho;

import java.util.Scanner;

import br.ufrpe.sistema_mercadinho.exceptions.ErroDeNegocioException;
import br.ufrpe.sistema_mercadinho.negocio.SistemaMercadinho;
import br.ufrpe.sistema_mercadinho.negocio.beans.Administrador;
import br.ufrpe.sistema_mercadinho.negocio.beans.Compra;
import br.ufrpe.sistema_mercadinho.negocio.beans.Endereco;
import br.ufrpe.sistema_mercadinho.negocio.beans.Fornecedor;
import br.ufrpe.sistema_mercadinho.negocio.beans.Funcionario;
import br.ufrpe.sistema_mercadinho.negocio.beans.Item;
import br.ufrpe.sistema_mercadinho.negocio.beans.Venda;

public class Principal {

	public static void main(String[] args) {
		SistemaMercadinho fachada = SistemaMercadinho.getInstance();
		Administrador administrador = null;
		Fornecedor fornecedor = null;
		Funcionario funcionario = null;
		Compra compra = null;
		Venda venda = null;
		Item item = null;
		Endereco endereco = null;
		double salario, precoCusto, precoVenda, pesoProduto;
		int quantidade;
		String telefone = null, email = null, nome, cpf = "09898483434", rg = null, dataEmissao = null, orgaoEmissao = null,
				sexo = null, estadoCivil = null, nacionalidade = null, naturalidade = null, senha = null, funcao = null,
				admissao = null, demissao = null, nomeFantasia = null, razaoSocial = null, cnpj = null,
				inscricaoEstadual = null, codigoProduto = null, nomeProduto = null, descricao = null, categoria = null,
				logradouro = null, bairro = null, cep = null, numero = null, complemento = null, cidade = null,
				estado = null;
		int opcao =0;
		Scanner in = new Scanner(System.in);
		
		
		do{
		System.out.println("------------------------------");
		System.out.println("   SISTEMA VIPER SUPERMARKET  ");
		System.out.println("------------------------------");
		System.out.println("1 - CADASTRAR                 ");
		System.out.println("2 - ATUALIZAR                 ");
		System.out.println("3 - BUSCAR                    ");
		System.out.println("4 - REMOVER                   ");
		System.out.println("5 - listar                    ");
		System.out.println("------------------------------");

		opcao = in.nextInt();

		
			switch (opcao) {
			case 1:
				System.out.println("------------------------------");
				System.out.println("1 - CADASTRAR ADMINISTRADOR   ");
				System.out.println("2  -CADASTRAR FUNCIONARIO     ");
				System.out.println("3 - CADASTRAR FORNECEDOR      ");
				System.out.println("4 - CADASTRAR COMPRA          ");
				System.out.println("5 - CADASTRAR VENDA           ");
				System.out.println("6 - CADASTRAR ITEM(PRODUTO)   ");
				System.out.println("7- SAIR                       ");
				System.out.println("------------------------------");
				opcao = in.nextInt();
				switch (opcao) {
				case 1:
					System.out.println("voce entrou em cadastro adm");
					try {
						
						System.out.println("Cpf: ");
						cpf = in.nextLine();
						in.next();
						System.out.println("nome: ");
						nome = in.nextLine();
						in.next();
						System.out.println("Sexo: ");
						sexo = in.nextLine();
						in.next();
						System.out.println("Telefone: ");
						telefone = in.nextLine();
						in.next();
						System.out.println("Email: ");
						email = in.nextLine();
						in.next();
						System.out.println("Bairro: ");
						bairro = in.nextLine();
						in.next();
						System.out.println("Cep: ");
						cep = in.nextLine();
						in.next();
						System.out.println("Numero: ");
						numero = in.nextLine();
						in.next();
						System.out.println("Estado: ");
						estado = in.nextLine();
						in.next();
						System.out.println("Cidade: ");
						cidade = in.nextLine();
						in.next();
						System.out.println("Complemento: ");
						complemento = in.nextLine();
						in.next();
						System.out.println("Logradouro");
						logradouro = in.nextLine();
						in.next();
						System.out.println("Rg: ");
						rg = in.nextLine();
						in.next();
						System.out.println("Data Emissao: ");
						dataEmissao = in.nextLine();
						in.next();
						System.out.println("orgão Emissor: ");
						orgaoEmissao = in.nextLine();
						in.next();
						System.out.println("Nacionalidade: ");
						nacionalidade = in.nextLine();
						in.next();
						System.out.println("Naturalidade: ");
						naturalidade = in.nextLine();
						in.next();
						System.out.println("Senha: ");
						senha = in.nextLine();
						in.next();
						endereco = new Endereco(logradouro, bairro, cep, numero, complemento, cidade, estado);
						administrador = new Administrador(telefone, email, endereco, nomeProduto, cpf, rg, dataEmissao,
								orgaoEmissao, sexo, estadoCivil, nacionalidade, naturalidade, senha);
						fachada.cadastrarAdministrador(administrador);
					} catch (ErroDeNegocioException e) {
						System.out.println(e.getMessage());
					}
					break;
				default:
					System.out.println("opcao invalida !");

				}

				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
					for (Administrador a : fachada.listarAdministrador()) {
					  System.out.println(a.toString());
					}
				break;
			default:
				System.out.println("opcao invalida !");

			}
		}while(opcao <7);
		 
	}

}
