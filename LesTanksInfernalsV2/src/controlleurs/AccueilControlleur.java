package controlleurs;

import java.io.IOException;

import application.Infernal;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class AccueilControlleur {
	AccueilControlleur ac;
	private OptionControlleur oc;
	@FXML
	private ImageView MenuImage;

	@FXML
	private Button QuitterButton;

	@FXML
	private Button JouerButton;

	@FXML
	private Button OptionButton;

	@FXML
	void afficherJeu(ActionEvent event) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/vues/LesTanksInfernals.fxml"));
		BorderPane root = loader.load();
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.setScene(new Scene(root));
		stage.setResizable(false);
		stage.setTitle("LES TANKS INFERNAL");
		ac = loader.getController();
		stage.show();
	}

	@FXML
	void options(ActionEvent event) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/vues/Options.fxml"));
		BorderPane root = loader.load();
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.setScene(new Scene(root));
		stage.setResizable(false);
		stage.setTitle("LES TANKS INFERNAL");
		oc = loader.getController();
		stage.show();
	}

	@FXML
	void quitter(ActionEvent event) {
		Platform.exit();

	}

}
