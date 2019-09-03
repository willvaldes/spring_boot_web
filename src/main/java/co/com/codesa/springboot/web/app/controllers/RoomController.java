package co.com.codesa.springboot.web.app.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/room")
public class RoomController {

	@GetMapping({ "/menu" })
	public String menu(Model model) {
		model.addAttribute("title", "Listado de habitaciones.");
		return "room/menu";
	}

	@GetMapping({ "/list" })
	public String list(@RequestParam(name = "nombre", defaultValue = "vacio") String p1,
			@RequestParam(name = "apellido", defaultValue = "vacio") String p2, Model model) {

		model.addAttribute("title", "Listado de habitaciones.");
		model.addAttribute("output", "Su nombre completo es: ".concat(p1).concat(" ").concat(p2));
		return "room/list";
	}

	@GetMapping({ "/list2" })
	public String list2(@RequestParam(name = "nombre", defaultValue = "vacio") String p1,
			@RequestParam(name = "apellido", defaultValue = "vacio") String p2,
			@RequestParam(name = "edad", defaultValue = "vacio") Long p3, Model model) {

		model.addAttribute("title", "Listado de habitaciones.");
		model.addAttribute("output", "Su nombre completo es: ".concat(p1).concat(" ").concat(p2)
				.concat(". Su edad es: ".concat(p3.toString())));
		return "room/list2";
	}

	@GetMapping({ "/list3" })
	public String list3(HttpServletRequest request, Model model) {
		String p1 = request.getParameter("nombre");
		String p2 = request.getParameter("apellido");
		Long p3 = null;
		try {
			p3 = Long.valueOf(request.getParameter("edad"));
		} catch (Exception e) {
			p3 = 1L;
		}
		model.addAttribute("title", "Listado de habitaciones.");
		model.addAttribute("output", "Su nombre completo es: ".concat(p1).concat(" ").concat(p2)
				.concat(". Su edad es: ".concat(p3.toString())));
		return "room/list3";
	}

}
