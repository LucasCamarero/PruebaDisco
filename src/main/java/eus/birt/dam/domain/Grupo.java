package eus.birt.dam.domain;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//anotaciones Lombok
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//anotaciones hybernate
@Entity
public class Grupo {
	
	// atributos
	@Id
	@SequenceGenerator(name = "col_gen2", sequenceName = "col_sqe2",schema="pruebadiscos", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "col_gen2")
	private int id;
	
	@Column
	private String nombre;
	
	@Column
	private String pais;
	
	@OneToMany (mappedBy = "grupo",cascade = CascadeType.ALL)
	//@JoinColumn (name = "grupo_id")
	List <Disco> discos = new ArrayList<>();

	// constructor no incluido en Lombok
	public Grupo(String nombre, String pais) {
		this.nombre = nombre;
		this.pais = pais;
	}
}
