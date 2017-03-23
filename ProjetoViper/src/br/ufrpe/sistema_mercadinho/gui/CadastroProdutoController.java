package br.ufrpe.sistema_mercadinho.gui;

import java.io.IOException;

import br.ufrpe.sistema_mercadinho.negocio.SistemaMercadinho;
import br.ufrpe.sistema_mercadinho.negocio.beans.Administrador;
import br.ufrpe.sistema_mercadinho.negocio.beans.Endereco;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
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
	
	SistemaMercadinho fachada;
	
	
	public void initialize(){
		fachada = SistemaMercadinho.getInstance();
	}

	@FXML
	public void cadastrarCadastroProduto(ActionEvent event)throws IOException{
		

		Parent root;
		Stage stage;

		if (validarCampos()) {

			try {

				String codigoProduto, nomeProduto, descricao,categoria;
				Integer quantidade;
				Double predoDeCusto, precoDeVenda, PrecoDoProduto;
				
				
				codigoProduto= CDPRO_CODIGOPRODUTO.getText();
				nomeProduto = CDPRO_NOMEPRODUTO.getText();
				descricao = CDPRO_DESCRICAO.getText();
				categoria = CDPRO_CATEGORIA.getText();
			    quantidade = new Integer(CDPRO_QUANTIDADE.getText());
			    predoDeCusto = new Double(CDPRO_PRECODECUSTO.getText());
			    precoDeVenda = new Double(CDPRO_PRECODEVENDA.getText());
			    pe
				
				fachada.cadastrarAdministrador(administrador);

				stage = (Stage) CDA_CADASTRAR.getScene().getWindow();
				root = FXMLLoader.load(
						getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/CadastroAdministradorTela.fxml"));

				Scene scene = new Scene(root);
				stage.setScene(scene);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	@FXML
	public void buscarCadastroProduto(ActionEvent event)throws IOException{
		
	}
	@FXML
	public void atualizarCadastroProduto(ActionEvent event)throws IOException{
		
	}@FXML
	public void removerCadastroProduto(ActionEvent event)throws IOException{
		
	}@FXML
	public void cancelarCadastroProduto(ActionEvent event)throws IOException{
		
	}
	
	
	
	private boolean validarCampos() throws IOException {
		boolean validate = false;
		try {
			if (CDA_NOME.getText().isEmpty() || CDA_CPF.getText().isEmpty() || CDA_RG.getText().isEmpty()
					|| CDA_DATAEMISSAO.getText().isEmpty() || CDA_ORGAOEMISSOR.getText().isEmpty()
					|| CDA_SEXO.getText().isEmpty() || CDA_EMAIL.getText().isEmpty()
					|| CDA_ESTADOCIVIL.getText().isEmpty() || CDA_NATURALIDADE.getText().isEmpty()
					|| CDA_TELEFONE.getText().isEmpty() || CDA_NACIONALIDADE.getText().isEmpty()
					|| CDA_SENHA.getText().isEmpty() || CDA_LOGRADOURO.getText().isEmpty()
					|| CDA_BAIRRO.getText().isEmpty() || CDA_CEP.getText().isEmpty() || CDA_NUMERO.getText().isEmpty()
					|| CDA_COMPLEMENTO.getText().isEmpty() || CDA_CIDADE.getText().isEmpty()
					|| CDA_ESTADO.getText().isEmpty()) {
//				FXMLLoader fxmlLoader = new FXMLLoader(
//						getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/JanelaErroTela.fxml"));
//				Parent root1 = (Parent) fxmlLoader.load();
//				JanelaErroController controller = fxmlLoader.getController();
//				((JanelaErroController) controller).setMessagem("Campos invalidos");
//				;
//				Stage stage = new Stage();
//				stage.initModality(Modality.APPLICATION_MODAL);
//				stage.initStyle(StageStyle.UNDECORATED);
//				stage.setTitle("Viper Sistemas");
//				stage.setScene(new Scene(root1));
//				stage.show();

			} else {
				validate = true;
			}
		} catch (NumberFormatException e) {
			e.getMessage();

		}
		return validate;
	}
	
	
}
