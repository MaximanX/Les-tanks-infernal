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

	}

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

	public void setArme(int i) {
		
			arme = A[i];
		
	}

	
	
	
	
	public Armes[] getA() {
		return A;
	}

}
