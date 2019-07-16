package model.domain.dto;

import lombok.Data;

@Data
public class Topping {
	
	String name;
	int price;
	
	@Override
	public String toString() {
		return name + " " + price + "��";
	}

	public Topping(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
}
