package tn.edu.esprit.gl8.weddingApp.domain.oneToOneUni;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Closet
 *
 */
@Entity

public class Closet implements Serializable {

	
	private int id;
	private static final long serialVersionUID = 1L;
	
	private Person person;

	public Closet() {
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
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
   
}
