package controlleurs;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import jeu.Jeu;

public class PrincipalControlleur {
	private Jeu j;
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

}
