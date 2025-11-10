package eus.birt.dam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import eus.birt.dam.repository.RepositorioDisco;
import eus.birt.dam.repository.RepositorioGrupo;

@Controller
public class MainController {
	
	// traigo los repositorios
	@Autowired
   	private RepositorioDisco rd;
	@Autowired
   	private RepositorioGrupo rg;
	
	// dirige a index
	@GetMapping ({"/","/welcome"})
	public String welcome() {
		return "index";
	}
	/*
	// dirige a guitarras y muestra un listado de las mismas
	@GetMapping ({"/guitarras"})
	public String getGuitarras(Model model) {
		model.addAttribute("guitarras", rg.findAll());
		return "guitarras";
	}
	
	// dirige a marcas y muestra un listado de las mismas
	@GetMapping ({"/marcas"})
	public String getMarcas(Model model) {
		model.addAttribute("marcas", rm.findAll());
		return "marcas";
	}
	*/
}