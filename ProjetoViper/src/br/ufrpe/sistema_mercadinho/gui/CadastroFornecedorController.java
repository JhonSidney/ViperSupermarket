package br.ufrpe.sistema_mercadinho.gui;

import java.awt.ActiveEvent;
import java.io.IOException;

import br.ufrpe.sistema_mercadinho.negocio.SistemaMercadinho;
import br.ufrpe.sistema_mercadinho.negocio.beans.Endereco;
import br.ufrpe.sistema_mercadinho.negocio.beans.Fornecedor;
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

public class CadastroFornecedorController {

	@FXML
	private TextField CDFOR_NOMEFANTASIA;
	@FXML
	private TextField CDFOR_RAZAOSOCIAL;
	@FXML
	private TextField CDFOR_CNPJ;
	@FXML
	private TextField CDFOR_INSCRICAOESTADUAL;
	@FXML
	private TextField CDFOR_LOGRADOURO;
	@FXML
	private TextField CDFOR_BAIRRO;
	@FXML
	private TextField CDFOR_CEP;
	@FXML
	private TextField CDFOR_NUMERO;
	@FXML
	private TextField CDFOR_COMPLEMENTO;
	@FXML
	private TextField CDFOR_CIDADE;
	@FXML
	private TextField CDFOR_ESTADO;
	@FXML
	private Button CDFOR_CADASTRAR;
	@FXML
	private Button CDFOR_ALTERAR;
	@FXML
	private Button CDFOR_REMOVER;
	@FXML
	private Button CDFOR_CANCELAR;
	@FXML
	private Button CDFOR_BUSCAR;

	SistemaMercadinho fachada;

	@FXML
	public void initialize() {
		fachada = SistemaMercadinho.getInstance();
	}

	@FXML
	public void cadastrarCadastroFornecedor(ActionEvent event) throws IOException {
		Parent root;
		Stage stage;

		if (validarCampos()) {

			try {

				String nomeFantasia, razaoSocial, cnpj, inscricaoEstadual, logradouro, bairro, cep, numero, complemento,
						cidade, estado;

				nomeFantasia = CDFOR_NOMEFANTASIA.getText();
				razaoSocial = CDFOR_RAZAOSOCIAL.getText();
				cnpj = CDFOR_CNPJ.getText();
				inscricaoEstadual = CDFOR_INSCRICAOESTADUAL.getText();
				logradouro = CDFOR_LOGRADOURO.getText();
				bairro = CDFOR_BAIRRO.getText();
				cep = CDFOR_CEP.getText();
				numero = CDFOR_NUMERO.getText();
				complemento = CDFOR_COMPLEMENTO.getText();
				cidade = CDFOR_CIDADE.getText();
				estado = CDFOR_ESTADO.getText();
				Endereco endereco = new Endereco(logradouro, bairro, cep, numero, complemento, cidade, estado);
				Fornecedor fornecedor = new Fornecedor(nomeFantasia, razaoSocial, cnpj, inscricaoEstadual, endereco);
				fachada.cadastrarFornecedor(fornecedor);

				stage = (Stage) CDFOR_CADASTRAR.getScene().getWindow();
				root = FXMLLoader
						.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/CadastroFornecedor.fxml"));

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
	public void alterarCadastroFornecedor(ActionEvent event) throws IOException {

	}

	@FXML
	public void removerCadastroFornecedor(ActionEvent event) throws IOException {

	}
	
	@FXML
	public void buscarCadastroFornecedor(ActionEvent event)throws IOException{
		
	}

	@FXML
	public void cancelarCadastroFornecedor(ActionEvent event) {
		Parent root;
		Stage stage;
		try {
			if (event.getSource() == CDFOR_CANCELAR) {
				stage = (Stage) CDFOR_CANCELAR.getScene().getWindow();
				root = FXMLLoader.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/TelaDeCadastro.fxml"));
			} else {
				stage = (Stage) CDFOR_CANCELAR.getScene().getWindow();
				root = FXMLLoader.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/CadastroFornecedor.fxml"));
			}
			Scene scene = new Scene(root);
			stage.setScene(scene);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private boolean validarCampos() throws IOException {
		boolean validate = false;
		try {
			if (CDFOR_NOMEFANTASIA.getText().isEmpty() || CDFOR_RAZAOSOCIAL.getText().isEmpty()
					|| CDFOR_CNPJ.getText().isEmpty() || CDFOR_INSCRICAOESTADUAL.getText().isEmpty()
					|| CDFOR_LOGRADOURO.getText().isEmpty() || CDFOR_BAIRRO.getText().isEmpty()
					|| CDFOR_CEP.getText().isEmpty() || CDFOR_NUMERO.getText().isEmpty()
					|| CDFOR_COMPLEMENTO.getText().isEmpty() || CDFOR_CIDADE.getText().isEmpty()
					|| CDFOR_ESTADO.getText().isEmpty()) {
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
