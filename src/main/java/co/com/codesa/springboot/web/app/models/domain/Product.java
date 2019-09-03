package co.com.codesa.springboot.web.app.models.domain;

public class Product {

	private String name;
	private Double price;

	public Product(String nombre, Double price) {
		this.name = nombre;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
