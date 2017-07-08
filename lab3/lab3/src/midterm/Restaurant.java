package midterm;

import java.util.ArrayList;
import java.util.List;


public class Restaurant {

	public final int id;
	public final String name;
	public final String url;
	public final int[]designRatings={1,2,3,4,5}; 
	public final int[]tasteRatings={1,2,3,4,5};
	public Restaurant(int id, String name, String url) {
		super();
		this.id = id;
		this.name = name;
		this.url = url;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getUrl() {
		return url;
	}
	public int[] getDesignRatings() {
		return designRatings;
	}
	public int[] getTasteRatings() {
		return tasteRatings;
	}
	
	
	
}
