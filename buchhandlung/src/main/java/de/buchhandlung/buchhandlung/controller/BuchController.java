package de.buchhandlung.buchhandlung.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import de.buchhandlung.buchhandlung.entity.Buch;
import de.buchhandlung.buchhandlung.service.BuchService;

@Controller
public class BuchController {
	
	@Autowired
	private BuchService buchService;
	
	@GetMapping("/")
			public String home () {
					return "home";

}
	
	@GetMapping("/buch_anmelden")
	public String buchAnmelden() {
		return "buch_anmelden";
	}
	
	@GetMapping("/erhaltliches_buecher")
	public ModelAndView getAllBuch() {
		List<Buch> list=buchService.getAllBuch();
//		ModelAndView m = new ModelAndView();
//		m.setViewName("buchList");
//		m.addObject("buch", list);
		return new ModelAndView("buchList","buch",list);
	}
	
	@PostMapping("/save")
	public String addBuch(@ModelAttribute Buch b) {
		buchService.save(b);
		
		return "redirect:/erhaltliches_buecher";
	}
	
		
	
}
