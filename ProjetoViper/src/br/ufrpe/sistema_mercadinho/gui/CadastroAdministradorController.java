package br.ufrpe.sistema_mercadinho.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CadastroAdministradorController {

	
	
	@FXML
	private TextField CDA_NOME;
	@FXML
	private TextField CDA_CPF;
	@FXML
	private TextField CDA_RG;
	@FXML
	private TextField CDA_DATAEMISSAO;
	@FXML
	private TextField CDA_ORGAOEMISSOR;
	@FXML
	private TextField CDA_SEXO;
	@FXML
	private TextField CDA_EMAIL;
	
	@FXML
	private TextField CDA_ESTADOCIVIL;
	@FXML
	private TextField CDA_NATURALIDADE;
	@FXML
	private TextField CDA_TELEFONE;
	@FXML
	private TextField CDA_NACIONALIDADE;
	@FXML
	private TextField CDA_SENHA;
	
	@FXML
	private TextField CDA_LOGRADOURO;
	@FXML
	private TextField CDA_BAIRRO;
	@FXML
	private TextField CDA_CEP;
	@FXML
	private TextField CDA_NUMERO;
	@FXML
	private TextField CDA_COMPLEMENTO;
	@FXML
	private TextField CDA_CIDADE;
	@FXML
	private TextField CDA_ESTADO;
	
	@FXML
	private Button CDA_CONFIRMAR;
	@FXML
	private TextField CDA_CANCELAR;

	
	
	
	@FXML
	public void botaoConfirmarCadastroAdministrador(ActionEvent event) {
		Parent root;
		Stage stage;
		try {
			if (event.getSource() == CDA_CONFIRMAR) {
				stage = (Stage) CDA_CONFIRMAR.getScene().getWindow();
				root = FXMLLoader.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/TelaCadastro.fxml"));
			} else {
				stage = (Stage) CDA_CONFIRMAR.getScene().getWindow();
				root = FXMLLoader.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/CadastroAdministradorTela.fxml"));
			}
			Scene scene = new Scene(root);
			stage.setScene(scene);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@FXML
	public void botaoCancelarCadastroAdministrador(ActionEvent event) {
		Parent root;
		Stage stage;
		try {
			if (event.getSource() == CDA_CANCELAR) {
				stage = (Stage) CDA_CANCELAR.getScene().getWindow();
				root = FXMLLoader.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/TelaCadastro.fxml"));
			} else {
				stage = (Stage) CDA_CANCELAR.getScene().getWindow();
				root = FXMLLoader.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/CadastroAdministradorTela.fxml"));
			}
			Scene scene = new Scene(root);
			stage.setScene(scene);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
