package br.ufrpe.sistema_mercadinho;

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

	public static void criarDados() {
		SistemaMercadinho fachada = SistemaMercadinho.getInstance();
		Endereco enderecoAdm = new Endereco("Rua Joaqim da silva", "centro", "54700-000", "32", null, "Recife",
				"Pernambuco");
		Administrador admin = new Administrador("8787-6756", "admin@gmail.com", enderecoAdm, "Carlos Eduardo",
				"123.456.789-81", "1234321", "01/01/2016", "12/01/2017", "M", "solteiro", "brasilira", "Recife", "123456789");
		Endereco endereco = new Endereco("Rua Joaqim da silva", "centro", "54500-000", "32", null, "Recife",
				"Pernambuco");
		Fornecedor fornecedor = new Fornecedor("Carretas Speed", "Carretas s/a", "08.471.877/0001-72", "001213923",
				endereco);

		Item item = new Item("7898921403153", "margarina itaé", 100, "gordura vegetal", "mercearia", 3.4, 5.6, 0.23);

		Funcionario funcionario = new Funcionario("86680516", "jhon.sidney@gmail.com", endereco, "jhon sidney",
				"096906474-82", "8123456", "12/01/2010", "SDS", "M", "solteiro", "brasileira", "recife", "12345678");

		Compra compra = new Compra("010169", "01", "12/02/03", fornecedor, "dinheiro", 10, item);

		Venda venda = new Venda("0034", funcionario, "12/08/2016", 20, 25, 0, 5, item);

		try {
			fachada.cadastrarAdministrador(admin);

		} catch (ErroDeNegocioException e) {
			System.out.println(e.getMessage());
		}

		try {
			fachada.cadastrarCompra(compra);

		} catch (ErroDeNegocioException e) {
			System.out.println(e.getMessage());
		}

		try {
			fachada.cadastrarFornecedor(fornecedor);
		} catch (ErroDeNegocioException e) {
			System.out.println(e.getMessage());
		}

		try {
			fachada.cadastrarFuncionario(funcionario);
		} catch (ErroDeNegocioException e) {
			System.out.println(e.getMessage());
		}

		try {
			fachada.cadastrarItem(item);
		} catch (ErroDeNegocioException e) {
			System.out.println(e.getMessage());
		}
		try {
			fachada.cadastrarVenda(venda);
		} catch (ErroDeNegocioException e) {
			System.out.println(e.getMessage());
		}

	}

	
public static void atualizarDados(){
		
		SistemaMercadinho fachada = SistemaMercadinho.getInstance();

		Endereco enderecoAdm = new Endereco("rua da ufrpe", "centro", "54700-000", "33", null, "Recife",
				"Pernambuco");
		Administrador admin = new Administrador("9912-6471", "admin@gmail.com", enderecoAdm, "maria eduarda ",
				"123.456.789-81", "1.234.321", "03/03/2016", "12/01/2017", "M", "solteiro", "brasilira", "Recife", "senha@123");
		Endereco endereco = new Endereco("Rua da mangueira", "camela", "54500-000", "32", null, "ipojuca",
				"Pernambuco");
		Fornecedor fornecedor = new Fornecedor(" Mercadinho frigobox ", "Carretas do brasil s/a ", "08.471.877/0001-72", "02.232.3355-6",
				endereco);

		Item item = new Item("7898921403153", "nescafé sao bras", 100, "bebida", "mercearia", 7,7, 10);

		Funcionario funcionario = new Funcionario("87604490", "joselma.sidney@gmail.com", endereco, "sidney josue",
				"096906474-82", "8123456", "12/01/2010", "SDS", "M", "solteiro", "brasileiro", "recife", "12345678");

		Compra compra = new Compra("010169", "2", "12/02/03", fornecedor, "cartao", 10, item);

		Venda venda = new Venda("0034", funcionario, "12/08/2016", 15, 10, 0, 5, item);
		
		try {
			fachada.atualizarAdministrador(admin);
			
		} catch (ErroDeNegocioException e) {
			System.out.println(e.getMessage());
		}

		try {
			fachada.atualizarCompra(compra);;

		} catch (ErroDeNegocioException e) {
			System.out.println(e.getMessage());
		}

		try {
			fachada.atualizarFornecedor(fornecedor);
			
		} catch (ErroDeNegocioException e) {
			System.out.println(e.getMessage());
		}

		try {
			fachada.atualizarFuncionario(funcionario);
		} catch (ErroDeNegocioException e) {
			System.out.println(e.getMessage());
		}

		try {
			fachada.atualizarItem(item);
			
		} catch (ErroDeNegocioException e) {
			System.out.println(e.getMessage());
		}
		try {
			fachada.atualizarVenda(venda);
		} catch (ErroDeNegocioException e) {
			System.out.println(e.getMessage());
		}

		
	}
	

