package br.ufrpe.sistema_mercadinho.gui;

import java.io.IOException;

import br.ufrpe.sistema_mercadinho.exceptions.ErroDeNegocioException;
import br.ufrpe.sistema_mercadinho.negocio.SistemaMercadinho;
import br.ufrpe.sistema_mercadinho.negocio.beans.Administrador;
import br.ufrpe.sistema_mercadinho.negocio.beans.Compra;
import br.ufrpe.sistema_mercadinho.negocio.beans.Endereco;
import br.ufrpe.sistema_mercadinho.negocio.beans.Fornecedor;
import br.ufrpe.sistema_mercadinho.negocio.beans.Funcionario;
import br.ufrpe.sistema_mercadinho.negocio.beans.Item;
import br.ufrpe.sistema_mercadinho.negocio.beans.Pessoa;
import br.ufrpe.sistema_mercadinho.negocio.beans.Venda;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Principal extends Application {
	private Pessoa acesso = null;
	private Stage primaryStage;
	private BorderPane rootLayout;
	private static Principal instancia;
	
	public static Principal getInstance() {
		if (instancia == null) {
			instancia = new Principal();
		}
		return instancia;
	}
	

	@Override
	public void start(Stage primaryStage) throws Exception {
		// criação do palco
		
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Viper Sistemas");// nome do sistema
		this.primaryStage.setResizable(false);

		initRootLayout();
		if (acesso == null) {
			showLogin();
		}
		

	}

	
	private void initRootLayout() {
		// TODO Auto-generated method stub
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Principal.class.getResource("RootLayout.fxml"));
			 rootLayout = (BorderPane) loader.load();

			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	public void showLogin() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Principal.class.getResource("/br/ufrpe/sistema_mercadinho/gui/TelaLogin.fxml"));
			AnchorPane Login = (AnchorPane) loader.load();

			rootLayout.setCenter(Login);
			TelaLoginController controller = loader.getController();
			controller.setPrincipal(this);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void backoffice() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Principal.class.getResource("/br/ufrpe/sistema_mercadinho/gui/Backoffice.fxml"));
			AnchorPane Login = (AnchorPane) loader.load();

			rootLayout.setCenter(Login);
			TelaLoginController controller = loader.getController();
			controller.setPrincipal(this);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void telaDeCadastro() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Principal.class.getResource("/br/ufrpe/sistema_mercadinho/gui/TelaDeCadastro.fxml"));
			AnchorPane Login = (AnchorPane) loader.load();

			rootLayout.setCenter(Login);
			TelaLoginController controller = loader.getController();
			controller.setPrincipal(this);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void cadastroAdministrador() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Principal.class.getResource("/br/ufrpe/sistema_mercadinho/gui/CadastroAdministrador.fxml"));
			AnchorPane Login = (AnchorPane) loader.load();

			rootLayout.setCenter(Login);
			TelaLoginController controller = loader.getController();
			controller.setPrincipal(this);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void cadastroFuncionario() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Principal.class.getResource("/br/ufrpe/sistema_mercadinho/gui/CadastroFuncionario.fxml"));
			AnchorPane Login = (AnchorPane) loader.load();

			rootLayout.setCenter(Login);
			TelaLoginController controller = loader.getController();
			controller.setPrincipal(this);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void cadastroFornecedor() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Principal.class.getResource("/br/ufrpe/sistema_mercadinho/gui/CadastroFornecedor.fxml"));
			AnchorPane Login = (AnchorPane) loader.load();

			rootLayout.setCenter(Login);
			TelaLoginController controller = loader.getController();
			controller.setPrincipal(this);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void frenteDeCaixa() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Principal.class.getResource("/br/ufrpe/sistema_mercadinho/gui/FrenteDeCaixa.fxml"));
			AnchorPane Login = (AnchorPane) loader.load();

			rootLayout.setCenter(Login);
			TelaLoginController controller = loader.getController();
			controller.setPrincipal(this);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//	public static void criarDados() {
//		SistemaMercadinho fachada = SistemaMercadinho.getInstance();
//		Endereco enderecoAdm = new Endereco("Rua Joaqim da silva", "centro", "54700-000", "32", null, "Recife",
//				"Pernambuco");
//		Administrador admin = new Administrador("8787-6756", "admin@gmail.com", enderecoAdm, "Carlos Eduardo",
//				"12345678981", "1234321", "01/01/2016", "12/01/2017", "M", "solteiro", "brasilira", "Recife",
//				"123");
//		Endereco endereco = new Endereco("Rua Joaqim da silva", "centro", "54500-000", "32", null, "Recife",
//				"Pernambuco");
//		Fornecedor fornecedor = new Fornecedor("Carretas Speed", "Carretas s/a", "08.471.877/0001-72", "001213923",
//				endereco);
//
//		Item item = new Item("7898921403153", "margarina itaé", 100, "gordura vegetal", "mercearia", 3.4, 5.6, 0.23);
//
//		Funcionario funcionario = new Funcionario("86680516", "jhon.sidney@gmail.com", endereco, "jhon sidney",
//				"09690647482", "8123456", "12/01/2010", "SDS", "M", "solteiro", "brasileira", "recife", "1234");
//
//		Compra compra = new Compra("010169", "01", "12/02/03", fornecedor, "dinheiro", 10, item);
//
//		Venda venda = new Venda("0034", funcionario, "12/08/2016", 20, 25, 0, 5, item);
//
//		try {
//			fachada.cadastrarAdministrador(admin);
//
//		} catch (ErroDeNegocioException e) {
//			System.out.println(e.getMessage());
//		}
//
//		try {
//			fachada.cadastrarCompra(compra);
//
//		} catch (ErroDeNegocioException e) {
//			System.out.println(e.getMessage());
//		}
//
//		try {
//			fachada.cadastrarFornecedor(fornecedor);
//		} catch (ErroDeNegocioException e) {
//			System.out.println(e.getMessage());
//		}
//
//		try {
//			fachada.cadastrarFuncionario(funcionario);
//		} catch (ErroDeNegocioException e) {
//			System.out.println(e.getMessage());
//		}
//
//		try {
//			fachada.cadastrarItem(item);
//		} catch (ErroDeNegocioException e) {
//			System.out.println(e.getMessage());
//		}
//		try {
//			fachada.cadastrarVenda(venda);
//		} catch (ErroDeNegocioException e) {
//			System.out.println(e.getMessage());
//		}
//
//	}
	
	public static void main(String[] args) {	
		launch(args);
		
	}

}
