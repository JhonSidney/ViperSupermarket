package br.ufrpe.sistema_mercadinho.gui;

import java.io.IOException;

import br.ufrpe.sistema_mercadinho.negocio.SistemaMercadinho;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class JanelaErroController {
	
	private JanelaErroApplication janelaApplication;
	private String mensagem;
	
	
	@FXML
	private Label LB_MENSAGEM;
	
	@FXML
	private Button BT_OK;
	
	public void setMessagem(String s){
		this.mensagem = s;
	}
	
	@FXML
	public void botaoOK(ActionEvent event) {
		Parent root;
		Stage stage;
		try {
			if (event.getSource() == BT_OK) {
				stage = (Stage) BT_OK.getScene().getWindow();
				root = FXMLLoader.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/CadastroAdministradorTela.fxml"));
			} else {
				stage = (Stage) BT_OK.getScene().getWindow();
				root = FXMLLoader.load(
						getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/CadastroAdministradorTela.fxml"));
			}
			Scene scene = new Scene(root);
			stage.setScene(scene);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	public void initialize(){
		this.setMessagem("");;
		LB_MENSAGEM.setText(mensagem);
	}
	
	
	public void setJanelaErroApplication(JanelaErroApplication janelaErroApplication) {
		this.janelaApplication = janelaErroApplication;
	}


	
}
