package application;

import controlleurs.AccueilControlleur;
import controlleurs.OptionControlleur;
import controlleurs.PrincipalControlleur;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Infernal extends Application {
	private AccueilControlleur ac;
	private OptionControlleur oc;
	private PrincipalControlleur pc;
	private Stage stage;
	private Scene scene;
	private BorderPane root;




	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/vues/MenuPrincipale.fxml"));
		stage = arg0;
		root = loader.load();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.setTitle("LES TANKS INFERNAL");
		ac = loader.getController();
		stage.show();

	}
	
	public void creerInterface(){
		
	}
}
