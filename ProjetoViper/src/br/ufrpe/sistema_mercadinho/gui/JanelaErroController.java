package br.ufrpe.sistema_mercadinho.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class JanelaErroController {
	
	private JanelaErroApplication janelaApplication;
	
	
	@FXML
	private Label LB_MENSAGEM;
	
	@FXML
	private Button BT_OK;
	
	public void  botaoOK(){
		
		
	}
	
	public void setJanelaErroApplication(JanelaErroApplication janelaErroApplication) {
		this.janelaApplication = janelaErroApplication;
	}


	
}
