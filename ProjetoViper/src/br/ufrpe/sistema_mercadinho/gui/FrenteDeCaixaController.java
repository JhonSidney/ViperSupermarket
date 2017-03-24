package br.ufrpe.sistema_mercadinho.gui;

import java.io.IOException;
import java.util.ArrayList;

import br.ufrpe.sistema_mercadinho.exceptions.ErroDeNegocioException;
import br.ufrpe.sistema_mercadinho.negocio.SistemaMercadinho;
import br.ufrpe.sistema_mercadinho.negocio.beans.Item;
import br.ufrpe.sistema_mercadinho.negocio.beans.ItemVenda;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FrenteDeCaixaController {

	
	@FXML
	private Button BUTTON_CANCELAR_COMPRA;
	@FXML
	private Button BUTTON_FATURAR;
	@FXML
	private Button BUTTON_DEVOLUCAO;
	@FXML
	private Button BUTTON_ADICIONAR;
	@FXML
	private TextField PDV_VALOR_UNIT;
	@FXML
	private TextField PDV_TROCO_COMPRA;
	@FXML
	private TextField PDV_SUBTOTAL;
	@FXML
	private TextField PDV_QUANT;
	@FXML
	private TextField FUNC_NAME;
	@FXML
	private Label MSG_STATUS;
	@FXML
	private TableView<ItemVenda> TABLE_PRODUTOS;
	@FXML
	private TableColumn<ItemVenda, String> COLUMN_QUANT_ITEM; 
	@FXML
	private TableColumn<ItemVenda, String> COLUMN_VALOR_ITEM;
	@FXML
	private TableColumn<ItemVenda, String> COLUMN_NOME_ITEM; 
	@FXML
	private TextField COD_PRODUTO;
	
	private ArrayList<ItemVenda> produtosDeVenda;
	
	private ObservableList<ItemVenda> dataTabela;
	
	private Button BUTTON_SAIR_SISTEMA;
	
	private SistemaMercadinho fachada;
	
	@FXML
	public void initialize(){
		fachada = SistemaMercadinho.getInstance();
		this.produtosDeVenda = new ArrayList<ItemVenda>();
		
		COLUMN_NOME_ITEM.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getItem().getnomeProduto()));
		COLUMN_VALOR_ITEM.setCellValueFactory(cellData -> new SimpleStringProperty(Double.toString(cellData.getValue().getItem().getPrecoVenda())));
		COLUMN_QUANT_ITEM.setCellValueFactory(cellData -> new SimpleStringProperty(Integer.toString(cellData.getValue().getQuantidadeItem())));
		
		this.dataTabela = FXCollections.observableArrayList();
		
		
	}
	
	
	public void adicionarProduto(ActionEvent event)throws IOException{
		
//		
//		try{
//			String cod = COD_PRODUTO.getText().toString();
//			int quantidade = Integer.parseInt(PDV_QUANT.getText().toString());
//			
//			Item t = this.fachada.procurarItem(cod);
//			PDV_VALOR_UNIT.setText(Double.toString(t.getPrecoVenda()));
//			double valorTotal = quantidade * t.getPrecoVenda();
//			ItemVenda iv = new ItemVenda(quantidade, t, valorTotal);
//			this.produtosDeVenda.add(iv);
//			
//			this.dataTabela.addAll(this.produtosDeVenda);
//			this.TABLE_PRODUTOS.setItems(dataTabela);
//			
//		}catch(NumberFormatException e1){
//			e1.printStackTrace();
//		}catch(ErroDeNegocioException e){
//			e.printStackTrace();
//		}
		
		
	}
	
	
	@FXML
	public void sairLogin(ActionEvent event)throws IOException {
		Parent root;
		Stage stage;
		try {
			if (event.getSource() == BUTTON_SAIR_SISTEMA) {
				stage = (Stage) BUTTON_SAIR_SISTEMA.getScene().getWindow();
				root = FXMLLoader.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/TelaLogin.fxml"));
			} else {
				stage = (Stage) BUTTON_SAIR_SISTEMA.getScene().getWindow();
				root = FXMLLoader.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/FrenteDeCaixa.fxml"));
			}
			Scene scene = new Scene(root);
			stage.setScene(scene);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	
	
}
