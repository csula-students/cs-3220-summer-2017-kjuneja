package homework4;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class OrderDAO implements DAO<Order> {
	public void add(Order entry) {
        Database db = new Database();
        try (Connection c = db.connection()) {
            PreparedStatement pstmt = c.prepareStatement("INSERT INTO orders (item_id,item_img,castomer_name,created,statuse) VALUES ( ?,?,?,?,?)");
            pstmt.setInt(1, entry.getId());
            pstmt.setString(2, entry.getItems());
            pstmt.setString(3, entry.getCustname());
            pstmt.setDate(4,(Date) entry.getCreated());
            pstmt.setString(5, entry.getStatus()); 
            pstmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

	@Override
	public List<Order> list() {
		 List<Order> list = new ArrayList<>();
	        Database db = new Database();
	        try (Connection c = db.connection()) {
	            Statement stmt = c.createStatement();
	            ResultSet rs = stmt.executeQuery("SELECT * FROM orders");
	            while (rs.next()) {
	                list.add(new Order(
	                    rs.getInt("id"),
	                    rs.getString("items"),
	                    rs.getString("custname"),
	                    rs.getDate ("created"),
	                    rs.getString("status")
	                ));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return list;
	        }
	        return list;
	    }
	

	@Override
	public Optional<Order> get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Order entry) {
		   Database db = new Database();
	        try (Connection c = db.connection()) {
	            PreparedStatement pstmt = c.prepareStatement("Update orders set statuse=? where order_id=?");
	            pstmt.setString(1, entry.getStatus()); 
	            pstmt.setInt(2, entry.getId());
	            pstmt.execute();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		
		
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}


}
