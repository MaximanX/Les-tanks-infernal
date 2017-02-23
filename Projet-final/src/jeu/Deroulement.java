package jeu;

import java.util.ArrayList;
import java.util.Random;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import projectiles.ProjectilesFactory;
import tanks.*;
import terrain.IniTerrain;

public class Deroulement extends Service<Void>{
	private ProjectilesFactory pf;
	private Tank[] tk;
	private IniTerrain terrain = new IniTerrain();
	private boolean findujeu=false;
	public final static int VENT_MAX = 20;
	public final static int VENT_MIN = -20;
	private SimpleStringProperty vent = new SimpleStringProperty();
	private int[] variationVent = {0,0,0,0,0,0,0,0,-1,1};
	private int ventCache = 0;
	
	/**
	 * Thread servant à faire la gravité des tanks et le changement du vent
	 */
	
	@Override
	protected Task<Void> createTask() {
		return new Task<Void>(){
			@Override
			protected Void call() throws Exception {
				while(!findujeu){
					
					graviteTank();
					//setVent(ventCache);
					variationDesVents();
					
					Thread.sleep(30);
				}
				return null;
			}
		};
	}
	private void deplacementTanks(){
		/*
		 * TODO do it!!
		 */
	}
	private void deplacementProjectiles(){
		
	}
	private void collisions(){
		/*
		 * TODO faut comprendre la map pour faire sa!!!!
		 */
	}
	
	/**
	 * S'occupe de déplacer le tank vers le bas jusqu'à ce qu'il rencontre le sol
	 */
	
	private void graviteTank(){
		for(int x=0;x<tk.length;x++){
			if(terrain.getTerrain().getTranslateY() >= tk[x].getPosY()+20)
				tk[x].setPosY(tk[x].getPosY()+2);
		}
	}
	
	/**
	 * Initialise les tanks en jeu
	 */
	
	public void initialisation(){
		tk = new Tank[]{new Joueur(100, 100)/* new IA*/};
	}
	public Tank[] getTank(){
		return tk;
	}
	public SimpleStringProperty getVent() {
		return vent;
		
		/**
		 * Prend un int et set en string
		 */
	}
	public void setVent(int vent) {
		this.vent.set(String.valueOf(vent));
	}
	
	/**
	 * Varie le vent en donnant une valeur aléatoire entre -1 et 1 et l'ajoute à ventcache
	 */
	
	private void variationDesVents() {
		Random rand = new Random();
		int temp = rand.nextInt(3) - 1;
		ventCache = ventCache + temp;
	}
	
	
}
