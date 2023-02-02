package de.buchhandlung.buchhandlung.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class MeineBuecher {
	
	@Id
	@Column(name="buch_id")
	private int id;
	
	
	private String name;
	private String autor;
	private String preis;
	
	public MeineBuecher() {
		
	}
	

	


	public MeineBuecher(int id, String name, String autor, String preis) {
		super();
		this.id = id;
		this.name = name;
		this.autor = autor;
		this.preis = preis;
	}





	@Override
	public String toString() {
		return "MeineBuecher [id=" + id + ", name=" + name + ", autor=" + autor + ", preis=" + preis + "]";
	}





	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getPreis() {
		return preis;
	}
	public void setPreis(String preis) {
		this.preis = preis;
	}

	
	
}
