package co.com.codesa.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	// @RequestMapping(value = "/index", method = RequestMethod.GET)
	@GetMapping({ "/index", "/", "/home" })
	public String index(Model model) {
		model.addAttribute("title", "Buenas noches");
		return "index";
	}

	@GetMapping({ "/index2" })
	public ModelAndView index2(ModelAndView modelView) {
		modelView.addObject("title", "Buenas noches map java MV Index 2");
		modelView.setViewName("index2");
		return modelView;
	}

}
