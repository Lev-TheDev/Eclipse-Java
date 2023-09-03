package entities;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDateTime moment;
	private OrderStatus status;
	
	private Client client;
	private List<OrderItem> items = new ArrayList<>();
	
	public Order() {
	}

	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}
	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		double sum = 0.00;
		for (OrderItem i : items) {
			sum += i.subTotal();
		}
		return sum;
	}
	
	DecimalFormat fmt3 = new DecimalFormat("0.00");
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: " + moment.format(fmt1) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client.getName() + " (" + client.getBirthDate().format(fmt2) + ") - " + client.getEmail() + "\n");
		sb.append("Order items: \n");
		for (OrderItem i : items) {
			sb.append(i.getProduct() + ", $" + fmt3.format(i.getPrice()) + ", Quantity: " + i.getQuantity() + ", Subtotal: $" + fmt3.format(i.getPrice()*i.getQuantity()) + "\n");
		}
		sb.append("Total price: $" + fmt3.format(total()));
		return sb.toString();
	}
}