package tn.edu.esprit.gl8.weddingApp.domain.oneToOneBi;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Man
 *
 */
@Entity

public class Man implements Serializable {

	
	private int id;
	private static final long serialVersionUID = 1L;
	
	private Woman woman;

	public Man() {
		super();
	}   
	@Id    
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@OneToOne(mappedBy="man")
	public Woman getWoman() {
		return woman;
	}
	public void setWoman(Woman woman) {
		this.woman = woman;
	}
   
}
