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
