package alhasan.dbms;
import java.sql.*;

public class LibarayDatabaseController {

    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:C://sqlite/SSSIT.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void createNewTable() {
        // SQLite connection string
        String url = "jdbc:sqlite:C://sqlite/SSSIT.db";

        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS employees (\n"
                + " id integer PRIMARY KEY,\n"
                + " name text NOT NULL,\n"
                + " capacity real\n"
                + ");";

        try{
            Connection conn = this.connect();
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void selectAll(String table_name){
        String sql = "SELECT * FROM "+table_name;

        try {
            Connection conn = this.connect();
            Statement stmt  = conn.createStatement();
            ResultSet rs    = stmt.executeQuery(sql);

            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("id") +  "\t" +
                        rs.getString("name") + "\t" +
                        rs.getDouble("capacity"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insertBook(String isdn, String title,int authno,int price,String category,int edition) {
        String sql = "INSERT INTO books(ISDN, Title,AuthNo,Price,Category,Edition) VALUES(?,?,?,?,?,?)";

        try{
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, isdn);
            pstmt.setString(2, title);
            pstmt.setInt(3,authno);
            pstmt.setInt(4,price);
            pstmt.setString(5,category);
            pstmt.setInt(6,edition);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */

}
