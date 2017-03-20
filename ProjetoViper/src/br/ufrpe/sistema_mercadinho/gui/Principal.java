package br.ufrpe.sistema_mercadinho.gui;

import java.io.IOException;

import br.ufrpe.sistema_mercadinho.negocio.SistemaMercadinho;
import br.ufrpe.sistema_mercadinho.negocio.beans.Pessoa;
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
			loader.setLocation(Principal.class.getResource("/br/ufrpe/sistema_mercadinho/gui/TelaLogins.fxml"));
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
	
	
	
	public static void main(String[] args) {		
		launch(args);
		
	}

}
