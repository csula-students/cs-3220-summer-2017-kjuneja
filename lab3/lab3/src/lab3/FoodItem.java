package lab3;

public class FoodItem {
 
	public final int id;
	public final String name;
	public final String description;
	public final String imageurl;
	public final double price;
	public FoodItem(int id, String name, String description, String imageurl, double price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.imageurl = imageurl;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public String getImageurl() {
		return imageurl;
	}
	public double getPrice() {
		return price;
	}
	
}