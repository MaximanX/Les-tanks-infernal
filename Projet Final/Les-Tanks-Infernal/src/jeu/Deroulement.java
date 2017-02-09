package jeu;

import javafx.concurrent.Service;
import javafx.concurrent.Task;
import projectiles.ProjectilesFactory;
import tanks.Tank;
import terrain.Terrain;

public class Deroulement extends Service{
	private ProjectilesFactory pf;
	private Tank tk;
	private Terrain t;
	
	@Override
	protected Task createTask() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
