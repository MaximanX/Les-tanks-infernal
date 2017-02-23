package tanks;

import armes.Armes;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.shape.Polygon;

/**
 * @author 1539762
 *
 */
public class Joueur extends Tank {

	private Armes[] A = Armes.values();
	private Armes arme = A[0];
	private SimpleDoubleProperty pointVie = new SimpleDoubleProperty();
	private SimpleDoubleProperty gaz = new SimpleDoubleProperty();
	private SimpleDoubleProperty posX = new SimpleDoubleProperty();
	private SimpleDoubleProperty posY = new SimpleDoubleProperty();
	private double angleCanon;
	private int vitesse;
	private Polygon tank;

	public Joueur(double posX, double posY) {/* TODO à remplir */

		this.posX.set(posX);
		this.posY.set(posY);
	}

	public double getPosX() {
		return posX.get();
	}

	public double getPosY() {
		return posY.get();
	}

	public void setPosX(double posX) {
		this.posX.set(posX);
	}

	public void setPosY(double posY) {
		this.posY.set(posY);
	}

	public SimpleDoubleProperty PosX() {
		return posX;

	};

	public SimpleDoubleProperty PosY() {
		return posY;

	};

	public Polygon getTank() {
		return tank;

	}

	public SimpleDoubleProperty getPointVie() {
		return pointVie;
	}

	public void setPointVie(double pointVie) {
		this.pointVie.set(pointVie);
	}

	public SimpleDoubleProperty getGaz() {
		return gaz;
	}

	public void setGaz(double gaz) {
		this.gaz.set(gaz);
	}

	public Armes getArme() {
		return arme;
	}

	@Override
	public Armes[] getA() {

		return A;
	}

	public void setArme(int i) {
		if (validerInt(i)) {
			arme = A[i];
		} else {
			arme = A[0];
		}
	}

	private boolean validerInt(int i) {
		boolean retour = false;
		if (i < A.length) {
			retour = true;
		}
		return retour;

	}

}
