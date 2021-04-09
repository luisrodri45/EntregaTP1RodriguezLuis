package are.edu.unju.fi.tp1pto1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuOperacionesController {

	@GetMapping("/menu")
	public String getVinculosPage() {
		return "menuoperaciones";
	}
}
