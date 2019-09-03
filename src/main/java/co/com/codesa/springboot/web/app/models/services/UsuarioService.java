package co.com.codesa.springboot.web.app.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import co.com.codesa.springboot.web.app.models.services.interfaces.IUsuarioService;

//@Primary
//@Service("simple")
public class UsuarioService implements IUsuarioService {

	@Override
	public String findUserName(Long idUser) {
		return "usuario código:".concat(idUser.toString());
	}

}
