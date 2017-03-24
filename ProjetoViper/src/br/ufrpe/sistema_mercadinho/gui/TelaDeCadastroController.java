package br.ufrpe.sistema_mercadinho.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class TelaDeCadastroController {

	@FXML
	private Button MBC_CadastrarAdministrador;

	@FXML
	private Button MBC_CadastrarFuncionario;

	@FXML
	private Button MBC_CadastrarFornecedor;

	@FXML
	private Button MBC_CadastrarProduto;
	
	@FXML
	private Button MBC_VOLTAR;

	@FXML
	public void cadastrarAdministrador(ActionEvent event) {
		Parent root;
		Stage stage;
		try {
			
			if (event.getSource() == MBC_CadastrarAdministrador) {
				stage = (Stage) MBC_CadastrarAdministrador.getScene().getWindow();
				root = FXMLLoader.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/CadastroAdministradorTela.fxml"));
			} else {
				stage = (Stage) MBC_CadastrarAdministrador.getScene().getWindow();
				root = FXMLLoader.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/TelaDeCadastro.fxml"));
			}
			Scene scene = new Scene(root);
			stage.setScene(scene);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@FXML
	public void cadastrarFuncionario(ActionEvent event) {
		Parent root;
		Stage stage;
		try {
			if (event.getSource() == MBC_CadastrarFuncionario) {
				stage = (Stage) MBC_CadastrarFuncionario.getScene().getWindow();
				root = FXMLLoader.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/CadastroFuncionarioTela.fxml"));
			} else {
				stage = (Stage) MBC_CadastrarFuncionario.getScene().getWindow();
				root = FXMLLoader.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/TelaDeCadastro.fxml"));
			}
			Scene scene = new Scene(root);
			stage.setScene(scene);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	public void cadastrarFornecedor(ActionEvent event) {
		Parent root;
		Stage stage;
		try {
			if (event.getSource() == MBC_CadastrarFornecedor) {
				stage = (Stage) MBC_CadastrarFornecedor.getScene().getWindow();
				root = FXMLLoader.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/CadastroFornecedorTela.fxml"));
			} else {
				stage = (Stage) MBC_CadastrarFornecedor.getScene().getWindow();
				root = FXMLLoader.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/TelaDeCadastro.fxml"));
			}
			Scene scene = new Scene(root);
			stage.setScene(scene);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	public void cadastrarProduto(ActionEvent event) {
		Parent root;
		Stage stage;
		try {
			if (event.getSource() == MBC_CadastrarProduto) {
				stage = (Stage) MBC_CadastrarProduto.getScene().getWindow();
				root = FXMLLoader.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/CadastroProduto.fxml"));
			} else {
				stage = (Stage) MBC_CadastrarProduto.getScene().getWindow();
				root = FXMLLoader.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/TelaDeCadastro.fxml"));
			}
			Scene scene = new Scene(root);
			stage.setScene(scene);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@FXML
	public void botaoVoltarMenuCadastrar(ActionEvent event) {
		Parent root;
		Stage stage;
		try {
			if (event.getSource() == MBC_VOLTAR) {
				stage = (Stage) MBC_VOLTAR.getScene().getWindow();
				root = FXMLLoader.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/Backoffice.fxml"));
			} else {
				stage = (Stage) MBC_VOLTAR.getScene().getWindow();
				root = FXMLLoader.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/TelaDeCadastro.fxml"));
			}
			Scene scene = new Scene(root);
			stage.setScene(scene);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
