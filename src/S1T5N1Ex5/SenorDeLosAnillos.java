package S1T5N1Ex5;

import java.io.Serializable;
import java.util.ArrayList;

public class SenorDeLosAnillos implements Serializable{//== Los Anillos De Poder

	//Atributs
	private int presupostM;
	private String guio;
	private ArrayList<String> repartiment;
	
	//Constructor
	public SenorDeLosAnillos(int presupuesto, String guio) {
		this.presupostM = presupuesto;
		this.guio = guio;
		this.repartiment = new ArrayList<>();
	}

	//Getters
	public int getPresupuesto() {
		return presupostM;
	}

	public String getGuio() {
		return guio;
	}

	public ArrayList<String> getRepartiment() {
		return repartiment;
	}

	//Setters
	public void setPresupuesto(int presupuesto) {
		this.presupostM = presupuesto;
	}

	public void setGuio(String guio) {
		this.guio = guio;
	}

	public void setRepartiment(ArrayList<String> repartiment) {
		this.repartiment = repartiment;
	}
	
	public void añadirActriu(String actriu) {
		
	}
	
}
