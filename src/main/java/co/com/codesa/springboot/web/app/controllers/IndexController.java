package co.com.codesa.springboot.web.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import co.com.codesa.springboot.web.app.models.services.interfaces.IUsuarioService;

@Controller
public class IndexController {

	@Autowired
	@Qualifier("terceros")
	private IUsuarioService usuarioService;

	@GetMapping({ "/index", "/", "", "/home" })
	public String index(Model model) {
		model.addAttribute("title", "Buenas noches " + usuarioService.findUserName(123L));
		return "index";
	}

	@GetMapping({ "/redirect" })
	public String redirect(Model model) {
		model.addAttribute("title", "Buenas noches");
		return "redirect:/vehicle/menu";
	}

	@GetMapping({ "/redirectG" })
	public String redirectG(Model model) {
		model.addAttribute("title", "Buenas noches");
		return "redirect:https://www.google.com/";
	}

	@GetMapping({ "/forward" })
	public String forward(Model model) {
		model.addAttribute("title", "Buenas noches");
		return "forward:/vehicle/menu";
	}

	@GetMapping({ "/index2" })
	public ModelAndView index2(ModelAndView modelView) {
		modelView.addObject("title", "Buenas noches map java MV Index 2");
		modelView.setViewName("index2");
		return modelView;
	}

}
