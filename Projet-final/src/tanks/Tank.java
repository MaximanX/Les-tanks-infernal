package tanks;

import armes.Armes;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.value.ObservableValue;
import javafx.scene.shape.Polygon;

public abstract class Tank {
	private Armes[] A = Armes.values();
	private Armes arme = A[0];
	private SimpleDoubleProperty pointVie;
	private SimpleDoubleProperty gaz;
	private SimpleDoubleProperty posX;
	private SimpleDoubleProperty posY;
	private double angleCanon;
	private int vitesse;
	private Polygon tank;
	public static final int MAX_X = 1224;
	public static final int MIN_X = 0;
	public static final int MAX_Y = 664;
	public static final int MIN_Y = 0;

	/*
	 * TODO get/set
	 */
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

	}

	public Polygon getTank() {
		return tank;

	}

	public double getPointVie() {
		return pointVie.get();
	}

	public SimpleDoubleProperty pointVie() {
		return this.pointVie;
	}

	public void setPointVie(double pointVie) {
		this.pointVie.set(pointVie);
	}

	public SimpleDoubleProperty gaz() {
		return this.gaz;
	}

	public void setGaz(double gaz) {
		this.gaz.set(gaz);
	}

	public Armes getArme() {
		return arme;
	}

	public void setArme(int i) {

		arme = A[i];

	}

	public Armes[] getA() {
		return A;
	}

}
