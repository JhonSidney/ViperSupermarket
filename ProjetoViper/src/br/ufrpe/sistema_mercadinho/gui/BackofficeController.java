package br.ufrpe.sistema_mercadinho.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class BackofficeController {

	@FXML
	private Button menuCadastro;
	@FXML
	private Button menuMovimentacoes;
	@FXML
	private Button menuPDV;
	@FXML
	private Button menuFiscal;
	@FXML
	private Button menuFinanceiro;
	@FXML
	private Button menuRelatorios;

	@FXML
	private Button BT_SAIR;

	// @FXML
	// private Button MIP_FechamentoDeCaixa;
	//
	// @FXML
	// private Button MIFiscal_EmissaoDeNotaFiscal;
	//
	// @FXML
	// private Button MIFiscal_lancarNotaFiscal;
	//
	// @FXML
	// private Button MIFinanceiro_DocumentosAReceber;
	//
	// @FXML
	// private Button MIFinanceiro_DocumentosAPagar;
	//
	// @FXML
	// private Button MIFinanceiro_FluxoDeCaixa;
	//
	// @FXML
	// private Button MIR_Compras;
	//
	// @FXML
	// private Button MIR_Fornecedores;
	//
	// @FXML
	// private Button MIR_Funcionarios;
	//
	// @FXML
	// private Button MIR_Produtos;
	//
	// @FXML
	// private Button MIR_Vendas;

	private Principal principal;

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	@FXML
	public void backoffice_MenuCadastrar(ActionEvent event) {
		Parent root;
		Stage stage;
		try {
			if (event.getSource() == menuCadastro) {
				stage = (Stage) menuCadastro.getScene().getWindow();
				root = FXMLLoader.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/TelaDeCadastro.fxml"));
			} else {
				stage = (Stage) menuCadastro.getScene().getWindow();
				root = FXMLLoader.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/Backoffice.fxml"));
			}
			Scene scene = new Scene(root);
			stage.setScene(scene);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	public void backoffice_MenuMovimentacoes(ActionEvent event) {
		Parent root;
		Stage stage;
		try {
			if (event.getSource() == menuMovimentacoes) {
				stage = (Stage) menuMovimentacoes.getScene().getWindow();
				root = FXMLLoader
						.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/TelaMovimentacoes.fxml"));
			} else {
				stage = (Stage) menuMovimentacoes.getScene().getWindow();
				root = FXMLLoader.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/Backoffice.fxml"));
			}
			Scene scene = new Scene(root);
			stage.setScene(scene);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	public void backoffice_MenuPDV(ActionEvent event) {
		Parent root;
		Stage stage;
		try {
			if (event.getSource() == menuPDV) {
				stage = (Stage) menuPDV.getScene().getWindow();
				root = FXMLLoader.load(
						getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/FrenteDeCaixa.fxml"));
			} else {
				stage = (Stage) menuPDV.getScene().getWindow();
				root = FXMLLoader.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/Backoffice.fxml"));
			}
			Scene scene = new Scene(root);
			stage.setScene(scene);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	public void backoffice_MenuFiscal(ActionEvent event) {
		Parent root;
		Stage stage;
		try {
			if (event.getSource() == menuCadastro) {
				stage = (Stage) menuCadastro.getScene().getWindow();
				root = FXMLLoader.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/TelaDeCadastro.fxml"));
			} else {
				stage = (Stage) menuCadastro.getScene().getWindow();
				root = FXMLLoader.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/Backoffice.fxml"));
			}
			Scene scene = new Scene(root);
			stage.setScene(scene);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	public void backoffice_MenuFinanceiro(ActionEvent event) {
		Parent root;
		Stage stage;
		try {
			if (event.getSource() == menuCadastro) {
				stage = (Stage) menuCadastro.getScene().getWindow();
				root = FXMLLoader.load(
						getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/CadastroAdministradorTela.fxml"));
			} else {
				stage = (Stage) menuCadastro.getScene().getWindow();
				root = FXMLLoader.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/Backoffice.fxml"));
			}
			Scene scene = new Scene(root);
			stage.setScene(scene);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	public void backoffice_MenuRelatorios(ActionEvent event) {
		Parent root;
		Stage stage;
		try {
			if (event.getSource() == menuCadastro) {
				stage = (Stage) menuCadastro.getScene().getWindow();
				root = FXMLLoader.load(
						getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/CadastroAdministradorTela.fxml"));
			} else {
				stage = (Stage) menuCadastro.getScene().getWindow();
				root = FXMLLoader.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/Backoffice.fxml"));
			}
			Scene scene = new Scene(root);
			stage.setScene(scene);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	public void sairLogin(ActionEvent event) {
		Parent root;
		Stage stage;
		try {
			if (event.getSource() == BT_SAIR) {
				stage = (Stage) BT_SAIR.getScene().getWindow();
				root = FXMLLoader.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/TelaLogin.fxml"));
			} else {
				stage = (Stage) BT_SAIR.getScene().getWindow();
				root = FXMLLoader.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/Backoffice.fxml"));
			}
			Scene scene = new Scene(root);
			stage.setScene(scene);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	
	
	
	
	
}
