package homework2;

import java.util.Date;

public class Order {
	private final int id;
	private final String items;
	private final String custname;
	private enum Status {IN_QUEUE, IN_PROGRESS, COMPLETED};
	private final Date created;
	
		
	public Order(int id, String items, String custname, Date created) {
		super();
		this.id = id;
		this.items = items;
		this.custname = custname;
		this.created = created;
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
	public String getinqueueStatus() {
		return Status.IN_QUEUE.toString();
	}

	public String getinprogressStatus() {
		return Status.IN_PROGRESS.toString();
	}

	public String getcompletedstatus() {
		return Status.COMPLETED.toString();
	}

	
	
	
	
	
	
	

}
