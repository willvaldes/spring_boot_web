package co.com.codesa.springboot.web.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import co.com.codesa.springboot.web.app.models.domain.Item;
import co.com.codesa.springboot.web.app.models.domain.Product;
import co.com.codesa.springboot.web.app.models.services.UsuarioService;
import co.com.codesa.springboot.web.app.models.services.UsuarioTercerosService;
import co.com.codesa.springboot.web.app.models.services.interfaces.IUsuarioService;

@Configuration
public class AppConfig {

	@Bean("simple")
	public IUsuarioService registrarUsuarioService() {
		return new UsuarioService();
	}

	@Bean("terceros")
	public IUsuarioService registrarUsuarioTercerosService() {
		return new UsuarioTercerosService();
	}

	@Bean("itemsReceipt")
	public List<Item> getItems() {

		List<Item> lItems = new ArrayList<>();
		Product product;
		product = new Product("Rope", new Double("2.5"));
		lItems.add(new Item(product, 2L));
		product = new Product("Cone", new Double("7.5"));
		lItems.add(new Item(product, 2L));
		return lItems;
	}

	@Primary
	@Bean("itemsReceiptDemo")
	public List<Item> getItemsDemo() {

		List<Item> lItems = new ArrayList<>();
		Product product;
		product = new Product("Block", new Double("2.5"));
		lItems.add(new Item(product, 3L));
		product = new Product("Notebook", new Double("2.9"));
		lItems.add(new Item(product, 2L));
		product = new Product("Pen", new Double("4.3"));
		lItems.add(new Item(product, 5L));
		product = new Product("Pencil", new Double("6.8"));
		lItems.add(new Item(product, 1L));
		return lItems;
	}
}
