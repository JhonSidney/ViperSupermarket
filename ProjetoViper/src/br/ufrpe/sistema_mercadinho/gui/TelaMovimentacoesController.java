package br.ufrpe.sistema_mercadinho.gui;


import java.io.IOException;

import br.ufrpe.sistema_mercadinho.negocio.SistemaMercadinho;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TelaMovimentacoesController {
	@FXML
	private Button MBM_ALTERACOESDEPRECO;

	@FXML
	private Button MBM_CONSULTARPRODUTOS;

	@FXML
	private Button MBM_FATURAMENTO;

	@FXML
	private Button MBM_MOVIMENTACOESDEESTOQUE;

	@FXML
	private Button MBM_PEDIDODECOMPRA;

	@FXML
	private Button MBM_PEDIDODEVENDA;
	
	@FXML
	private Button MBM_VOLTAR;
	
	
	SistemaMercadinho fachada;
	
	public void initialize(){
		fachada = SistemaMercadinho.getInstance();
	}
	

	@FXML
	public void alteraracoesDePreco(ActionEvent event)throws IOException{
		
		
	}
	

	@FXML
	public void consultarProdutos(ActionEvent event)throws IOException{
		
		
	}

	@FXML
	public void faturamento(ActionEvent event)throws IOException{
		
		
	}

	@FXML
	public void movimentacoesDeEstoque(ActionEvent event)throws IOException{
		
		
	}

	
	@FXML
	public void pedidoCompra(ActionEvent event)throws IOException{
		
		
	}

	
	@FXML
	public void pedidoVenda(ActionEvent event)throws IOException{
		
		
	}
	
	
	@FXML
	public void voltarMovimentacoes(ActionEvent event)throws IOException{
		
		Parent root;
		Stage stage;
		try {
			if (event.getSource() == MBM_VOLTAR) {
				stage = (Stage) MBM_VOLTAR.getScene().getWindow();
				root = FXMLLoader.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/Backoffice.fxml"));
			} else {
				stage = (Stage) MBM_VOLTAR.getScene().getWindow();
				root = FXMLLoader.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/TelaDeCadastro.fxml"));
			}
			Scene scene = new Scene(root);
			stage.setScene(scene);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


}
