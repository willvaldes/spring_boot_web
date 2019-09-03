package co.com.codesa.springboot.web.app.models.services;

import org.springframework.stereotype.Service;

import co.com.codesa.springboot.web.app.models.services.interfaces.IUsuarioService;

//@Service("terceros")
public class UsuarioTercerosService implements IUsuarioService {

	@Override
	public String findUserName(Long idUser) {
		return "usuario tercero código ".concat(idUser.toString());
	}

}
