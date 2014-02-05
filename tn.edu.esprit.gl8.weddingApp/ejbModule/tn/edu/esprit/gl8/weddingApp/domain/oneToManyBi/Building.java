package tn.edu.esprit.gl8.weddingApp.domain.oneToManyBi;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Building
 *
 */
@Entity

public class Building implements Serializable {

	
	private int id;
	private static final long serialVersionUID = 1L;
	
	private List<Appartment> appartments;

	public Building() {
		super();
	}   
	@Id    
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@OneToMany(mappedBy="building")
	public List<Appartment> getAppartments() {
		return appartments;
	}
	public void setAppartments(List<Appartment> appartments) {
		this.appartments = appartments;
	}
   
}
