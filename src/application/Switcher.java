package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Switcher {
	public Switcher (String res, ActionEvent ev) {
		try {
			System.out.println("funca");
			Parent parent = FXMLLoader.load(getClass().getClassLoader().getResource(res));
			Scene newScene = new Scene(parent);
			Stage stage = (Stage) ((Node) ev.getSource()).getScene().getWindow();
			stage.setScene(newScene);
			stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
