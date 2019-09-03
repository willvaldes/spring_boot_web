package co.com.codesa.springboot.web.app.controllers;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.annotation.RequestScope;

import co.com.codesa.springboot.web.app.models.domain.Client;
import co.com.codesa.springboot.web.app.models.domain.Receipt;

@Controller
@RequestScope
@RequestMapping("/receipt")
public class ReceiptController {

	@Autowired
	private Receipt receipt;

	@PostConstruct
	public void init() {
		Client client = new Client();
		client.setName("Aquí");
		client.setLastname("Allá");
		receipt.setClient(client);
		
		if (receipt.getDescription() == null) {
			receipt.setDescription("Ahí");
		} else {
			receipt.setDescription(receipt.getDescription().concat("Ahí"));
		}
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Entró al predestroy");
	}

	@GetMapping({ "/menu" })
	public String menu(Model model) {
		model.addAttribute("title", "Listado de habitaciones.");
		model.addAttribute("receipt", receipt);
		return "receipt/menu";
	}

}
