package tn.edu.esprit.gl8.weddingApp.domain.oneToOneBi;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Woman
 *
 */
@Entity

public class Woman implements Serializable {

	
	private int id;
	private static final long serialVersionUID = 1L;
	
	private Man man;

	public Woman() {
		super();
	}   
	@Id    
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@OneToOne
	public Man getMan() {
		return man;
	}
	public void setMan(Man man) {
		this.man = man;
	}
   
}
