package co.com.codesa.springboot.web.app.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vehicle")
public class VehicleController {
	
	@Value("${vehiclecontroller.index.titulo}")
	private String indexTitulo;

	@GetMapping({ "/menu" })
	public String menu(Model model) {
		model.addAttribute("title", "Listado de vehiculos.");
		return "vehicle/menu";
	}

	@GetMapping({ "/list/{plate}/{plate2}" })
	public String list(@PathVariable(name = "plate") String p1, @PathVariable(name = "plate2") Long p2, Model model) {

		model.addAttribute("title", indexTitulo);
		model.addAttribute("output", "La placa del vehiculo es: ".concat(p1).concat("-").concat(p2.toString()));
		return "vehicle/list";
	}

}