public  static void buscarDados(){
	
	SistemaMercadinho fachada = SistemaMercadinho.getInstance();
	try {
		String cpf="123.456.789-81";
		fachada.procurarAdministrador(cpf);
		
	} catch (ErroDeNegocioException e) {
		System.out.println(e.getMessage());
	}

	try {
		String codigoPedido="010169";
		fachada.procurarCompra(codigoPedido);
	} catch (ErroDeNegocioException e) {
		System.out.println(e.getMessage());
	}

	try {
	    String cnpj="08.471.877/0001-72";
		fachada.procurarFornecedor(cnpj);
		
	} catch (ErroDeNegocioException e) {
		System.out.println(e.getMessage());
	}

	try {
		String cpf="096906474-82";
		fachada.procurarFuncionario(cpf);
	} catch (ErroDeNegocioException e) {
		System.out.println(e.getMessage());
	}

	try {
		String codigoProduto= "7898921403153";
		fachada.procurarItem(codigoProduto);
		
	} catch (ErroDeNegocioException e) {
		System.out.println(e.getMessage());
	}
	try {
		String codigoVenda = "0034";
		fachada.procurarVenda(codigoVenda);
	} catch (ErroDeNegocioException e) {
		System.out.println(e.getMessage());
	}
	
}

public static void removerDados(){
	SistemaMercadinho fachada = SistemaMercadinho.getInstance();

	Endereco enderecoAdm = new Endereco("rua da ufrpe", "centro", "54700-000", "33", null, "Recife",
			"Pernambuco");
	Administrador admin = new Administrador("9912-6471", "admin@gmail.com", enderecoAdm, "maria eduarda ",
			"123.456.789-81", "1.234.321", "03/03/2016", "12/01/2017", "M", "solteiro", "brasilira", "Recife", "senha@123");
	Endereco endereco = new Endereco("Rua da mangueira", "camela", "54500-000", "32", null, "ipojuca",
			"Pernambuco");
	Fornecedor fornecedor = new Fornecedor(" Mercadinho frigobox ", "Carretas do brasil s/a ", "08.471.877/0001-72", "02.232.3355-6",
			endereco);

	Item item = new Item("7898921403153", "nescafé sao bras", 100, "bebida", "mercearia", 7,7, 10);

	Funcionario funcionario = new Funcionario("87604490", "joselma.sidney@gmail.com", endereco, "sidney josue",
			"096906474-82", "8123456", "12/01/2010", "SDS", "M", "solteiro", "brasileiro", "recife", "12345678");

	Compra compra = new Compra("010169", "2", "12/02/03", fornecedor, "cartao", 10, item);

	Venda venda = new Venda("0034", funcionario, "12/08/2016", 15, 10, 0, 5, item);
	
	try {
		//String cpf;
		fachada.removerAdministrador(admin.getCpf());
		
	} catch (ErroDeNegocioException e) {
		System.out.println(e.getMessage());
	}

	try {
		//String codigoPedido;
		fachada.removerCompras(compra.getCodigoPedido());

	} catch (ErroDeNegocioException e) {
		System.out.println(e.getMessage());
	}

	try {
	//	String cnpj;
		fachada.removerFornecedor(fornecedor.getCnpj());
		
	} catch (ErroDeNegocioException e) {
		System.out.println(e.getMessage());
	}

	try {
		//String cpf;
		fachada.removerFuncionario(funcionario.getCpf());
	} catch (ErroDeNegocioException e) {
		System.out.println(e.getMessage());
	}

	try {
		//String codigoProduto;
		fachada.removerItem(item.getCodigoProduto());
		
	} catch (ErroDeNegocioException e) {
		System.out.println(e.getMessage());
	}
	try {
		//String codigoVenda;
		fachada.removerVenda(venda.getCodigoVenda());
	} catch (ErroDeNegocioException e) {
		System.out.println(e.getMessage());
	}

	
}
	
	
public static void listarDados(){
	SistemaMercadinho fachada = SistemaMercadinho.getInstance();
	System.out.println("LISTANDO OS CADASTROS");
	for (Administrador a : fachada.listarAdministrador()) {
		System.out.println(a.toString());
	}
	for (Fornecedor a : fachada.listarFornecedor()) {
		System.out.println(a.toString());
	}

	for (Compra a : fachada.listarCompras()) {
		System.out.println(a.toString());
	}
	for (Item a : fachada.listarItem()) {
		System.out.println(a.toString());
	}

	for (Venda a : fachada.listarVenda()) {
		System.out.println(a.toString());
	}

	for (Funcionario a : fachada.listarFuncionario()) {
		System.out.println(a.toString());
	}
}

	public static void main(String[] args) {
		criarDados();
		
		listarDados();
		
		criarDados();
		
		atualizarDados();
		
	//	listarDados();
		
		//buscarDados();
		
		//listarDados();
		
		//removerDados();
		
	//	listarDados();
		
	}

}
