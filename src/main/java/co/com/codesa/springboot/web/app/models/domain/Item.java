package co.com.codesa.springboot.web.app.models.domain;

public class Item {

	private Product product;
	private Long amount;

	public Item(Product product, Long amount) {
		this.product = product;
		this.amount = amount;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Double calculateTotal() {
		return this.product.getPrice() * this.amount;
	}
}
