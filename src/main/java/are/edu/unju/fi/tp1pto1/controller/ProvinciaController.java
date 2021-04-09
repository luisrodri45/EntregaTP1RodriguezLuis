package are.edu.unju.fi.tp1pto1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import are.edu.unju.fi.tp1pto1.model.Provincia;
@Controller
public class ProvinciaController {
	@GetMapping("/provincia")
	public String getprovinciano(Model model) {
		Provincia prov=new Provincia(0, "Salta");
		model.addAttribute("p", prov);
		return "provincias";
	}

}
