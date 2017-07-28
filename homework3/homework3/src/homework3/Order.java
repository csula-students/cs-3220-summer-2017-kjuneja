package homework3;

import java.util.Date;

public class Order {
	public FoodItem fooditems;
	private final int id;
	private final String items;
	private final String custname;
	private enum Status {IN_QUEUE, IN_PROGRESS, COMPLETED};
	private final Date created;
	private final Status status;
	public Order(FoodItem fooditems, int id, String items, String custname, Date created, Status status) {
		super();
		this.fooditems = fooditems;
		this.id = id;
		this.items = items;
		this.custname = custname;
		this.created = created;
		this.status = status;
	}
	public FoodItem getFooditems() {
		return fooditems;
	}
	public void setFooditems(FoodItem fooditems) {
		this.fooditems = fooditems;
	}
	public int getId() {
		return id;
	}
	public String getItems() {
		return items;
	}
	public String getCustname() {
		return custname;
	}
	public Date getCreated() {
		return created;
	}
	public Status getStatus() {
		return status;
	}
	
	
}
