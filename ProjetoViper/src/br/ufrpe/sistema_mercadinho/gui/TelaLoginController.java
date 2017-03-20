package br.ufrpe.sistema_mercadinho.gui;

import br.ufrpe.sistema_mercadinho.exceptions.ErroDeNegocioException;
import br.ufrpe.sistema_mercadinho.negocio.SistemaMercadinho;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TelaLoginController {

	private Principal principal;
	SistemaMercadinho fachada = SistemaMercadinho.getInstance();

	@FXML
	private TextField TL_TF_Usuario;
	@FXML
	private PasswordField TL_PF_SenhaLogin;
	@FXML
	private Button TL_BT_Acessar;

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	public void acessarLogin() throws ErroDeNegocioException {
		this.setPrincipal(principal.getInstance());
	}

	@FXML
	public void acessarLogin(ActionEvent event) {
		Parent root;
		Stage stage;
		try {
			if (event.getSource() == TL_BT_Acessar) {
				stage = (Stage) TL_BT_Acessar.getScene().getWindow();
				root = FXMLLoader.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/Backoffice.fxml"));
			} else {
				stage = (Stage) TL_BT_Acessar.getScene().getWindow();
				root = FXMLLoader.load(getClass().getResource("/br/ufrpe/sistema_mercadinho/gui/TelaLogins.fxml"));
			}
			Scene scene = new Scene(root);
			stage.setScene(scene);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
