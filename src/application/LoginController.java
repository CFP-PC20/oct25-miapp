package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
	@FXML
	private TextField email;
	@FXML
	private PasswordField password;
	@FXML
	private Button login;

	@FXML
	private void tryToLogin (ActionEvent event) {
		System.out.println(email.getText() + password.getText());
		if (email.getText().equals("") && password.getText().equals("1234")) {
			System.out.println("test");
			Object switcher = new Switcher("application/MainPane.fxml", event);
		}
	}
}
