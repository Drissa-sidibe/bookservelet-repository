package bookshopServlet;


public class Car {
	private int id;
	private String name;
	private String model;
	private String description;
	private String picture;
	private String price;
	
	public Car() {
		super();
	}
	public Car(int id, String name, String model, String description, String picture, String price) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.description = description;
		this.picture = picture;
		this.price = price;
	}
	public Car(String name, String model, String description, String picture, String price) {
		super();
		this.name = name;
		this.model = model;
		this.description = description;
		this.picture = picture;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", model=" + model + ", description=" + description + ", picture="
				+ picture + ", price=" + price + "]";
	}
	
	
}
