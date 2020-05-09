package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.controller.models.Lista;


@Controller
public class indexController {

	@GetMapping ({"/indexl", "/,", ""})
	public String index(Model model) {
		model.addAttribute("titulo", "Bienvenidos al MERCADO FTC´s");
		
		return "indexl";
	}
	
	@ModelAttribute ("listas")
	public List<Lista> poblarLista() {				
		List<Lista> listas = Arrays.asList(
				new Lista("Gansito", "Marinela", "$15", "10", "Pastelito sabor chocolate", "Marinela"));		
		
		return listas;
	}
	
}
