package controlleurs;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import jeu.Deroulement;
import jeu.Jeu;
import terrain.IniTerrain;

public class PrincipalControlleur {
	private Jeu jeu;
	private IniTerrain iniTerrain = new IniTerrain();
	private Deroulement deroulement = new Deroulement();
	private int compteurChangement = 0;
	@FXML
	private ImageView ImageArme;

	@FXML
	private Label LabelArme;

	@FXML
	private Label NomPlayer1;

	@FXML
	private ProgressBar BarreDeViePlayer1;

	@FXML
	private ProgressBar BarreDeGasPlayer1;

	@FXML
	private Label NomPlayer2;

	@FXML
	private ProgressBar BarreDeViePlayer2;

	@FXML
	private ProgressBar BarreDeGasPlayer2;

	@FXML
	private ImageView ImageVent;

	@FXML
	private Label LabelVent;

	@FXML
	private ImageView ImageConditionTerrain;

	@FXML
	private Label LabelConditionTerrain;

	@FXML
	private ImageView ImageSwag;

	@FXML
	private Pane MainPannel;

	@FXML
	private void initialize() {
		iniTerrain.creerTerrain();
		MainPannel.getChildren().add(iniTerrain.getTerrain());
		deroulement.initialisation();
		ajouterTank();
		deroulement.start();
		resetBarresDeVieGaz();
		LabelVent.textProperty().bind(deroulement.getVent());
		ImageArme.setImage(new Image((deroulement.getTank()[0].getArme().getPath())));

	}

	@FXML
	void tirer(MouseEvent event) {
		System.out.println("BOUM!!");
	}
	
	/**
	 * La fonction qui s'occupe de placer un tank sur l'écran et le cannon
	 */

	private void ajouterTank() {
		Polygon tank;
		Line cannon;
		for (int x = 0; x < deroulement.getTank().length; x++) {
			cannon = new Line(0.0, 0.0,30.0, 0.0);
			tank = new Polygon();
			tank.getPoints().addAll(new Double[] { 0.0, 20.0, 0.0, 10.0, 5.0, 5.0, 5.0, 0.0, 10.0, 0.0, 10.0, 5.0, 15.0,
					10.0, 15.0, 20.0, 0.0, 20.0 }); /* TODO un plus beau tank */
			cannon.translateXProperty().bind(deroulement.getTank()[x].PosX().add(5.0));
			cannon.translateYProperty().bind(deroulement.getTank()[x].PosY().add(10.0));
			tank.translateXProperty().bind(deroulement.getTank()[x].PosX());
			tank.translateYProperty().bind(deroulement.getTank()[x].PosY());
			MainPannel.getChildren().add(cannon);
			MainPannel.getChildren().add(tank);
		}
	}
	
	

	/**
	 * S'occupe d'initialiser les barres de vie pour le player et l'AI
	 */
	
	private void resetBarresDeVieGaz() {
		BarreDeViePlayer1.progressProperty().bind(deroulement.getTank()[0].pointVie());
		deroulement.getTank()[0].setPointVie(1);
		BarreDeGasPlayer1.progressProperty().bind(deroulement.getTank()[0].gaz());
		deroulement.getTank()[0].setGaz(1);

		// À ajouter lorsque l'AI sera initiallisé
		/*
		 * BarreDeViePlayer2.progressProperty().bind(deroulement.getTank()[1].getPointVie());
		 * deroulement.getTank()[1].setPointVie(1);
		 */
	}
	
	/**
	 * S'occupe du changment d'arme et scrollant la souris
	 * @param event
	 */

	@FXML
	void changementArme(ScrollEvent event) {
		if ((compteurChangement + 1) < deroulement.getTank()[0].getA().length) {
			compteurChangement++;
			deroulement.getTank()[0].setArme(compteurChangement);
		} else {
			compteurChangement = 0;
			deroulement.getTank()[0].setArme(compteurChangement);
		}
		ImageArme.setImage(new Image((deroulement.getTank()[0].getArme().getPath())));

	}
	
	
	

}
