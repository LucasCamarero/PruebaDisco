package eus.birt.dam.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// anotaciones Lombok
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
// anotaciones hybernate
@Entity
public class Disco{

	// atributos
	@Id
	@SequenceGenerator(name = "col_gen", sequenceName = "col_sqe",schema="pruebadiscos", allocationSize = 1)
	
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "col_gen")
    private int id;
    
	@Column
	private String titulo;
	
	@Column
	private int num_canciones;
	
	@ManyToOne
	@JoinColumn (name = "grupo_id")
	private Grupo grupo;

	// constructor no incluido en Lombok
	public Disco(String titulo, int num_canciones) {
		this.titulo = titulo;
		this.num_canciones = num_canciones;
	}
}