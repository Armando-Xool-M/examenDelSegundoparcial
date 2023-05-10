package com.example.demo.controler;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.example.demo.modelo.tramitesDTO;

import org.springframework.ui.Model;



@Controller
@RequestMapping("/Tramites")
public class TramiteController {
	@GetMapping("{tr}")
	public String startMethod (@PathVariable("tr") String tr, Model model) {
		String titulo = "Pagina API con Spring Boot";
		model.addAttribute("name", tr);
		model.addAttribute("titulo", titulo);
		tramitesDTO consultaTramites = tramites (tr);
		model.addAttribute("consultaTramites", consultaTramites);
		return "Tramites";
	}
	
	public tramitesDTO tramites (String numID) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<tramitesDTO> resp =
				restTemplate
				.getForEntity(
						String.format("https://myappfb-4718b.firebaseio.com/campeche/tramites/%s.json", numID),
						tramitesDTO.class);
		return resp.getBody();
	
	
	}
}
