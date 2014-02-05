package tn.edu.esprit.gl8.weddingApp.domain.oneToManyBi;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Appartment
 *
 */
@Entity

public class Appartment implements Serializable {

	
	private int id;
	private static final long serialVersionUID = 1L;
	
	private Building building;

	public Appartment() {
		super();
	}   
	@Id    
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@ManyToOne
	public Building getBuilding() {
		return building;
	}
	public void setBuilding(Building building) {
		this.building = building;
	}
   
}
