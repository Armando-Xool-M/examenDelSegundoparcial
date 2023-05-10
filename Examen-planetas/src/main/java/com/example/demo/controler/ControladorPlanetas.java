package com.example.demo.controler;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;


import com.example.demo.modelo.planetasDTO;

@Controller
@RequestMapping("/Planetas")

public class ControladorPlanetas {
	
	@GetMapping("{cl}")
	public String startMethod (@PathVariable("cl") String cl, Model model) {
		String titulo = "Pagina API con Spring Boot";
		model.addAttribute("name", cl);
		model.addAttribute("titulo", titulo);
		planetasDTO inicioPlaneta = planetasDTO (cl);
		model.addAttribute("inicioPlaneta", inicioPlaneta);
		return "planetas";
	}
	
	public planetasDTO planetasDTO (String numID) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<planetasDTO> resp =
				restTemplate
				.getForEntity(
						String.format("https://myappfb-4718b.firebaseio.com/campeche/planetas/%s.json", numID),
						planetasDTO.class);
		return resp.getBody();
	
	
	}
}
