package projectiles;

import tanks.Tank;

public class Projectiles {
	private double dommages;
	private boolean collision;
	private int rebonds;
	private Object nomArme;
	private double posX;
	private double posY;
	private double temps;
	private double hauteur;
	private double longueur;
	private double masse;
	public Projectiles(double hauteur,double longueur,Tank lanceur){
		nomArme = lanceur.getArme;
		switch(nomArme.tostring){
		case "SIN":
			dommages = 10;
			collision = false;
			rebonds = 0;
			posX = lanceur.getposX;
			posY = lanceur.getposY;
			temps = 0;
			this.hauteur = hauteur;
			this.longueur = longueur;
			masse=0;
		case "REBOND":
			dommages = 10;
			collision = true;
			rebonds = 5;
			posX = lanceur.getposX;
			posY = lanceur.getposY;
			temps = 0;
			this.hauteur = hauteur;
			this.longueur = longueur;
			masse=20;
		}
	}
	private void mouvement(){
		switch(nomArme.tostring){
		case "SIN":
			posX += hauteur*Math.sin(temps/longueur);
			posY += hauteur*Math.sin(temps/longueur);
			temps++;
		case "REBOND":
			posX vent+gravité;
		}
	}
}
