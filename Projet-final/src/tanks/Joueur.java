package tanks;

import java.awt.Point;

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
	private Point cannonBase;
	private Point cannonBout;
	private int vitesse;
	private Polygon tank;

	public Joueur(double posX, double posY) {/* TODO à remplir */

		setPosX(posX);
		setPosY(posY);
		setCannonBase(posX + 7, posY + 10);
		setCannonBout(posX + 30, posY + 10);
	}

	public double getPosX() {
		return posX.get();
	}

	public double getPosY() {
		return posY.get();
	}

	public void setPosX(double posX) {
		if (verifierX(posX)) {
			this.posX.set(posX);
		}
	}

	private boolean verifierX(double posX) {
		boolean result = false;
		if ((posX >= MIN_X) && (posX <= MAX_X)) {
			result = true;
		}
		return result;
	}

	public void setPosY(double posY) {
		if (verifierX(posY)) {
			this.posY.set(posY);
		}
	}

	private boolean verifierY(double posY) {
		boolean result = false;
		if ((posY >= MIN_Y) && (posY <= MAX_Y)) {
			result = true;
		}
		return result;
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

	public SimpleDoubleProperty pointVie() {
		return this.pointVie;
	}

	public double getPointVie() {
		return this.pointVie.get();

	}

	public void setPointVie(double pointVie) {
		this.pointVie.set(pointVie);
	}

	public SimpleDoubleProperty gaz() {
		return this.gaz;
	}

	public double getGaz() {
		return gaz.get();
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

	public Point getCannonBase() {
		return cannonBase;
	}

	public void setCannonBase(double posX2, double posY2) {

		if ((posX2 < MAX_X) && (posX2 > MIN_X) && (posY2 < MAX_Y) && (posY2 > MAX_Y)) {
			this.cannonBase.setLocation(posX2, posY2);
		}

	}

	public Point getCannonBout() {
		return cannonBout;
	}

	public void setCannonBout(double x, double y) {
		
		if ((x < MAX_X) && (x > MIN_X) && (y < MAX_Y) && (y > MAX_Y)) {
			this.cannonBout.setLocation(x, y);
		}
	}

}
