package terrain;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class IniTerrain {
	private final double XMAX = 1224;
	private final double YMAX = 664;
	private static Rectangle terrain = new Rectangle();
	
	
	public void creerTerrain(){
		terrain.setHeight(YMAX/3);
		terrain.setWidth(XMAX);
		terrain.setFill(Color.GREEN);
		terrain.setTranslateY(2*YMAX/3);
		terrain.setStroke(Color.BLACK);
	}
	
	public Rectangle getTerrain(){
		return terrain;
	}

}
