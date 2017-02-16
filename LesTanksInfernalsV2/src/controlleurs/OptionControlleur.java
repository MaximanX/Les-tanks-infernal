package controlleurs;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class OptionControlleur {
	AccueilControlleur ac;
	@FXML
	private Slider volumeMusique;

	@FXML
	private Button Retour;

	@FXML
	private Label Volume;

	@FXML
	void retourMenu(ActionEvent event) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/vues/MenuPrincipale.fxml"));
		BorderPane root = loader.load();
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.setScene(new Scene(root));
		stage.setResizable(false);
		stage.setTitle("LES TANKS INFERNAL");
		ac = loader.getController();
		stage.show();
	}

	@FXML
	public void initialize() {
		Volume.textProperty().bind(volumeMusique.valueProperty().asString());
	}
}
