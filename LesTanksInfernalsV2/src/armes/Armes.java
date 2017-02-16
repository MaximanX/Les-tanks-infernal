package armes;

import java.util.List;

public enum Armes {
	SIN,COSEC, TAN,ABS,RATIONNELE,NORMAL,REBOND, FRAGSOL,FRAGAIR;
	private Object[] armes;
	private int selection;
	Armes(){
		
	}
	
	public Object getArmeselectionner(){
		return armes[selection];
	}
	 /*
	  * TODO le reste 
	  */
}
