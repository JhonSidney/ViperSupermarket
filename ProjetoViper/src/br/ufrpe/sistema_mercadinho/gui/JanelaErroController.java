package br.ufrpe.sistema_mercadinho.gui;

import br.ufrpe.sistema_mercadinho.negocio.SistemaMercadinho;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

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
	
	public void  botaoOK(){
		
		
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
