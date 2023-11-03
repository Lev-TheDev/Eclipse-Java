package model.entities;

import model.enums.Color;

public abstract class AbstractShape implements Shape {
	
	private Color color;

	public AbstractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	// quando adiciono abstract após public, na classe, o compilador deixa eu não
	// implementar o método área, aí quem implementa são as subclasses
	
}
