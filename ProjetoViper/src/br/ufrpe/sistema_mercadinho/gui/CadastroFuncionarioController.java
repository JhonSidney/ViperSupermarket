package br.ufrpe.sistema_mercadinho.gui;

import java.io.IOException;

import br.ufrpe.sistema_mercadinho.negocio.SistemaMercadinho;
import br.ufrpe.sistema_mercadinho.negocio.beans.Administrador;
import br.ufrpe.sistema_mercadinho.negocio.beans.Endereco;
import br.ufrpe.sistema_mercadinho.negocio.beans.Funcionario;
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

public class CadastroFuncionarioController {

	@FXML
	private TextField CDF_NOME;
	@FXML
	private TextField CDF_CPF;
	@FXML
	private TextField CDF_RG;
	@FXML
	private TextField CDF_DATAEMISSAO;
	@FXML
	private TextField CDF_ORGAOEMISSOR;
	@FXML
	private TextField CDF_SEXO;
	@FXML
	private TextField CDF_EMAIL;

	@FXML
	private TextField CDF_ESTADOCIVIL;
	@FXML
	private TextField CDF_NATURALIDADE;
	@FXML
	private TextField CDF_TELEFONE;
	@FXML
	private TextField CDF_NACIONALIDADE;
	@FXML
	private TextField CDF_SENHA;

	@FXML
	private TextField CDF_LOGRADOURO;
	@FXML
	private TextField CDF_BAIRRO;
	@FXML
	private TextField CDF_CEP;
	@FXML
	private TextField CDF_NUMERO;
	@FXML
	private TextField CDF_COMPLEMENTO;
	@FXML
	private TextField CDF_CIDADE;
	@FXML
	private TextField CDF_ESTADO;
	@FXML
	private TextField CDF_FUNCAO;
	@FXML
	private TextField CDF_ADMISSAO;
	@FXML
	private TextField CDF_DEMISSAO;
	@FXML
	private TextField CDF_SALARIO;

	@FXML
	private Button CDF_CADASTRAR;
	@FXML
	private Button CDF_ALTERAR;
	@FXML
	private Button CDF_REMOVER;
	@FXML
	private Button CDF_CANCELAR;

	SistemaMercadinho fachada;

	@FXML
	public void initialize() {
		fachada = SistemaMercadinho.getInstance();
	}

	@FXML
	public void botaoCadastrarCadastroFuncionario(ActionEvent event) throws IOException {

		Parent root;
		Stage stage;

		if (validarCampos()) {

			try {

				String nome, cpf, telefone, rg, dataEmissao, orgaoEmissao, sexo, email, estadoCivil, naturalidade,
						nacionalidade, senha, logradouro, bairro, cep, numero, complemento, cidade, estado, funcao,
						admissao, demissao, salario;

				nome = CDF_NOME.getText();
				cpf = CDF_CPF.getText();
				telefone = CDF_TELEFONE.getText();
				rg = CDF_RG.getText();
				dataEmissao = CDF_DATAEMISSAO.getText();
				orgaoEmissao = CDF_ORGAOEMISSOR.getText();
				sexo = CDF_SEXO.getText();
				email = CDF_EMAIL.getText();
				estadoCivil = CDF_ESTADOCIVIL.getText();
				naturalidade = CDF_NATURALIDADE.getText();
				nacionalidade = CDF_NACIONALIDADE.getText();
				senha = CDF_SENHA.getText();
				logradouro = CDF_LOGRADOURO.getText();
				bairro = CDF_BAIRRO.getText();
				cep = CDF_CEP.getText();
				numero = CDF_NUMERO.getText();
				complemento = CDF_COMPLEMENTO.getText();
				cidade = CDF_CIDADE.getText();
				estado = CDF_ESTADO.getText();
				funcao = CDF_FUNCAO.getText();
				admissao = CDF_ADMISSAO.getText();
				demissao = CDF_DEMISSAO.getText();
				salario = CDF_SALARIO.getText();

				Endereco endereco = new Endereco(logradouro, bairro, cep, numero, complemento, cidade, estado);
				Funcionario funcionario = new Funcionario(telefone, email, endereco, nome, cpf, rg, dataEmissao,
						orgaoEmissao, sexo, estadoCivil, nacionalidade, naturalidade, senha);

				fachada.cadastrarFuncionario(funcionario);

				stage = (Stage) CDF_CADASTRAR.getScene().getWindow();
				root = FXMLLoader
						.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/CadastroFuncionarioTela.fxml"));

				Scene scene = new Scene(root);
				stage.setScene(scene);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	
	
	@FXML
	public void botaoAlterarCadastroFuncionario(ActionEvent event)throws IOException{
		
		
		
	}
	
	@FXML
	public void botaoRemoverCadastroFuncionario(ActionEvent event)throws IOException{
		
		
		
	}
	
	
	
	
	@FXML
	public void botaoCancelarCadastroFuncionario(ActionEvent event) {
		Parent root;
		Stage stage;
		try {
			if (event.getSource() == CDF_CANCELAR) {
				stage = (Stage) CDF_CANCELAR.getScene().getWindow();
				root = FXMLLoader.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/TelaDeCadastro.fxml"));
			} else {
				stage = (Stage) CDF_CANCELAR.getScene().getWindow();
				root = FXMLLoader
						.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/CadastroFuncionarioTela.fxml"));
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
			if (CDF_NOME.getText().isEmpty() || CDF_CPF.getText().isEmpty() || CDF_RG.getText().isEmpty()
					|| CDF_DATAEMISSAO.getText().isEmpty() || CDF_ORGAOEMISSOR.getText().isEmpty()
					|| CDF_SEXO.getText().isEmpty() || CDF_EMAIL.getText().isEmpty()
					|| CDF_ESTADOCIVIL.getText().isEmpty() || CDF_NATURALIDADE.getText().isEmpty()
					|| CDF_TELEFONE.getText().isEmpty() || CDF_NACIONALIDADE.getText().isEmpty()
					|| CDF_SENHA.getText().isEmpty() || CDF_LOGRADOURO.getText().isEmpty()
					|| CDF_BAIRRO.getText().isEmpty() || CDF_CEP.getText().isEmpty() || CDF_NUMERO.getText().isEmpty()
					|| CDF_COMPLEMENTO.getText().isEmpty() || CDF_CIDADE.getText().isEmpty()
					|| CDF_ESTADO.getText().isEmpty() || CDF_FUNCAO.getText().isEmpty()
					|| CDF_ADMISSAO.getText().isEmpty() || CDF_DEMISSAO.getText().isEmpty()
					|| CDF_SALARIO.getText().isEmpty()) {
//				FXMLLoader fxmlLoader = new FXMLLoader(
//				getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/JanelaErroTela.fxml"));
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
