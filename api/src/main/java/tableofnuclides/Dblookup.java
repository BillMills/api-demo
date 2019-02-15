package tableofnuclides;

import java.sql.*;

public class Dblookup {

    private final double price;

    public Dblookup(String name) {

        double p=0.00;

        try {
            // query template
            String query = "SELECT * from PRODUCTS WHERE name=?";
            
            // connect and execute
            Connection conn = DriverManager.getConnection("jdbc:mariadb://mariadb:3306/demo", "pika", "rosebud");
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();

            // extract price
            rs.first();
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