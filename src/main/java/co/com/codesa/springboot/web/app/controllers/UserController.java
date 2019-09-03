package co.com.codesa.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.com.codesa.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("user")
public class UserController {

	@RequestMapping({ "/profile" })
	public ModelAndView profile(ModelAndView modelView) {
		Usuario user = new Usuario();
		user.setApellido("Valdes");
		user.setNombre("William");
		user.setEmail("demo@demo.com");
		modelView.addObject("title", "Perfil de usuario: ".concat(user.getNombre()));
		modelView.addObject("user", user);
		modelView.setViewName("user/profile");
		return modelView;
	}

	@RequestMapping({ "/list" })
	public ModelAndView list(ModelAndView modelView) {

		modelView.addObject("title", "Listado de usuarios.");
		modelView.setViewName("user/list");
		return modelView;
	}

	@ModelAttribute("lUsers")
	public List<Usuario> loadUsers() {
		List<Usuario> lUsers = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			lUsers.add(new Usuario("nombre" + i, "apellido" + i, "email" + i));
		}
		return lUsers;
	}

}
