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
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

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
	private Button CDA_CADASTRAR;
	@FXML
	private Button CDA_ALTERAR;
	@FXML
	private Button CDA_REMOVER;
	@FXML
	private Button CDA_CANCELAR;
	@FXML
	private Button CDA_BUSCAR;

	SistemaMercadinho fachada;

	@FXML
	public void initialize() {
		fachada = SistemaMercadinho.getInstance();
	}

	@FXML
	public void cadastrarCadastroAdministrador(ActionEvent event) throws IOException {

		Parent root;
		Stage stage;

		if (validarCampos()) {

			try {

				String nome, cpf, telefone, rg, dataEmissao, orgaoEmissao, sexo, email, estadoCivil, naturalidade,
						nacionalidade, senha, logradouro, bairro, cep, numero, complemento, cidade, estado;

				nome = CDA_NOME.getText();
				cpf = CDA_CPF.getText();
				telefone = CDA_TELEFONE.getText();
				rg = CDA_RG.getText();
				dataEmissao = CDA_DATAEMISSAO.getText();
				orgaoEmissao = CDA_ORGAOEMISSOR.getText();
				sexo = CDA_SEXO.getText();
				email = CDA_EMAIL.getText();
				estadoCivil = CDA_ESTADOCIVIL.getText();
				naturalidade = CDA_NATURALIDADE.getText();
				nacionalidade = CDA_NACIONALIDADE.getText();
				senha = CDA_SENHA.getText();
				logradouro = CDA_LOGRADOURO.getText();
				bairro = CDA_BAIRRO.getText();
				cep = CDA_CEP.getText();
				numero = CDA_NUMERO.getText();
				complemento = CDA_COMPLEMENTO.getText();
				cidade = CDA_CIDADE.getText();
				estado = CDA_ESTADO.getText();
				Endereco endereco = new Endereco(logradouro, bairro, cep, numero, complemento, cidade, estado);
				Administrador administrador = new Administrador(telefone, email, endereco, nome, cpf, rg, dataEmissao,
						orgaoEmissao, sexo, estadoCivil, nacionalidade, naturalidade, senha);

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
	public void alterarCadastroAdministrador(ActionEvent event) throws IOException {

	}

	@FXML
	public void removerCadastroAdministrador(ActionEvent event) throws IOException {

	}
	
	@FXML
	public void buscarCadastrarAdministrador(ActionEvent event)throws IOException{
		
	}

	@FXML
	public void cancelarCadastroAdministrador(ActionEvent event) {
		Parent root;
		Stage stage;
		try {
			if (event.getSource() == CDA_CANCELAR) {
				stage = (Stage) CDA_CANCELAR.getScene().getWindow();
				root = FXMLLoader.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/TelaDeCadastro.fxml"));
			} else {
				stage = (Stage) CDA_CANCELAR.getScene().getWindow();
				root = FXMLLoader.load(
						getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/CadastroAdministradorTela.fxml"));
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
