package br.ufrpe.sistema_mercadinho.gui;

import java.io.IOException;

import br.ufrpe.sistema_mercadinho.negocio.SistemaMercadinho;
import br.ufrpe.sistema_mercadinho.negocio.beans.Item;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class CadastroProdutoController {

	@FXML
	private TextField CDPRO_CODIGOPRODUTO;
	@FXML
	private TextField CDPRO_NOMEPRODUTO;
	@FXML
	private TextField CDPRO_QUANTIDADE;
	@FXML
	private TextField CDPRO_DESCRICAO;
	@FXML
	private TextField CDPRO_CATEGORIA;
	@FXML
	private TextField CDPRO_PRECODECUSTO;
	@FXML
	private TextField CDPRO_PRECODEVENDA;
	@FXML
	private TextField CDPRO_PESODOPRODUTO;
	@FXML
	private Button CDPRO_CADASTRAR;
	@FXML
	private Button CDPRO_ALTERAR;
	@FXML
	private Button CDPRO_REMOVER;
	@FXML
	private Button CDPRO_BUSCAR;
	@FXML
	private Button CDPRO_CANCELAR;

	SistemaMercadinho fachada;

	public void initialize() {
		fachada = SistemaMercadinho.getInstance();
	}

	@FXML
	public void cadastrarCadastroProduto(ActionEvent event) throws IOException {

		Parent root;
		Stage stage;

		if (validarCampos()) {

			try {

				String codigoProduto, nomeProduto, descricao, categoria;
				Integer quantidade;
				Double precoCusto, precoVenda, pesoProduto;

				codigoProduto = CDPRO_CODIGOPRODUTO.getText();
				nomeProduto = CDPRO_NOMEPRODUTO.getText();
				descricao = CDPRO_DESCRICAO.getText();
				categoria = CDPRO_CATEGORIA.getText();
				quantidade = new Integer(CDPRO_QUANTIDADE.getText());
				precoCusto = new Double(CDPRO_PRECODECUSTO.getText());
				precoVenda = new Double(CDPRO_PRECODEVENDA.getText());
				pesoProduto = new Double(CDPRO_PESODOPRODUTO.getText());
				Item produto = new Item(codigoProduto, nomeProduto, quantidade, descricao, categoria, precoCusto,
						precoVenda, pesoProduto);
				fachada.cadastrarItem(produto);

				stage = (Stage) CDPRO_CADASTRAR.getScene().getWindow();
				root = FXMLLoader
						.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/CadastroProduto.fxml"));

				Scene scene = new Scene(root);
				stage.setScene(scene);

			} catch (Exception e) {
				Alert alert = new Alert(AlertType.WARNING);
				alert.setTitle("Error");
				alert.setHeaderText("Informações inválidas");
				alert.setContentText(e.getMessage());
				alert.showAndWait();
			}
		}

	}

	@FXML
	public void buscarCadastroProduto(ActionEvent event) throws IOException {

	}

	@FXML
	public void atualizarCadastroProduto(ActionEvent event) throws IOException {

	}

	@FXML
	public void removerCadastroProduto(ActionEvent event) throws IOException {

	}

	@FXML
	public void cancelarCadastroProduto(ActionEvent event) throws IOException {

	}

	private boolean validarCampos() throws IOException {
		boolean validate = false;
		try {
			if (CDPRO_CODIGOPRODUTO.getText().isEmpty() || CDPRO_NOMEPRODUTO.getText().isEmpty()
					|| CDPRO_QUANTIDADE.getText().isEmpty() || CDPRO_DESCRICAO.getText().isEmpty()
					|| CDPRO_CATEGORIA.getText().isEmpty() || CDPRO_PRECODECUSTO.getText().isEmpty()
					|| CDPRO_PRECODEVENDA.getText().isEmpty() || CDPRO_PESODOPRODUTO.getText().isEmpty()) {
				Alert alert = new Alert(AlertType.WARNING);
				alert.setTitle("Error");
				alert.setHeaderText("Informações inválidas");
				alert.setContentText("Verifique os campos digitados!");
				alert.showAndWait();
			} else {
				validate = true;
			}
		} catch (NumberFormatException e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Error");
			alert.setHeaderText("Informações inválidas");
			alert.setContentText("Verifique os campos digitados!");
			alert.showAndWait();

		}
		return validate;
	}

}
