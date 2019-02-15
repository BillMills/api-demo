package tableofnuclides;

import java.sql.*;

public class Dblookup {

    private final double price;

    public Dblookup(String name) {

        double p=0.00;

        try(Connection conn = DriverManager.getConnection("jdbc:mariadb://mariadb:3306/demo", "pika", "rosebud");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * from PRODUCTS WHERE name='"+name+"'")){
            
            rs.first();
            System.out.println(rs.getString(1));

            p=Double.parseDouble(rs.getString(1));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        this.price = p;
    }

    public double getPrice() {
        return price;
    }
}