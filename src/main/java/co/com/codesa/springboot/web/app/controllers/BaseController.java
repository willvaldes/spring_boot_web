package co.com.codesa.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/base")
public class BaseController {

	// @RequestMapping(value = "/index", method = RequestMethod.GET)
	@GetMapping({ "/index", "/", "", "/home" })
	public String index(Model model) {
		model.addAttribute("title", "Ha entrado a base");
		return "index";
	}

	@GetMapping({ "/index2" })
	public ModelAndView index2(ModelAndView modelView) {
		modelView.addObject("title", "Ha entrado a base map java MV Index 2");
		modelView.setViewName("index2");
		return modelView;
	}

}
