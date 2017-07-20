package lab4;

public class FoodItem {
 
	public final int id;
	public final String name;
	public final String description;
	public final String imageurl;
	public final String price;
	public FoodItem(int id, String name, String description, String imageurl, String price) {
		
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
	public String getPrice() {
		return price;
	}
	
	
}
