package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	
	// construtor padrão
	// vários construtores, conceito de SOBRECARGA
	public Product() {
	}
	
	// construtor, não tem tipo de retorno, só public e nome da Classe
	// podem ser colocados parâmetros entre parenteses
	// executa no momento da instanciação do objeto
	// obriga a passar valores
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		//this é referência para o próprio objeto atributo
		// após o sinal de = é o parâmetro passado no construtor
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		//this.quantity = 0;
		//a linha 23 é opcional, pois por padrão quantity já receberá zero.
		// ou poderia ser suprimido apenas o this, pois como não tem parâmetro
		// não tem ambiguidade e a referência de quantity já é o atrib objeto.
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
			+ ", $ "
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValueInStock());	
	}

}
