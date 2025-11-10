/*package eus.birt.dam.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import eus.birt.dam.domain.Disco;
import eus.birt.dam.domain.Grupo;
import eus.birt.dam.repository.RepositorioDisco;
import eus.birt.dam.repository.RepositorioGrupo;
import jakarta.transaction.Transactional;

@Component
public class BootStrapData implements CommandLineRunner{
	
	// traigo los repositorios
	@Autowired
	private RepositorioDisco rd;
	
	@Autowired
	private RepositorioGrupo rg;
	
	// realizo todo en una transacción para que no haya problemas al ser una relación
	// bidireccional la que hay entre guitarra y marca
	@Transactional
	// sobreescribo el run
	@Override
	public void run(String... arg0) throws Exception {
		
		// creo los objetos
		Disco d = new Disco("Titulo 2", 10);
		Grupo g = new Grupo("A&H", "Euskadi");
		d.setGrupo(g);
		g.getDiscos().add(d);
		
		// guardo los objetos en la bbdd
		rg.save(g);
		rd.save(d);
	}
}*/