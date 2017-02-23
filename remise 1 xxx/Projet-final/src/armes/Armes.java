package armes;

import java.util.List;

public enum Armes {
	SIN("sinus", "armes/sin(x).png"), COSEC("cosec", "armes/cosec(x).png"), TAN("tan", "armes/tan(x).png"), ABS(
			"absolue", "armes/abs(x).png"), RATIONNELE("rationnelle", "armes/rationelle.png"), NORMAL("normal",
					"armes/normal.png"), REBOND("rebond", "armes/Rebond.png"), FRAGSOL("fragsol",
							"armes/fragSol.png"), FRAGAIR("fragair", "armes/fragAir.png");
	private Object[] armes;
	private int selection;
	private String path;
	private String nom;

	Armes(String nom, String path) {
		this.nom = nom;
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public String getNom() {
		return this.nom;
	}

	public Object getArmeselectionner() {
		return armes[selection];
	}

}
